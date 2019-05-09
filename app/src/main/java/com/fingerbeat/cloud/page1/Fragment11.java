package com.fingerbeat.cloud.page1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fingerbeat.cloud.base.mvp.BaseMvpFragment;
import com.fingerbeat.cloud.base.mvp.BasePresenter;


/**
 * 作者：XieCaibao
 * 时间： 2019/4/24
 * 邮箱：825302814@qq.com
 */

public class Fragment11 extends BaseMvpFragment {
    public static final String TITLE = "title";

    public static Fragment11 newInstance(String title) {
        Fragment11 fragment = new Fragment11();
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
