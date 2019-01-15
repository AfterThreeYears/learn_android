package activitytest.com.example.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        Log.d("ThirdActivity", "onCreate: 活动第一次被创建了");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ThirdActivity", "onStart: 活动由不可见到可见");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ThirdActivity", "onResume: 活动准备好和用户进行交互");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ThirdActivity", "onPause: 活动暂停了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ThirdActivity", "onStop: 活动完全不可见了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ThirdActivity", "onDestroy: 活动被销毁了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ThirdActivity", "onRestart: 活动由停止状态变到运行状态");
    }
}
