package com.jonaxel.holamundo;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by jonathan on 20/02/15.
 */
public class ModelFutbol {

    String equipo;
    String pais;
    int titulos;
    Drawable imagen;

    public ModelFutbol(String equipo, String pais, int titulos, Drawable imagen) {
        this.equipo = equipo;
        this.pais = pais;
        this.titulos = titulos;
        this.imagen = imagen;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }
}
