package com.android.wy.aidltest.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MyService extends Service {

    @Override
    public void onCreate() {
        Log.i("AidlServer" , "onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("AidlServer" , "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.i("AidlServer" , "onBind");
        return new MyBind();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("AidlServer" , "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("AidlServer" , "onDestroy");
    }

    class MyBind extends IMyAidlService.Stub {
        @Override
        public String getString() throws RemoteException {
            return "我是大猪！哼哼哼哼";
        }
    }
}
