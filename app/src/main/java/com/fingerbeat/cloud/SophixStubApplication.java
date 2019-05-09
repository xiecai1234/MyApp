package com.fingerbeat.cloud;


/**
 * 作者：XieCaibao
 * 时间： 2019/5/4
 * 邮箱：825302814@qq.com
 */
import com.taobao.sophix.SophixApplication;
import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.SophixEntry;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.PatchLoadStatusListener;
/**
 * Sophix入口类，专门用于初始化Sophix，不应包含任何业务逻辑。
 * 此类必须继承自SophixApplication，onCreate方法不需要实现。
 * 此类不应与项目中的其他类有任何互相调用的逻辑，必须完全做到隔离。
 * AndroidManifest中设置application为此类，而SophixEntry中设为原先Application类。
 * 注意原先Application里不需要再重复初始化Sophix，并且需要避免混淆原先Application类。
 * 如有其它自定义改造，请咨询官方后妥善处理。
 */
public class SophixStubApplication extends SophixApplication {
    private final String TAG = "SophixStubApplication";
    // 此处SophixEntry应指定真正的Application，并且保证RealApplicationStub类名不被混淆。
    @Keep
    @SophixEntry(App.class)
    static class RealApplicationStub {}
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//         如果需要使用MultiDex，需要在此处调用。
//         MultiDex.install(this);
        initSophix();
    }
    private void initSophix() {
        String appVersion = "1.2";
        try {
            appVersion = this.getPackageManager()
                    .getPackageInfo(this.getPackageName(), 0)
                    .versionName;
        } catch (Exception e) {
        }
        String rsa = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCB7VcH45EPq7xc6zjMCZPp3goP" +
                "VvLKBKMtTtTfWoqE5BLXnv2mzEl7qOgyR0vlc/JlilgOcAekdmv3AJK/U0SSEp5jV++Pv2" +
                "Tgo+reLdmBkoPdVaGLTniaSi6+AzqavEEliyDSvk5vjIECT036tD1fHhAt4TEHOerwoTKh7OSm+" +
                "o6ZZKaMWs4UGBUaqzEI/e/X9sxrHFJUBpyO7GDs6KZoxITFjSBtOSUfHWwZhez/qojtPFBCP/LSyRy+hL/a" +
                "EJPEY4BxY2c2jg7V0mbeumzIklC7+ROJQd4GpOENGhv4FSYLbzvO6aYThyiK0j4ewP5/AMiCFKqrA0nfG0z3MFbDA" +
                "gMBAAECggEAXM8K4gm+bzE/pigoNCeLTv1atkZnu8LARPcQvFNSq0a35uodSm6W9wxagL/JCShfuASwje+cpfApgxEX" +
                "wi9axfUiytffuhD/oC+27+pUemgMZahrcrUlFSF0biqkTC+5YXYWhjOGl8wHw3yeuTzSsgUpjXxUp1LJ7gVXw68STeucLTDH/" +
                "FupWF2NrVFwMQksEKDDJLTohe/HkAikrYSgZwY4ItWk2oyOSu3HbbogGiJ3OfhYkzMT+H9BkjGlh3YGHJZTGjBNTQ" +
                "hwlb2GGg+FYVhE6NGZyHWGHdDjJb9FJ3Ya8ukWaVWhm0LB/uY3NfhnoUFRMDTI97MOKJRcFecnYQKBgQC37qCvn1Y6ux" +
                "3bM+N+MIg2m0G/xsKwPnSQjzsoHHnGB7vAsTrt1zUldGDm5bQEvU2oT4qejpY63d/B6lBn8CLWsj3oUCmRP7c96/oAYSIHm" +
                "OEgLK+aRGCvpDDwcGyjMT432xR1Fa0tU7burUHsoQWCJfwPSkzrbW4ZX23yD5Y9awKBgQC01bhrcPwDe8NHait9VCYTN1J" +
                "d8yZz4dZZvUKq+QB618A53/090S/+RRPZeVON4BHdXYeYVKfwvk7OG1pwKm/bcHbba/YE1Rx0EbLjPTkHT2ZvQUhBpMc" +
                "z8bLrk9w2DsD0uT2ZruD1HmpivRGt6vjjPnKSQJh13LyE8c0GVAYKCQKBgQCm6/T/7QaAflf2Gv0WBE1Z4USmGmeNMuDu" +
                "YE47dLw+r74AfdcRCgG9YAShB018D6BuYuFWS+iiu8DZZyBZc2Dqnw/3yOgwXTabB5D2zy/m3SNR47vpsKxeOg//5Mdywr" +
                "nITxYdu/JR9GtL6AiwCuHI31gFOFTeQ41rkWNiDis2yQKBgCJsCEXTZPVYyqw+Znbd3L2Nq00c6rXmSEIex6D58wBvLzUV" +
                "EQSCXEtfZM7hzGjWPTBRDG2Pt8QYxbFv/YAaY952gvlzjIoQ8vCZKd8dmUxt7cbBu3pbXlvh5zf2llVn64zp8fLeGg4us" +
                "vuGl+XuM2A2U+LJDvxofy4jRO6ucdPZAoGBAIrdEoLCI35DsCrNiMtPiDHyQpWfpB6nncexMPw/1+kTeN9a1hfjhuPCFusGE" +
                "MasdHkYu/43sbv2LgxYE/djVjC7OeAb0YmFL9UiqBxDdzcTC5hGi+fhQ51quQLUnmy7wlFUVIAuoKzY78pczf13xeFdXlEV6ifByPMYfVqbNzjg";
        final SophixManager instance = SophixManager.getInstance();
        instance.setContext(this)
                .setAppVersion(appVersion)
                .setSecretMetaData("26047632", "6a3a491251003d32a8e3b315d8205108", rsa)//TODO AppKey  AppSecret  RSA
                //TODO 查看日志过滤TAG:Sophix, 同时强制不对补丁进行签名校验. 正式发布该参数必须为false
                .setEnableDebug(true)
                .setEnableFullLog()
                .setPatchLoadStatusStub(new PatchLoadStatusListener() {
                    @Override
                    public void onLoad(final int mode, final int code, final String info, final int handlePatchVersion) {
                        if (code == PatchStatus.CODE_LOAD_SUCCESS) {
                            Log.e(TAG, "sophix load patch success!");
                        } else if (code == PatchStatus.CODE_LOAD_RELAUNCH) {
                            // 如果需要在后台重启，建议此处用SharePreference保存状态。
                            Log.e(TAG, "sophix preload patch success. restart app to make effect.");
                        }
                    }
                }).initialize();
    }

    @Override
    public void onCreate() {
        super.onCreate();
//        SophixManager.getInstance().queryAndLoadNewPatch();
    }
}
