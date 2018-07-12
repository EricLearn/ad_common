package com.common.eric.module_movie.movie_home.presenter;

import android.content.Context;

import com.common.eric.ec_common.http.HttpClient;
import com.common.eric.ec_common.http.ResultModel;
import com.common.eric.ec_common.http.TaskCallback;
import com.common.eric.module_movie.Constants;
import com.common.eric.module_movie.movie_home.model.MovieHomeBean;

/**
 * Created by Eric on 2018/7/5.
 */

public class MovieHomePresenter implements MovieHomeContract.Presenter,TaskCallback {

    private Context context;
    private MovieHomeContract.View view;

    public MovieHomePresenter(Context context, MovieHomeContract.View view){
        super();
        this.context = context;
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void loadBookshelfData() {
        new HttpClient.Builder()
                .baseUrl(Constants.MODULE_MOVIE_BASE_URL)
                .setParseClass(MovieHomeBean.class)
                .build()
                .start(this,Constants.MODULE_MOVIE_MovieTop250_TaskTag);
    }

    @Override
    public void deleteBook() {

    }

    @Override
    public void cancelTask() {

    }

    @Override
    public void taskStart(Object tag) {
        view.startLoadData(tag);
    }

    @Override
    public void taskFinish(Object tag, ResultModel result) {
        view.loadDataFinish(tag,result);
    }
}
