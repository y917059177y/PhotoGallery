package com.example.xyl.photogallery;

import android.net.Uri;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

    public List<GalleryItem> fetchItems() {

        List<GalleryItem> items = new ArrayList<>();

        try {
            String url = Uri
                    .parse("https://api.tumblr.com/v2/blog/girlimg-student.tumblr.com/posts/photo")
                    .buildUpon()
                    .appendQueryParameter("api_key", API_KEY)
                    .build().toString();
            String jsonString = getUrlString(url);
            Log.i(TAG, "Received JSON: " + jsonString);

            JSONObject jsonBody = new JSONObject(jsonString);

            parseItems(items, jsonBody);
        } catch (IOException e) {
            Log.e(TAG, "Failed to fetch items", e);
        } catch (JSONException e) {
            Log.e(TAG, "Failed to parse JSON", e);
        }

        return items;
    }

    private void parseItems(List<GalleryItem> items, JSONObject jsonBody) throws JSONException {
        JSONObject responseJsonObject = jsonBody.getJSONObject("response");
        JSONArray postsJsonArray = responseJsonObject.getJSONArray("posts");
        for (int i = 0; i < postsJsonArray.length(); i++) {
            JSONObject photoJsonObject = postsJsonArray.getJSONObject(i);

            GalleryItem item = new GalleryItem();
            item.setId(photoJsonObject.getString("id"));
            item.setCaption(photoJsonObject.getString("caption"));

            JSONObject originalSizeJsonObject = photoJsonObject.getJSONArray("photos")
                    .getJSONObject(0)
                    .getJSONObject("original_size");
            if (!originalSizeJsonObject.has("url")) {
                continue;
            }
            item.setUrl(originalSizeJsonObject.getString("url"));
            items.add(item);
        }
    }
}
