package com.common.eric.module_shop.shop_home.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.common.eric.module_shop.R;

/**
 * Created by Eric on 2018/7/5.
 */

public class ShopHomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.frament_shop_home,container,false);
    }
}
