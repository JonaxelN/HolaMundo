package com.jonaxel.holamundo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jonathan on 13/02/15.
 */
public class AdapterCarro extends BaseAdapter {

    private ArrayList<CarroModelo> listaArrays = new ArrayList<>();
    private CarroModelo modelo;
    private Context context;
    LayoutInflater inflater;

    public AdapterCarro(Context context, ArrayList<CarroModelo> listaArrays) {
        this.listaArrays = listaArrays;
        this.context = context;
    }

    @Override
    public int getCount() {                 //Tamaño de la listView
        return listaArrays.size();
    }

    @Override
    public Object getItem(int position) {       //Obtiene lo que presiona el usuario
        return listaArrays.get(position).toString();
    }

    @Override
    public long getItemId(int position) {       //Obtiene el id que presiono el usuario
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {     //¿Que vista inflamos?
        ViewHolder holder = new ViewHolder();
        View itemView = convertView;

        //Find the client to work with
        modelo = listaArrays.get(position);


        if (itemView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.item_row, parent, false);
            itemView.setTag(holder);
        } else {
            holder = (ViewHolder) itemView.getTag();
        }
        holder.anio = (TextView) itemView.findViewById(R.id.text_anio);
        holder.modelo = (TextView) itemView.findViewById(R.id.text_modelo);
        holder.marca = (TextView) itemView.findViewById(R.id.text_marca);


        holder.anio.setText("" + modelo.getAnio());
        holder.modelo.setText(modelo.getModelo());
        holder.marca.setText(modelo.getMarca());

        return itemView;

    }

    public static class ViewHolder {
        TextView marca, modelo, anio;
    }
}
