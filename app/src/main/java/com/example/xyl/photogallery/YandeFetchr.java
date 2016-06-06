package com.example.xyl.photogallery;

import android.net.Uri;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
 * 获取Yande上的图片
 */
public class YandeFetchr {

    public static final int YANDE_POSTS = 0;
    public static final int YANDE_SEARCH = 1;

    private static final String TAG = "YandeFetchr";

    public byte[] getUrlBytes(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.79 Safari/537.36");

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

    public List<GalleryItem> fetchRecentPhotos(int picNum) {
        String url = buildUrl(YANDE_POSTS, null, picNum);
        return downloadGalleryItems(url);
    }

    public List<GalleryItem> searchPhotos(String query) {
        String url = buildUrl(YANDE_SEARCH, query, 0);
        return downloadGalleryItems(url);
    }

    private String buildUrl(int method, String query, int picNum) {
        String url = null;

        if (method == YANDE_SEARCH) {
            url = Uri
                    .parse("https://yande.re/post.json")
                    .buildUpon()
                    .appendQueryParameter("tag", query)
                    .build()
                    .toString();

        } else if (method == YANDE_POSTS) {
            url = Uri
                    .parse("https://yande.re/post.json")
                    .buildUpon()
                    .appendQueryParameter("limit", String.valueOf(picNum))
                    .build()
                    .toString();
        }
        return url;
    }

    private List<GalleryItem> downloadGalleryItems(String url) {
        List<GalleryItem> items = new ArrayList<>();

        try {
            String jsonString = getUrlString(url);
            Log.i(TAG, "Received JSON: " + jsonString);

            parseItems(items, jsonString);
        } catch (IOException | JSONException e) {
            Log.e(TAG, "Failed to fetch items", e);
        }

        return items;
    }

    private void parseItems(List<GalleryItem> items, String jsonString) throws JSONException {

        Gson gson = new Gson();

        List<YandeJsonBean> yandeJsonBeans = gson
                .fromJson(jsonString, new TypeToken<List<YandeJsonBean>>() {
                }.getType());

        for (YandeJsonBean yandeJsonBean : yandeJsonBeans) {
            GalleryItem item = new GalleryItem();
            item.setId(String.valueOf(yandeJsonBean.getId()));
            item.setCaption(yandeJsonBean.getAuthor());
            String url = yandeJsonBean.getPreview_url();
            if (url == null) {
                continue;
            }
            item.setUrl(url);

            items.add(item);
        }
    }

}
