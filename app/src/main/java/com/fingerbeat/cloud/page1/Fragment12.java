package com.fingerbeat.cloud.page1;

import android.os.Bundle;

import com.fingerbeat.cloud.base.mvp.BaseMvpFragment;
import com.fingerbeat.cloud.base.mvp.BasePresenter;


/**
 * 作者：XieCaibao
 * 时间： 2019/4/24
 * 邮箱：825302814@qq.com
 */

public class Fragment12 extends BaseMvpFragment {
    public static final String TITLE = "title";

    public static Fragment12 newInstance(String title) {
        Fragment12 fragment = new Fragment12();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutResource() {
        return 0;
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }
}
