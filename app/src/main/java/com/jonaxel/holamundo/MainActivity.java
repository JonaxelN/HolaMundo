package com.jonaxel.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    Button botonSimple;
    Button botonPersonalizada;
    Button botonFutbol;

    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = (EditText) findViewById(R.id.textoeditable);
        botonSimple = (Button) findViewById(R.id.button2);
        botonPersonalizada = (Button) findViewById(R.id.boton_lista_personalizada);
        botonFutbol = (Button) findViewById(R.id.boton_lista_futbol);

        botonSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = myEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, ListaSimple.class);
                intent.putExtra("texto", dato);
                startActivity(intent);
            }
        });

        botonPersonalizada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaPersonalizada.class);
                startActivity(intent);
            }
        });

        botonFutbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaFutbol.class);
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
