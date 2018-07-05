package com.common.eric.module_main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.common.eric.ec_common.base.BaseActivity;
import com.common.eric.module_main.frame.view.BottomBar;
import com.common.eric.module_movie.movie_home.view.MovieHomeFragment;
import com.common.eric.module_shop.shop_home.view.ShopHomeFragment;

/**
 * Created by Eric on 2018/7/5.
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.container_fl)
                .setTitleBeforeAndAfterColor("#999999","#ff5d5e")
                .addItem(MovieHomeFragment.class,
                        "电影", R.drawable.item1_before, R.drawable.item1_after)
                .addItem(ShopHomeFragment.class,
                        "商城", R.drawable.item2_before, R.drawable.item2_after)
                .addItem(MovieHomeFragment.class,
                        "个人", R.drawable.item3_before, R.drawable.item3_after)
                .build();

    }
}
