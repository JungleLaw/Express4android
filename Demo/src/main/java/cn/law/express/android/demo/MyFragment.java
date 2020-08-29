package cn.law.express.android.demo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author Law
 */
public class MyFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("TAG", "MyFragment before onCreate");
        super.onCreate(savedInstanceState);
        Log.d("TAG", "MyFragment after onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("TAG", "MyFragment onCreateView");
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("TAG", "MyFragment before onViewCreated");
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ThirdActivity.class));
            }
        });
        Log.d("TAG", "MyFragment after onViewCreated");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("TAG", "MyFragment before onActivityCreated");
        super.onActivityCreated(savedInstanceState);
        Log.d("TAG", "MyFragment after onActivityCreated");
    }

    @Override
    public void onStart() {
        Log.d("TAG", "MyFragment before onStart");
        super.onStart();
        Log.d("TAG", "MyFragment after onStart");
    }

    @Override
    public void onResume() {
        Log.d("TAG", "MyFragment before onResume");
        super.onResume();
        Log.d("TAG", "MyFragment after onResume");
    }

    @Override
    public void onPause() {
        Log.d("TAG", "MyFragment before onPause");
        super.onPause();
        Log.d("TAG", "MyFragment after onPause");
    }

    @Override
    public void onStop() {
        Log.d("TAG", "MyFragment before onStop");
        super.onStop();
        Log.d("TAG", "MyFragment after onStop");
    }

    @Override
    public void onDestroy() {
        Log.d("TAG", "MyFragment before onDestroy");
        super.onDestroy();
        Log.d("TAG", "MyFragment after onDestroy");
    }

    @Override
    public void onLowMemory() {
        Log.d("TAG", "MyFragment before onLowMemory");
        super.onLowMemory();
        Log.d("TAG", "MyFragment after onLowMemory");
    }
}
