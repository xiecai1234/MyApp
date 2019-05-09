package com.fingerbeat.cloud;

import android.content.Context;

import com.fingerbeat.cloud.util.CommFun;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * 作者：XieCaibao
 * 时间： 2019/5/4
 * 邮箱：825302814@qq.com
 */
public class App extends BaseApplication{
    //hotfix init need attr
    @Override
    public void onCreate() {
        super.onCreate();

        Context context = getApplicationContext();
// 获取当前包名
        String packageName = context.getPackageName();
// 获取当前进程名
        String processName = CommFun.getProcessName(android.os.Process.myPid());
// 设置是否为上报进程
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(context);
        strategy.setUploadProcess(processName == null || processName.equals(packageName));

        CrashReport.initCrashReport(getApplicationContext(), "b222dc9178", BuildConfig.DEBUG, strategy);
    }



}
