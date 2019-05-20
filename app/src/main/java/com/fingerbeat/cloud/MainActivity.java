package com.fingerbeat.cloud;

import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;

import com.blankj.utilcode.util.LogUtils;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.gyf.immersionbar.ImmersionBar;


public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        ImmersionBar.with(this).statusBarColorInt(Color.TRANSPARENT);
//        loadView();
//        test();
    }

    /**
     * 初始化组件
     */
    protected void loadView() {
//        ToastUtils.showShort("222222222");
    }


    private void test() {
        new IntentIntegrator(this).initiateScan();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                LogUtils.e("link:" + result.getContents());
                Toast.makeText(this, "Scanned: " + result.getContents(), Toast.LENGTH_LONG).show();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
