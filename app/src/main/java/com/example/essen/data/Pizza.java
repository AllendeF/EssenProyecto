package com.example.essen.data;

import android.app.ListActivity;

import com.example.essen.R;

import java.util.ArrayList;

public class Pizza extends ListActivity {
    private int id;
    private String nombre;
    private String sucursal;
    private int rating;
    private int image;

    public static ArrayList<Pizza> pizza = new ArrayList<>();

    static {
        pizza.add( new Pizza("Pizza Hut", "SuperSeis", 5, R.drawable.pizzahutlogo));
        pizza.add( new Pizza("Sbarro", "Mcal. Lopez", 2, R.drawable.sbarro));
        pizza.add( new Pizza("Papa John's", "Paseo la Galeria", 5, R.drawable.papajohns));
        pizza.add( new Pizza("Sicilia", "Paseo la Galeria", 4, R.drawable.sicilia));
        pizza.add( new Pizza("Little Caesars", "Casa Central", 2, R.drawable.litllec));
        pizza.add( new Pizza("Dominos", "Shopping del Sol", 1, R.drawable.dominos));

    }

    public Pizza(String nombre, String sucursal, int rating, int image) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.rating = rating;
        this.image = image;
    }
    public static void agregarPizza( Pizza unPizza ) {
        pizza.add( unPizza );
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
