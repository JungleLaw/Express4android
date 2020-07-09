package cn.law.express.android.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cn.law.express.android.common.CollectionUtils;

public class MainActivity extends AppCompatActivity {

    private List<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        array = new ArrayList<>();
        array.add("1");

        Log.i("tag", String.valueOf(CollectionUtils.isEmpty(array)));
    }
}
