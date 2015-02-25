package com.jonaxel.holamundo;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class ListaPersonalizada extends Activity {

    ListView lista;
    ArrayList<CarroModelo> mCarro = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personalizada);

        lista = (ListView) findViewById(R.id.personalizada);

        llenarLista();
        llenarListView();
    }

    private void llenarLista() {
        mCarro.add(new CarroModelo("Mazda", "RX7", 1998));
        mCarro.add(new CarroModelo("Nissan", "Tsuru", 1990));
        mCarro.add(new CarroModelo("Volkswagen", "Vocho", 1950));
        mCarro.add(new CarroModelo("Chevrolet", "Cheyene", 2005));
        mCarro.add(new CarroModelo("Renault", "Clio", 2000));
        mCarro.add(new CarroModelo("Renault", "Clio", 2000));
    }

    private void llenarListView() {
        AdapterCarro adapter = new AdapterCarro(this, mCarro);

        adapter.notifyDataSetChanged();

        lista.setAdapter(adapter);
    }


}
