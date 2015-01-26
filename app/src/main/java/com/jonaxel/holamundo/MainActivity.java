package com.jonaxel.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("DEBUG", "Estoy onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("DEBUG", "Estoy onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("DEBUG", "Estoy onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("DEBUG", "Estoy onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("DEBUG", "Estoy onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("DEBUG", "Estoy onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("DEBUG", "Estoy onRestart");
    }


}
