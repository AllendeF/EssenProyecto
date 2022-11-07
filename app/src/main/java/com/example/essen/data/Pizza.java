package com.example.essen.data;

import android.app.ListActivity;

import java.util.ArrayList;

public class Pizza extends ListActivity {
    private int id;
    private String nombre;
    private String sucursal;
    private int rating;

    public static ArrayList<Pizza> pizza = new ArrayList<>();

    static {
        pizza.add( new Pizza("Pizza Hut", "SuperSeis", 5));
        pizza.add( new Pizza("Sbarro", "Mcal. Lopez", 2));
        pizza.add( new Pizza("Papa John's", "Paseo la Galeria", 5));
        pizza.add( new Pizza("Sicilia", "Paseo la Galeria", 4));
        pizza.add( new Pizza("Little Caesars", "Casa Central", 2));
        pizza.add( new Pizza("Dominos", "Shopping del Sol", 1));

    }

    public Pizza(String nombre, String sucursal, int rating) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.rating = rating;
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
