package com.XuanRan.BottomTest;

import android.app.Application;

import com.XuanRan.Exception.Handing.CrashHandler;

/**
 * Created By XuanRan on 2020/11/12
 */
public class XuanRanApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.init(this,"");
    }
}
