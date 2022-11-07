package com.example.essen.data;

import android.app.ListActivity;
import android.graphics.drawable.Drawable;

import com.example.essen.R;

import java.util.ArrayList;

public class Hamburguesas extends ListActivity {
    private int id;
    private String nombre;
    private String sucursal;
    private int rating;
    private int image;

    public static ArrayList<Hamburguesas> hambur = new ArrayList<>();

    static {
        hambur.add( new Hamburguesas("Mcdonald's", "Superseis", 5, R.drawable.mcdonalds));
        hambur.add( new Hamburguesas("Burger King", "Casa Central", 2,R.drawable.bk));
        hambur.add( new Hamburguesas("Wendys", "Casa Central", 4, R.drawable.wendys));
        hambur.add( new Hamburguesas("Five Guys", "Casa Central", 4, R.drawable.five_guys));
        hambur.add( new Hamburguesas("Carl's Jr.", "Casa Central", 2, R.drawable.carlsjr));
        hambur.add( new Hamburguesas("Sonic", "Casa Central", 1, R.drawable.sonic));

    }


    public Hamburguesas(String nombre, String sucursal, int rating, int image) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.rating = rating;
        this.image = image;
    }
    public static void agregarHamburguesas( Hamburguesas unHamburguesas ) {
        hambur.add( unHamburguesas );
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
