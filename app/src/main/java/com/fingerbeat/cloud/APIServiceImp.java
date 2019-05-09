package com.fingerbeat.cloud;

import android.app.Activity;

import com.fingerbeat.cloud.base.AppManager;
import com.fingerbeat.cloud.net.api.Api;
import com.fingerbeat.cloud.net.api.HostType;
import com.fingerbeat.cloud.net.rx.RxHelper;
import com.fingerbeat.cloud.net.rx.RxManager;
import com.fingerbeat.cloud.net.rx.RxSubscriber;

public class APIServiceImp {
    private static APIServiceImp mService;
    private static RxManager mRxManager;

    public static APIServiceImp getInstance(RxManager rxManager) {
        if (mService == null) {
            mService = new APIServiceImp();
        }
        mRxManager = rxManager;
        return mService;
    }

    public static APIServiceImp getInstance() {
        if (mService == null) {
            mService = new APIServiceImp();
        }
        Activity activity = AppManager.getAppManager().currentActivity();
        if (activity != null && activity instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activity;
            mRxManager = baseActivity.mRxManager;
        }
        if (mRxManager == null) {
            mRxManager = new RxManager();
        }
        return mService;
    }

    /**
     * 检查版本更新
     * @param subscriber
     */
    public void checkAppUpdateInfo(RxSubscriber<Object> subscriber) {//TODO
        mRxManager.add(Api.getService(HostType.USER)
                .checkAppUpdateInfo()
                .compose(RxHelper.handleIO())
                .compose(RxHelper.handleRespose())
                .subscribeWith(subscriber));
    }

}
