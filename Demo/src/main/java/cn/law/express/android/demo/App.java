package cn.law.express.android.demo;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class App extends Application {
    @Override
    public void onCreate() {
        Log.d("TAG", "App before onCreate");
        super.onCreate();
        Log.d("TAG", "App after onCreate");

        registerActivityLifecycleCallbacks(new MyLifecycleCallback());
//        registerActivityLifecycleCallbacks(new MyLifecycleCallback2());
        registerComponentCallbacks(new MyComponentCallbacks());
        registerOnProvideAssistDataListener(new MyOnProvideAssistDataListener());

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

}
