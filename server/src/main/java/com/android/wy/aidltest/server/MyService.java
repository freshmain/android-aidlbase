package com.android.wy.aidltest.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return new MyBind();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    class MyBind extends IMyAidlService.Stub {
        @Override
        public String getString() throws RemoteException {
            return "我是猪！哼哼";
        }
    }
}
