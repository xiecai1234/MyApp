package com.fingerbeat.cloud.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fingerbeat.cloud.BaseFragment;
import com.fingerbeat.cloud.R;

/**
 * 作者：XieCaibao
 * 时间： 2019/4/24
 * 邮箱：825302814@qq.com
 */

public class Fragment2 extends BaseFragment {
    public static final String TITLE = "title";

    public static Fragment2 newInstance(String title) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment2;
    }

}
