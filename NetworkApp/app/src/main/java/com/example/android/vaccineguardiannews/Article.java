package com.example.android.vaccineguardiannews;

public class Article {

    /**
     * Author of the article
     */
    private String mAuthorArt;

    /**
     * Section of the article
     */
    private String mSectionArt;
    /**
     * Title of the article
     */
    private String mTitleArt;
    /**
     * Time of the article
     */
    private String mTimeArt;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    public Article(String sectionArt, String authorArt, String titleArt, String timeArt, String url) {
        mAuthorArt = authorArt;
        mSectionArt = sectionArt;
        mTitleArt = titleArt;
        mTimeArt = timeArt;
        mUrl = url;
    }

    public String getAuthor() {
        return mAuthorArt;
    }

    public String getSection() {
        return mSectionArt;
    }

    public String getTitle() {
        return mTitleArt;
    }

    public String getTime() {
        return mTimeArt;
    }

    public String getUrl() {
        return mUrl;
    }

}