package com.example.xyl.photogallery;

import java.util.List;

/**
 * Created by XyL on 2016/5/21.
 * Bean
 */
public class TumblrBean {

    private MetaBean meta;

    private ResponseBean response;

    public MetaBean getMeta() {
        return meta;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public static class MetaBean {
        private int status;
        private String msg;

        public int getStatus() {
            return status;
        }

        public String getMsg() {
            return msg;
        }

    }

    public static class ResponseBean {
        private int total_posts;

        private List<PostsBean> posts;

        public int getTotal_posts() {
            return total_posts;
        }

        public List<PostsBean> getPosts() {
            return posts;
        }

        public static class PostsBean {
            private long id;
            private int timestamp;
            private String caption;

            private List<PhotosBean> photos;

            public long getId() {
                return id;
            }

            public int getTimestamp() {
                return timestamp;
            }

            public String getCaption() {
                return caption;
            }

            public List<PhotosBean> getPhotos() {
                return photos;
            }

            public static class PhotosBean {

                private OriginalSizeBean original_size;

                public OriginalSizeBean getOriginal_size() {
                    return original_size;
                }

                public static class OriginalSizeBean {
                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public int getHeight() {
                        return height;
                    }

                }
            }
        }
    }
}
