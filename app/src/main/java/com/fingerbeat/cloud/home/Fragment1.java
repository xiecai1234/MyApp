package com.fingerbeat.cloud.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.util.ScreenUtils;
import com.fingerbeat.cloud.BaseFragment;
import com.fingerbeat.cloud.R;
import com.fingerbeat.utilcode.utils.ScreenUtil;


/**
 * 作者：XieCaibao
 * 时间： 2019/4/24
 * 邮箱：825302814@qq.com
 */

public class Fragment1 extends BaseFragment {
    public static final String TITLE = "title";

    public static Fragment1 newInstance(String title) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment1;
    }

    @Override
    protected void initView() {
        super.initView();

    }
}
