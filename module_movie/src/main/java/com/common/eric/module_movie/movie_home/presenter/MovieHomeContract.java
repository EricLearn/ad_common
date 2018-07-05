package com.common.eric.module_movie.movie_home.presenter;

import com.common.eric.ec_common.http.ResultModel;

/**
 * Created by Eric on 2018/7/5.
 */

public interface MovieHomeContract {

    interface View {
        void setPresenter(Presenter presenter);

        void startLoadData(Object tag);
        void loadDataFinish(Object tag, ResultModel result);
    }

    interface Presenter {

        void loadBookshelfData();
        void deleteBook();

        void cancelTask();
    }
}
