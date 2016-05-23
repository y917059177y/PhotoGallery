package com.example.xyl.photogallery;

import android.net.Uri;
import android.util.Log;

import com.example.xyl.photogallery.PixivJsonBean.ContentsBean;
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
public class PixivFetchr {

    private static final String TAG = "PixivFetchr";

    public static final String ROOT_URL = "http://www.pixiv.net/ranking.php";
    public static final String USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36";

    public byte[] getUrlBytes(String urlSpec) throws IOException {
        URL url = new URL(urlSpec);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", USER_AGENT);
        connection.setDoInput(true);
        connection.setRequestMethod("GET");

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

    public List<GalleryItem> fetchItems() {

        List<GalleryItem> items = new ArrayList<>();

        try {
            String url = Uri
                    .parse(ROOT_URL)
                    .buildUpon()
                    .appendQueryParameter("mode", "daily")
                    .appendQueryParameter("content", "illust")
                    .appendQueryParameter("p", "1")
                    .appendQueryParameter("format", "json")
                    .build().toString();
            String jsonString = getUrlString(url);
            Log.i(TAG, "Received JSON: " + jsonString);

            parseItems(items, jsonString);
        } catch (IOException e) {
            Log.e(TAG, "Failed to fetch items", e);
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse JSON", e);
        }

        return items;
    }

    private void parseItems(List<GalleryItem> items, String jsonString) throws JSONException {

        Gson gson = new Gson();
        PixivJsonBean pixivJsonBean = gson.fromJson(jsonString, PixivJsonBean.class);

        List<ContentsBean> contentsBeans = pixivJsonBean.getContents();

        for (int i = 0; i < contentsBeans.size(); i++) {
            ContentsBean contentsBean = contentsBeans.get(i);
            GalleryItem item = new GalleryItem();
            item.setId(String.valueOf(contentsBean.getIllust_id()));
            item.setCaption(contentsBean.getTitle());
            String url = contentsBean.getUrl();
            if (url == null) {
                continue;
            }
            item.setUrl(url);

            items.add(item);
        }
    }
}
