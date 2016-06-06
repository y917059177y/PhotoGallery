package com.example.xyl.photogallery;

import java.util.List;

/**
 * Created by XyL on 2016/6/5.
 * yande.re返回的JSON的Bean
 */
public class YandeJsonBean {

    private int id;
    private String tags;
    private int created_at;
    private int creator_id;
    private String author;
    private int change;
    private String source;
    private int score;
    private String md5;
    private int file_size;
    private String file_url;
    private boolean is_shown_in_index;
    private String preview_url;
    private int preview_width;
    private int preview_height;
    private int actual_preview_width;
    private int actual_preview_height;
    private String sample_url;
    private int sample_width;
    private int sample_height;
    private int sample_file_size;
    private String jpeg_url;
    private int jpeg_width;
    private int jpeg_height;
    private int jpeg_file_size;
    private String rating;
    private boolean has_children;
    private Object parent_id;
    private String status;
    private int width;
    private int height;
    private boolean is_held;
    private String frames_pending_string;
    private String frames_string;
    private FlagDetailBean flag_detail;
    private List<?> frames_pending;
    private List<?> frames;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public int getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(int creator_id) {
        this.creator_id = creator_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public int getFile_size() {
        return file_size;
    }

    public void setFile_size(int file_size) {
        this.file_size = file_size;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public boolean isIs_shown_in_index() {
        return is_shown_in_index;
    }

    public void setIs_shown_in_index(boolean is_shown_in_index) {
        this.is_shown_in_index = is_shown_in_index;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    public int getPreview_width() {
        return preview_width;
    }

    public void setPreview_width(int preview_width) {
        this.preview_width = preview_width;
    }

    public int getPreview_height() {
        return preview_height;
    }

    public void setPreview_height(int preview_height) {
        this.preview_height = preview_height;
    }

    public int getActual_preview_width() {
        return actual_preview_width;
    }

    public void setActual_preview_width(int actual_preview_width) {
        this.actual_preview_width = actual_preview_width;
    }

    public int getActual_preview_height() {
        return actual_preview_height;
    }

    public void setActual_preview_height(int actual_preview_height) {
        this.actual_preview_height = actual_preview_height;
    }

    public String getSample_url() {
        return sample_url;
    }

    public void setSample_url(String sample_url) {
        this.sample_url = sample_url;
    }

    public int getSample_width() {
        return sample_width;
    }

    public void setSample_width(int sample_width) {
        this.sample_width = sample_width;
    }

    public int getSample_height() {
        return sample_height;
    }

    public void setSample_height(int sample_height) {
        this.sample_height = sample_height;
    }

    public int getSample_file_size() {
        return sample_file_size;
    }

    public void setSample_file_size(int sample_file_size) {
        this.sample_file_size = sample_file_size;
    }

    public String getJpeg_url() {
        return jpeg_url;
    }

    public void setJpeg_url(String jpeg_url) {
        this.jpeg_url = jpeg_url;
    }

    public int getJpeg_width() {
        return jpeg_width;
    }

    public void setJpeg_width(int jpeg_width) {
        this.jpeg_width = jpeg_width;
    }

    public int getJpeg_height() {
        return jpeg_height;
    }

    public void setJpeg_height(int jpeg_height) {
        this.jpeg_height = jpeg_height;
    }

    public int getJpeg_file_size() {
        return jpeg_file_size;
    }

    public void setJpeg_file_size(int jpeg_file_size) {
        this.jpeg_file_size = jpeg_file_size;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isHas_children() {
        return has_children;
    }

    public void setHas_children(boolean has_children) {
        this.has_children = has_children;
    }

    public Object getParent_id() {
        return parent_id;
    }

    public void setParent_id(Object parent_id) {
        this.parent_id = parent_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public boolean isIs_held() {
        return is_held;
    }

    public void setIs_held(boolean is_held) {
        this.is_held = is_held;
    }

    public String getFrames_pending_string() {
        return frames_pending_string;
    }

    public void setFrames_pending_string(String frames_pending_string) {
        this.frames_pending_string = frames_pending_string;
    }

    public String getFrames_string() {
        return frames_string;
    }

    public void setFrames_string(String frames_string) {
        this.frames_string = frames_string;
    }

    public FlagDetailBean getFlag_detail() {
        return flag_detail;
    }

    public void setFlag_detail(FlagDetailBean flag_detail) {
        this.flag_detail = flag_detail;
    }

    public List<?> getFrames_pending() {
        return frames_pending;
    }

    public void setFrames_pending(List<?> frames_pending) {
        this.frames_pending = frames_pending;
    }

    public List<?> getFrames() {
        return frames;
    }

    public void setFrames(List<?> frames) {
        this.frames = frames;
    }

    public static class FlagDetailBean {
        private int post_id;
        private String reason;
        private String created_at;
        private Object user_id;
        private String flagged_by;

        public int getPost_id() {
            return post_id;
        }

        public void setPost_id(int post_id) {
            this.post_id = post_id;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public Object getUser_id() {
            return user_id;
        }

        public void setUser_id(Object user_id) {
            this.user_id = user_id;
        }

        public String getFlagged_by() {
            return flagged_by;
        }

        public void setFlagged_by(String flagged_by) {
            this.flagged_by = flagged_by;
        }
    }
}
