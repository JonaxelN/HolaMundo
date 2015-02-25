package com.jonaxel.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ListaFutbol extends Activity {

    ListView listView;
    ArrayList<ModelFutbol> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_futbol);

        listView = (ListView) findViewById(R.id.lista_futbol);

        llenarListaJava();
        llenarListaView();

    }

    private void llenarListaJava() {
        arrayList.add(new ModelFutbol("Arsenal", "Inglaterra", 7, getResources().getDrawable(R.drawable.basketball)));
        arrayList.add(new ModelFutbol("Liverpool", "Inglaterra", 18, getResources().getDrawable(R.drawable.pato_linux)));
        arrayList.add(new ModelFutbol("Barcelona", "España", 30, getResources().getDrawable(R.drawable.tierra_icon)));
        arrayList.add(new ModelFutbol("Cruz Azul", "Mexico", 8, getResources().getDrawable(R.drawable.ying_yang)));
    }

    private void llenarListaView() {

        AdapterFutbol adapterFutbol = new AdapterFutbol(this, arrayList);

        adapterFutbol.notifyDataSetChanged();

        listView.setAdapter(adapterFutbol);

    }


}
