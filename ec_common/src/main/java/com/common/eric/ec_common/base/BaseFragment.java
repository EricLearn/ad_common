package com.common.eric.ec_common.base;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

/**
 * Created by Eric on 2018/7/10.
 */

public class BaseFragment extends Fragment {

    protected Activity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity) activity = (Activity) context;
    }
}
