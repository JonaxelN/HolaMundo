package com.jonaxel.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListaSimple extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);

        listView = (ListView) findViewById(R.id.listview);

        String[] datos = new String[] {
                "Mercurio",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Urano",
                "Neptuno",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Urano",
                "Neptuno",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Urano",
                "Neptuno",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Urano",
                "Neptuno",
                "Pluton"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String dato = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplication(), dato, Toast.LENGTH_LONG).show();

            }
        });

    }
}
