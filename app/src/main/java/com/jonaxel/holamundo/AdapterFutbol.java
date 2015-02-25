package com.jonaxel.holamundo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jonathan on 20/02/15.
 */
public class AdapterFutbol extends BaseAdapter {

    ArrayList<ModelFutbol> arrayList = new ArrayList<>();
    Context context;
    ModelFutbol futbol;

    public AdapterFutbol(Context context, ArrayList<ModelFutbol> arrayList) {

        this.context = context;
        this.arrayList = arrayList;

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position).toString();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        View view = convertView;
        LayoutInflater inflater;

        futbol = arrayList.get(position);

        if (view == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_fut_row, parent, false);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        holder.equipo = (TextView) view.findViewById(R.id.text_equipo);
        holder.pais = (TextView) view.findViewById(R.id.text_pais);
        holder.titulo = (TextView) view.findViewById(R.id.text_titulos);
        holder.imagen = (ImageView) view.findViewById(R.id.imageView);

        holder.equipo.setText(futbol.getEquipo());
        holder.pais.setText(futbol.getPais());
        holder.titulo.setText("" + futbol.getTitulos());
        holder.imagen.setImageDrawable(futbol.getImagen());

        return view;
    }

    public static class ViewHolder {
        TextView equipo, pais, titulo;
        ImageView imagen;
    }
}
