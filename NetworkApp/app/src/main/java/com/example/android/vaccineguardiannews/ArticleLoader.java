package com.example.android.vaccineguardiannews;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

//loads the articles using AsyncTask for the network request
public class ArticleLoader extends AsyncTaskLoader<List<Article>> {

    private static final String LOG_TAG = ArticleLoader.class.getName();

    private String mUrl;

    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    public List<Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Article> articles = QueryUtils.fetchArticleData(mUrl);
        return articles;
    }
}