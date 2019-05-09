package com.fingerbeat.cloud.home;

import android.os.Bundle;

import com.fingerbeat.cloud.BaseFragment;
import com.fingerbeat.cloud.R;

/**
 * 作者：XieCaibao
 * 时间： 2019/4/24
 * 邮箱：825302814@qq.com
 */

public class Fragment3 extends BaseFragment {
    public static final String TITLE = "title";

    public static Fragment3 newInstance(String title) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment3;
    }

}
