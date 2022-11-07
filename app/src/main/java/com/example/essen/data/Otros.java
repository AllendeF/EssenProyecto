package com.example.essen.data;

import android.app.ListActivity;

import com.example.essen.R;

import java.util.ArrayList;

public class Otros extends ListActivity {
    private int id;
    private String nombre;
    private String sucursal;
    private int rating;
    private int image;

    public static ArrayList<Otros> otros = new ArrayList<>();

    static {
        otros.add( new Otros("Hiroshima", "Shopping del Sol", 5, R.drawable.hiroshima));
        otros.add( new Otros("Sukiyaki", "Casa Central", 2, R.drawable.sukiyaki));
        otros.add( new Otros("Koggi", "Casa Central", 4, R.drawable.koggi));
        otros.add( new Otros("Kyungkyune", "Casa Central", 3, R.drawable.kyungkyune ));
        otros.add( new Otros("El Patio", "Casa Central", 2, R.drawable.el_patio));
        otros.add( new Otros("Kokoro'o", "Casa Central", 0, R.drawable.kokoroo));

    }

    public Otros(String nombre, String sucursal, int rating, int image) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.rating = rating;
        this.image = image;
    }
    public static void agregarOtros( Otros unOtros ) {
        otros.add( unOtros );
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating(int rating) {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}


