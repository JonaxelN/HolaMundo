package com.jonaxel.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button buttonActividad;

    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = (EditText) findViewById(R.id.textoeditable);
        buttonActividad = (Button) findViewById(R.id.button2);

        buttonActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = myEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
                intent.putExtra("texto", dato);
                startActivity(intent);
            }
        });

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
