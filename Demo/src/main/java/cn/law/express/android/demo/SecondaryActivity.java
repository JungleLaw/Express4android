package cn.law.express.android.demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Law
 */
public class SecondaryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("TAG", "SecondaryActivity before onCreate");
        super.onCreate(savedInstanceState);
        Log.d("TAG", "SecondaryActivity after onCreate");
        setContentView(R.layout.activity_secondary);
    }

    @Override
    protected void onStart() {
        Log.d("TAG", "SecondaryActivity before onStart");
        super.onStart();
        Log.d("TAG", "SecondaryActivity after onStart");
    }

    @Override
    protected void onResume() {
        Log.d("TAG", "SecondaryActivity before onResume");
        super.onResume();
        Log.d("TAG", "SecondaryActivity after onResume");
    }

    @Override
    protected void onPause() {
        Log.d("TAG", "SecondaryActivity before onPause");
        super.onPause();
        Log.d("TAG", "SecondaryActivity after onPause");
    }

    @Override
    protected void onStop() {
        Log.d("TAG", "SecondaryActivity before onStop");
        super.onStop();
        Log.d("TAG", "SecondaryActivity after onStop");
    }

    @Override
    protected void onDestroy() {
        Log.d("TAG", "SecondaryActivity before onDestroy");
        super.onDestroy();
        Log.d("TAG", "SecondaryActivity after onDestroy");
    }
}
