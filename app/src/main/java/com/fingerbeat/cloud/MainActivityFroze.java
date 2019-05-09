package com.fingerbeat.cloud;

import android.graphics.Color;

import com.fingerbeat.cloud.home.Fragment1;
import com.fingerbeat.cloud.home.Fragment2;
import com.fingerbeat.cloud.home.Fragment3;
import com.fingerbeat.cloud.home.Fragment4;
import com.fingerbeat.cloud.home.Fragment5;
import com.gyf.immersionbar.ImmersionBar;
import com.ycl.tabview.library.TabView;
import com.ycl.tabview.library.TabViewChild;
import com.ycl.tabview.library.TabViewUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


public class MainActivityFroze extends BaseActivity {


    List<TabViewChild> tabViewChildList = new ArrayList<>();
    @BindView(R.id.tabView)
    TabView tabView;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main_froze;
    }

    @Override
    protected void initView() {
        super.initView();
        ImmersionBar.with(this).statusBarColorInt(Color.TRANSPARENT);
        loadView();
    }

    /**
     * 初始化组件
     */
    protected void loadView() {

        tabViewChildList.add(new TabViewChild(R.mipmap.tab_btn_home_selected, R.mipmap.tab_btn_home_normal, getString(R.string.home_page),
                Fragment1.newInstance(getString(R.string.home_page))));
        tabViewChildList.add(new TabViewChild(R.mipmap.tab_btn_me_select, R.mipmap.tab_btn_me_normal, getString(R.string.my),
                Fragment2.newInstance(getString(R.string.my))));
        tabViewChildList.add(new TabViewChild(R.mipmap.tab_btn_me_select, R.mipmap.tab_btn_me_normal, getString(R.string.my),
                Fragment3.newInstance(getString(R.string.my))));
        tabViewChildList.add(new TabViewChild(R.mipmap.tab_btn_me_select, R.mipmap.tab_btn_me_normal, getString(R.string.my),
                Fragment4.newInstance(getString(R.string.my))));
        tabViewChildList.add(new TabViewChild(R.mipmap.tab_btn_me_select, R.mipmap.tab_btn_me_normal, getString(R.string.my),
                Fragment5.newInstance(getString(R.string.my))));

        tabView.setImageViewHeight(TabViewUtil.dp2px(this, 23));
        tabView.setImageViewWidth(TabViewUtil.dp2px(this, 23));
        tabView.setTextViewSize(12);
        tabView.setTabViewHeight(TabViewUtil.dp2px(this, 50));
        tabView.setTabViewDefaultPosition(0);
        tabView.setTextViewSelectedColor(getResources().getColor(R.color.colorPrimary));
        tabView.setTextViewUnSelectedColor(Color.GREEN);
        tabView.setTabViewChild(tabViewChildList, getSupportFragmentManager());
    }

}
