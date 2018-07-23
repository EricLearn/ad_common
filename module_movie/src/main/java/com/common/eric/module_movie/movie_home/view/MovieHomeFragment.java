package com.common.eric.module_movie.movie_home.view;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.common.eric.ec_common.base.BaseFragment;
import com.common.eric.ec_common.http.ResultModel;
import com.common.eric.module_movie.R;
import com.common.eric.module_movie.movie_home.presenter.MovieHomeContract;
import com.common.eric.module_movie.movie_home.presenter.MovieHomePresenter;

/**
 * Created by Eric on 2018/7/5.
 */

public class MovieHomeFragment extends BaseFragment implements MovieHomeContract.View {

    private static String TAG = MovieHomeFragment.class.getName();

    private MovieHomeContract.Presenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.fragment_movie_home,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button bt = view.findViewById(R.id.start_bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadBookshelfData();
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new MovieHomePresenter(activity,this);

        Log.d(TAG,"创建activity");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(MovieHomeFragment.class.getName(),"获取activity");
    }

    @Override
    public void setPresenter(MovieHomeContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void startLoadData(Object tag) {
        Log.d(TAG,"开始加载" + tag);
    }

    @Override
    public void loadDataFinish(Object tag, ResultModel result) {
        Log.d(TAG,"加载完成" + tag);
    }
}
