package cn.law.express.android.demo;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.util.Log;

import androidx.annotation.NonNull;

/**
 * @author Law
 */
public class MyComponentCallbacks implements ComponentCallbacks2 {
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        Log.d("TAG", "MyComponentCallbacks onConfigurationChanged");
    }

    @Override
    public void onLowMemory() {
        Log.d("TAG", "MyComponentCallbacks onLowMemory");
    }

    @Override
    public void onTrimMemory(int level) {

    }
}
