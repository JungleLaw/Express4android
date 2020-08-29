package cn.law.express.android.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cn.law.express.android.common.CollectionUtils;

/**
 * @author Law
 */
public class MainActivity extends AppCompatActivity {

    private List<String> array;

    private static final String BROADCAST_ACTION_DISC = "my";

    private LocalBroadcastManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TAG", "MainActivity before onCreate");
        super.onCreate(savedInstanceState);
        Log.d("TAG", "MainActivity after onCreate");
        setContentView(R.layout.activity_main);

//        array = new ArrayList<>();
//        array.add("1");
//
//        Log.i("tag", String.valueOf(CollectionUtils.isEmpty(array)));

        IntentFilter filter = new IntentFilter();
        filter.addAction(BROADCAST_ACTION_DISC);
//        registerReceiver(new MyBroadCastReceiver(), filter);

        manager = LocalBroadcastManager.getInstance(this);
        manager.registerReceiver(new MyBroadCastReceiver(), filter);
    }

    public void start(View view) {
        startActivity(new Intent(this, SecondaryActivity.class));
    }

    @Override
    protected void onStart() {
        Log.d("TAG", "MainActivity before onStart");
        super.onStart();
        Log.d("TAG", "MainActivity after onStart");
    }

    @Override
    protected void onResume() {
        Log.d("TAG", "MainActivity before onResume");
        super.onResume();
        Log.d("TAG", "MainActivity after onResume");
    }

    @Override
    protected void onPause() {
        Log.d("TAG", "MainActivity before onPause");
        super.onPause();
        Log.d("TAG", "MainActivity after onPause");
    }

    @Override
    protected void onStop() {
        Log.d("TAG", "MainActivity before onStop");
        super.onStop();
        Log.d("TAG", "MainActivity after onStop");
    }

    @Override
    protected void onDestroy() {
        Log.d("TAG", "MainActivity before onDestroy");
        super.onDestroy();
        Log.d("TAG", "MainActivity after onDestroy");
    }

    public void sendBroadCastReceiver(View view) {
        Log.d("tag", "MAIN sendBroadCastReceiver");
//        Intent intent = new Intent(this, MyBroadCastReceiver.class);
//        intent.setComponent(new ComponentName("cn.law.express.android.demo", "cn.law.express.android.demo.MyBroadCastReceiver"));
        Intent intent = new Intent();
        intent.setAction(BROADCAST_ACTION_DISC);
        manager.sendBroadcast(intent);
    }
}
