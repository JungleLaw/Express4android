package cn.law.express.android.demo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Law
 */
public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("TAG", "ThirdActivity before onCreate");
        super.onCreate(savedInstanceState);
        Log.d("TAG", "ThirdActivity after onCreate");
    }

    @Override
    protected void onStart() {
        Log.d("TAG", "ThirdActivity before onStart");
        super.onStart();
        Log.d("TAG", "ThirdActivity after onStart");
    }

    @Override
    protected void onResume() {
        Log.d("TAG", "ThirdActivity before onResume");
        super.onResume();
        Log.d("TAG", "ThirdActivity after onResume");
    }

    @Override
    protected void onPause() {
        Log.d("TAG", "ThirdActivity before onPause");
        super.onPause();
        Log.d("TAG", "ThirdActivity after onPause");
    }

    @Override
    protected void onStop() {
        Log.d("TAG", "ThirdActivity before onStop");
        super.onStop();
        Log.d("TAG", "ThirdActivity after onStop");
    }

    @Override
    protected void onDestroy() {
        Log.d("TAG", "ThirdActivity before onDestroy");
        super.onDestroy();
        Log.d("TAG", "ThirdActivity after onDestroy");
    }
}
