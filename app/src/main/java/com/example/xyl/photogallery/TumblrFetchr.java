package com.example.xyl.photogallery;

import android.net.Uri;
import android.util.Log;

import com.example.xyl.photogallery.TumblrBean.ResponseBean.PostsBean;
import com.google.gson.Gson;

import org.json.JSONException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by XyL on 2016/5/21.
 * 获取Tumblr上的图片
 */
public class TumblrFetchr {

    private static final String TAG = "TumblrFetchr";

    private static final String API_KEY = "nVwzDJwgBu9shFQQ5IqrDNMtNtEbACaUSahq0K34yMTWt2Ltqd";

    public byte[] getUrlBytes(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            InputStream in = connection.getInputStream();

            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new IOException(connection.getResponseMessage() + ": with " + urlSpec);
            }

            int bytesRead = 0;
            byte[] buffer = new byte[1024];
            while ((bytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesRead);
            }
            out.close();
            return out.toByteArray();
        } finally {
            connection.disconnect();
        }
    }

    public String getUrlString(String urlSpec) throws IOException {
        return new String(getUrlBytes(urlSpec));
    }

    public List<GalleryItem> fetchItems(int picNum) {

        List<GalleryItem> items = new ArrayList<>();

        for (int i = 0; i < picNum / 20; i++) {
            try {
                String url = Uri
                        .parse("https://api.tumblr.com/v2/blog/girlimg-student.tumblr.com/posts/photo")
                        .buildUpon()
                        .appendQueryParameter("api_key", API_KEY)
                        // 从第xxx张图开始
                        .appendQueryParameter("offset", String.valueOf(i * 20))
                        .build().toString();
                String jsonString = getUrlString(url);
                Log.i(TAG, "Received JSON: " + jsonString);

                parseItems(items, jsonString);
            } catch (IOException e) {
                Log.e(TAG, "Failed to fetch items", e);
            } catch (JSONException e) {
                Log.e(TAG, "Failed to parse JSON", e);
            }
        }

        return items;
    }

    private void parseItems(List<GalleryItem> items, String jsonString) throws JSONException {

        Gson gson = new Gson();
        TumblrBean tumblrBean = gson.fromJson(jsonString, TumblrBean.class);

        List<PostsBean> postsBeans = tumblrBean.getResponse().getPosts();

        for (int i = 0; i < postsBeans.size(); i++) {
            PostsBean postsBean = postsBeans.get(i);
            GalleryItem item = new GalleryItem();
            item.setId(String.valueOf(postsBean.getId()));
            item.setCaption(postsBean.getCaption());
            String url = postsBean.getPhotos().get(0).getOriginal_size().getUrl();
            if (url == null) {
                continue;
            }
            item.setUrl(url);

            items.add(item);
        }
    }
}
