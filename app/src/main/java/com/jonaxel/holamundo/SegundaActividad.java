package com.jonaxel.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jonathan on 30/01/15.
 */
public class SegundaActividad extends Activity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);

        textView = (TextView) findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();

        String datoActividad = extras.getString("texto");

        textView.setText(datoActividad);

    }
}
