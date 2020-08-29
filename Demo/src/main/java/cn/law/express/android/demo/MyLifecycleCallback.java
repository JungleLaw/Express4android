package cn.law.express.android.demo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    public static final String TAG = "TAG";

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Log.d(TAG, "MyLifecycleCallback onActivityCreated");
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityStarted");

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityResumed");
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPaused");
    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityStopped");
    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        Log.d(TAG, "MyLifecycleCallback onActivitySaveInstanceState");
    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityDestroyed");
    }

    //============================================================================================================================================================
    @Override
    public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreCreated");
    }

    @Override
    public void onActivityPostCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "MyLifecycleCallback onActivityPostCreated");
    }

    @Override
    public void onActivityPreStarted(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreStarted");
    }

    @Override
    public void onActivityPostStarted(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreStarted");
    }

    @Override
    public void onActivityPreResumed(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreResumed");
    }

    @Override
    public void onActivityPostResumed(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPostResumed");
    }

    @Override
    public void onActivityPrePaused(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPrePaused");
    }

    @Override
    public void onActivityPostPaused(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPostPaused");
    }

    @Override
    public void onActivityPreStopped(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreStopped");
    }

    @Override
    public void onActivityPostStopped(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPostStopped");
    }

    @Override
    public void onActivityPreSaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreSaveInstanceState");
    }

    @Override
    public void onActivityPostSaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        Log.d(TAG, "MyLifecycleCallback onActivityPostSaveInstanceState");
    }

    @Override
    public void onActivityPreDestroyed(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPreDestroyed");
    }

    @Override
    public void onActivityPostDestroyed(@NonNull Activity activity) {
        Log.d(TAG, "MyLifecycleCallback onActivityPostDestroyed");
    }
}
