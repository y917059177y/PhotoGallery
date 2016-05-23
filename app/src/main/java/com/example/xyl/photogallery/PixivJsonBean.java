package com.example.xyl.photogallery;

import java.util.List;

/**
 * Created by XyL on 2016/5/21.
 * Pixiv每日排行榜jsonbean
 */
public class PixivJsonBean {

    private String mode;
    private String content;
    private int page;
    private Object prev;
    private int next;
    private String date;
    private String prev_date;
    private Object next_date;
    private int rank_total;

    private List<ContentsBean> contents;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrev_date() {
        return prev_date;
    }

    public void setPrev_date(String prev_date) {
        this.prev_date = prev_date;
    }

    public Object getNext_date() {
        return next_date;
    }

    public void setNext_date(Object next_date) {
        this.next_date = next_date;
    }

    public int getRank_total() {
        return rank_total;
    }

    public void setRank_total(int rank_total) {
        this.rank_total = rank_total;
    }

    public List<ContentsBean> getContents() {
        return contents;
    }

    public void setContents(List<ContentsBean> contents) {
        this.contents = contents;
    }

    public static class ContentsBean {
        private int illust_id;
        private String title;
        private int width;
        private int height;
        private String date;
        private String url;
        private String illust_type;
        private String illust_book_style;
        private String illust_page_count;
        private int illust_upload_timestamp;
        private int user_id;
        private String user_name;
        private String profile_img;
        private int rank;
        private int yes_rank;
        private int total_score;
        private int view_count;

        private IllustContentTypeBean illust_content_type;
        private String attr;
        private List<String> tags;

        public int getIllust_id() {
            return illust_id;
        }

        public void setIllust_id(int illust_id) {
            this.illust_id = illust_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIllust_type() {
            return illust_type;
        }

        public void setIllust_type(String illust_type) {
            this.illust_type = illust_type;
        }

        public String getIllust_book_style() {
            return illust_book_style;
        }

        public void setIllust_book_style(String illust_book_style) {
            this.illust_book_style = illust_book_style;
        }

        public String getIllust_page_count() {
            return illust_page_count;
        }

        public void setIllust_page_count(String illust_page_count) {
            this.illust_page_count = illust_page_count;
        }

        public int getIllust_upload_timestamp() {
            return illust_upload_timestamp;
        }

        public void setIllust_upload_timestamp(int illust_upload_timestamp) {
            this.illust_upload_timestamp = illust_upload_timestamp;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getProfile_img() {
            return profile_img;
        }

        public void setProfile_img(String profile_img) {
            this.profile_img = profile_img;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getYes_rank() {
            return yes_rank;
        }

        public void setYes_rank(int yes_rank) {
            this.yes_rank = yes_rank;
        }

        public int getTotal_score() {
            return total_score;
        }

        public void setTotal_score(int total_score) {
            this.total_score = total_score;
        }

        public int getView_count() {
            return view_count;
        }

        public void setView_count(int view_count) {
            this.view_count = view_count;
        }

        public IllustContentTypeBean getIllust_content_type() {
            return illust_content_type;
        }

        public void setIllust_content_type(IllustContentTypeBean illust_content_type) {
            this.illust_content_type = illust_content_type;
        }

        public String getAttr() {
            return attr;
        }

        public void setAttr(String attr) {
            this.attr = attr;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public static class IllustContentTypeBean {
            private int sexual;
            private boolean lo;
            private boolean grotesque;
            private boolean violent;
            private boolean homosexual;
            private boolean drug;
            private boolean thoughts;
            private boolean antisocial;
            private boolean religion;
            private boolean original;
            private boolean furry;
            private boolean bl;
            private boolean yuri;

            public int getSexual() {
                return sexual;
            }

            public void setSexual(int sexual) {
                this.sexual = sexual;
            }

            public boolean isLo() {
                return lo;
            }

            public void setLo(boolean lo) {
                this.lo = lo;
            }

            public boolean isGrotesque() {
                return grotesque;
            }

            public void setGrotesque(boolean grotesque) {
                this.grotesque = grotesque;
            }

            public boolean isViolent() {
                return violent;
            }

            public void setViolent(boolean violent) {
                this.violent = violent;
            }

            public boolean isHomosexual() {
                return homosexual;
            }

            public void setHomosexual(boolean homosexual) {
                this.homosexual = homosexual;
            }

            public boolean isDrug() {
                return drug;
            }

            public void setDrug(boolean drug) {
                this.drug = drug;
            }

            public boolean isThoughts() {
                return thoughts;
            }

            public void setThoughts(boolean thoughts) {
                this.thoughts = thoughts;
            }

            public boolean isAntisocial() {
                return antisocial;
            }

            public void setAntisocial(boolean antisocial) {
                this.antisocial = antisocial;
            }

            public boolean isReligion() {
                return religion;
            }

            public void setReligion(boolean religion) {
                this.religion = religion;
            }

            public boolean isOriginal() {
                return original;
            }

            public void setOriginal(boolean original) {
                this.original = original;
            }

            public boolean isFurry() {
                return furry;
            }

            public void setFurry(boolean furry) {
                this.furry = furry;
            }

            public boolean isBl() {
                return bl;
            }

            public void setBl(boolean bl) {
                this.bl = bl;
            }

            public boolean isYuri() {
                return yuri;
            }

            public void setYuri(boolean yuri) {
                this.yuri = yuri;
            }
        }
    }
}
