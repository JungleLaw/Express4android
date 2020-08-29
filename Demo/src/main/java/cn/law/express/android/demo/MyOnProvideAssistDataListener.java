package cn.law.express.android.demo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public class MyOnProvideAssistDataListener implements Application.OnProvideAssistDataListener {
    @Override
    public void onProvideAssistData(Activity activity, Bundle data) {
        Log.d("TAG", "MyOnProvideAssistDataListener onProvideAssistData");
    }
}
