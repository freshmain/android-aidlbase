package com.android.wy.aidltest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * @author 伍易科技
 * @description:
 * @date :2019/6/5 14:25
 */
public class ServiceTest extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("ServiceTest","  ----->  IBinder");
        return null;
    }

    @Override
     public void onCreate() {
         super.onCreate();
         Log.d("ServiceTest","  ----->  onCreate");
     }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("ServiceTest","  ----->  onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("ServiceTest","  ----->  onDestroy");
    }
}
