package com.example.xyl.photogallery;

import java.util.List;

/**
 * Created by XyL on 2016/5/21.
 */
public class TumblrBean {
    /**
     * status : 200
     * msg : OK
     */

    private MetaBean meta;

    private ResponseBean response;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class MetaBean {
        private int status;
        private String msg;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class ResponseBean {
        /**
         * title : girlimg student
         * name : girlimg-student
         * total_posts : 5412
         * posts : 5412
         * url : http://girlimg-student.tumblr.com/
         * updated : 1463761808
         * description :
         * is_nsfw : false
         * ask : false
         * ask_page_title : Ask me anything
         * ask_anon : false
         * share_likes : false
         */

        private BlogBean blog;

        private int total_posts;

        private List<PostsBean> posts;

        public BlogBean getBlog() {
            return blog;
        }

        public void setBlog(BlogBean blog) {
            this.blog = blog;
        }

        public int getTotal_posts() {
            return total_posts;
        }

        public void setTotal_posts(int total_posts) {
            this.total_posts = total_posts;
        }

        public List<PostsBean> getPosts() {
            return posts;
        }

        public void setPosts(List<PostsBean> posts) {
            this.posts = posts;
        }

        public static class BlogBean {
            private String title;
            private String name;
            private int total_posts;
            private int posts;
            private String url;
            private int updated;
            private String description;
            private boolean is_nsfw;
            private boolean ask;
            private String ask_page_title;
            private boolean ask_anon;
            private boolean share_likes;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getTotal_posts() {
                return total_posts;
            }

            public void setTotal_posts(int total_posts) {
                this.total_posts = total_posts;
            }

            public int getPosts() {
                return posts;
            }

            public void setPosts(int posts) {
                this.posts = posts;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getUpdated() {
                return updated;
            }

            public void setUpdated(int updated) {
                this.updated = updated;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public boolean isIs_nsfw() {
                return is_nsfw;
            }

            public void setIs_nsfw(boolean is_nsfw) {
                this.is_nsfw = is_nsfw;
            }

            public boolean isAsk() {
                return ask;
            }

            public void setAsk(boolean ask) {
                this.ask = ask;
            }

            public String getAsk_page_title() {
                return ask_page_title;
            }

            public void setAsk_page_title(String ask_page_title) {
                this.ask_page_title = ask_page_title;
            }

            public boolean isAsk_anon() {
                return ask_anon;
            }

            public void setAsk_anon(boolean ask_anon) {
                this.ask_anon = ask_anon;
            }

            public boolean isShare_likes() {
                return share_likes;
            }

            public void setShare_likes(boolean share_likes) {
                this.share_likes = share_likes;
            }
        }

        public static class PostsBean {
            private String blog_name;
            private long id;
            private String post_url;
            private String slug;
            private String type;
            private String date;
            private int timestamp;
            private String state;
            private String format;
            private String reblog_key;
            private String short_url;
            private String summary;
            private Object recommended_source;
            private Object recommended_color;
            private int note_count;
            private String caption;
            /**
             * tree_html :
             * comment : <p><a href="http://www.girlimg.com/photo/c6164a53ea3381537e7190a9856138f4">www.girlimg.com/photo/c6164a53ea3381537e7190a9856138f4</a></p>
             */

            private ReblogBean reblog;
            private String image_permalink;
            private List<String> tags;
            private List<?> highlighted;

            private List<TrailBean> trail;

            private List<PhotosBean> photos;

            public String getBlog_name() {
                return blog_name;
            }

            public void setBlog_name(String blog_name) {
                this.blog_name = blog_name;
            }

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getPost_url() {
                return post_url;
            }

            public void setPost_url(String post_url) {
                this.post_url = post_url;
            }

            public String getSlug() {
                return slug;
            }

            public void setSlug(String slug) {
                this.slug = slug;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(int timestamp) {
                this.timestamp = timestamp;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            public String getReblog_key() {
                return reblog_key;
            }

            public void setReblog_key(String reblog_key) {
                this.reblog_key = reblog_key;
            }

            public String getShort_url() {
                return short_url;
            }

            public void setShort_url(String short_url) {
                this.short_url = short_url;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public Object getRecommended_source() {
                return recommended_source;
            }

            public void setRecommended_source(Object recommended_source) {
                this.recommended_source = recommended_source;
            }

            public Object getRecommended_color() {
                return recommended_color;
            }

            public void setRecommended_color(Object recommended_color) {
                this.recommended_color = recommended_color;
            }

            public int getNote_count() {
                return note_count;
            }

            public void setNote_count(int note_count) {
                this.note_count = note_count;
            }

            public String getCaption() {
                return caption;
            }

            public void setCaption(String caption) {
                this.caption = caption;
            }

            public ReblogBean getReblog() {
                return reblog;
            }

            public void setReblog(ReblogBean reblog) {
                this.reblog = reblog;
            }

            public String getImage_permalink() {
                return image_permalink;
            }

            public void setImage_permalink(String image_permalink) {
                this.image_permalink = image_permalink;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }

            public List<?> getHighlighted() {
                return highlighted;
            }

            public void setHighlighted(List<?> highlighted) {
                this.highlighted = highlighted;
            }

            public List<TrailBean> getTrail() {
                return trail;
            }

            public void setTrail(List<TrailBean> trail) {
                this.trail = trail;
            }

            public List<PhotosBean> getPhotos() {
                return photos;
            }

            public void setPhotos(List<PhotosBean> photos) {
                this.photos = photos;
            }

            public static class ReblogBean {
                private String tree_html;
                private String comment;

                public String getTree_html() {
                    return tree_html;
                }

                public void setTree_html(String tree_html) {
                    this.tree_html = tree_html;
                }

                public String getComment() {
                    return comment;
                }

                public void setComment(String comment) {
                    this.comment = comment;
                }
            }

            public static class TrailBean {

                private BlogBean blog;
                /**
                 * id : 144657564813
                 */

                private PostBean post;
                private String content_raw;
                private String content;
                private boolean is_current_item;
                private boolean is_root_item;

                public BlogBean getBlog() {
                    return blog;
                }

                public void setBlog(BlogBean blog) {
                    this.blog = blog;
                }

                public PostBean getPost() {
                    return post;
                }

                public void setPost(PostBean post) {
                    this.post = post;
                }

                public String getContent_raw() {
                    return content_raw;
                }

                public void setContent_raw(String content_raw) {
                    this.content_raw = content_raw;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public boolean isIs_current_item() {
                    return is_current_item;
                }

                public void setIs_current_item(boolean is_current_item) {
                    this.is_current_item = is_current_item;
                }

                public boolean isIs_root_item() {
                    return is_root_item;
                }

                public void setIs_root_item(boolean is_root_item) {
                    this.is_root_item = is_root_item;
                }

                public static class BlogBean {
                    private String name;
                    private boolean active;
                    /**
                     * avatar_shape : square
                     * background_color : #FAFAFA
                     * body_font : Helvetica Neue
                     * header_bounds :
                     * header_image : https://secure.assets.tumblr.com/images/default_header/optica_pattern_05.png?_v=671444c5f47705cce40d8aefd23df3b1
                     * header_image_focused : https://secure.assets.tumblr.com/images/default_header/optica_pattern_05_focused_v3.png?_v=671444c5f47705cce40d8aefd23df3b1
                     * header_image_scaled : https://secure.assets.tumblr.com/images/default_header/optica_pattern_05_focused_v3.png?_v=671444c5f47705cce40d8aefd23df3b1
                     * header_stretch : true
                     * link_color : #529ECC
                     * show_avatar : true
                     * show_description : true
                     * show_header_image : true
                     * show_title : true
                     * title_color : #444444
                     * title_font : Gibson
                     * title_font_weight : bold
                     */

                    private ThemeBean theme;
                    private boolean share_likes;
                    private boolean share_following;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public boolean isActive() {
                        return active;
                    }

                    public void setActive(boolean active) {
                        this.active = active;
                    }

                    public ThemeBean getTheme() {
                        return theme;
                    }

                    public void setTheme(ThemeBean theme) {
                        this.theme = theme;
                    }

                    public boolean isShare_likes() {
                        return share_likes;
                    }

                    public void setShare_likes(boolean share_likes) {
                        this.share_likes = share_likes;
                    }

                    public boolean isShare_following() {
                        return share_following;
                    }

                    public void setShare_following(boolean share_following) {
                        this.share_following = share_following;
                    }

                    public static class ThemeBean {
                        private String avatar_shape;
                        private String background_color;
                        private String body_font;
                        private String header_bounds;
                        private String header_image;
                        private String header_image_focused;
                        private String header_image_scaled;
                        private boolean header_stretch;
                        private String link_color;
                        private boolean show_avatar;
                        private boolean show_description;
                        private boolean show_header_image;
                        private boolean show_title;
                        private String title_color;
                        private String title_font;
                        private String title_font_weight;

                        public String getAvatar_shape() {
                            return avatar_shape;
                        }

                        public void setAvatar_shape(String avatar_shape) {
                            this.avatar_shape = avatar_shape;
                        }

                        public String getBackground_color() {
                            return background_color;
                        }

                        public void setBackground_color(String background_color) {
                            this.background_color = background_color;
                        }

                        public String getBody_font() {
                            return body_font;
                        }

                        public void setBody_font(String body_font) {
                            this.body_font = body_font;
                        }

                        public String getHeader_bounds() {
                            return header_bounds;
                        }

                        public void setHeader_bounds(String header_bounds) {
                            this.header_bounds = header_bounds;
                        }

                        public String getHeader_image() {
                            return header_image;
                        }

                        public void setHeader_image(String header_image) {
                            this.header_image = header_image;
                        }

                        public String getHeader_image_focused() {
                            return header_image_focused;
                        }

                        public void setHeader_image_focused(String header_image_focused) {
                            this.header_image_focused = header_image_focused;
                        }

                        public String getHeader_image_scaled() {
                            return header_image_scaled;
                        }

                        public void setHeader_image_scaled(String header_image_scaled) {
                            this.header_image_scaled = header_image_scaled;
                        }

                        public boolean isHeader_stretch() {
                            return header_stretch;
                        }

                        public void setHeader_stretch(boolean header_stretch) {
                            this.header_stretch = header_stretch;
                        }

                        public String getLink_color() {
                            return link_color;
                        }

                        public void setLink_color(String link_color) {
                            this.link_color = link_color;
                        }

                        public boolean isShow_avatar() {
                            return show_avatar;
                        }

                        public void setShow_avatar(boolean show_avatar) {
                            this.show_avatar = show_avatar;
                        }

                        public boolean isShow_description() {
                            return show_description;
                        }

                        public void setShow_description(boolean show_description) {
                            this.show_description = show_description;
                        }

                        public boolean isShow_header_image() {
                            return show_header_image;
                        }

                        public void setShow_header_image(boolean show_header_image) {
                            this.show_header_image = show_header_image;
                        }

                        public boolean isShow_title() {
                            return show_title;
                        }

                        public void setShow_title(boolean show_title) {
                            this.show_title = show_title;
                        }

                        public String getTitle_color() {
                            return title_color;
                        }

                        public void setTitle_color(String title_color) {
                            this.title_color = title_color;
                        }

                        public String getTitle_font() {
                            return title_font;
                        }

                        public void setTitle_font(String title_font) {
                            this.title_font = title_font;
                        }

                        public String getTitle_font_weight() {
                            return title_font_weight;
                        }

                        public void setTitle_font_weight(String title_font_weight) {
                            this.title_font_weight = title_font_weight;
                        }
                    }
                }

                public static class PostBean {
                    private String id;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }

            public static class PhotosBean {
                private String caption;

                private OriginalSizeBean original_size;

                private List<AltSizesBean> alt_sizes;

                public String getCaption() {
                    return caption;
                }

                public void setCaption(String caption) {
                    this.caption = caption;
                }

                public OriginalSizeBean getOriginal_size() {
                    return original_size;
                }

                public void setOriginal_size(OriginalSizeBean original_size) {
                    this.original_size = original_size;
                }

                public List<AltSizesBean> getAlt_sizes() {
                    return alt_sizes;
                }

                public void setAlt_sizes(List<AltSizesBean> alt_sizes) {
                    this.alt_sizes = alt_sizes;
                }

                public static class OriginalSizeBean {
                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class AltSizesBean {
                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }
            }
        }
    }
}
