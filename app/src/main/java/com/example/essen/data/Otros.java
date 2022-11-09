package com.example.essen.data;

import android.app.ListActivity;

import com.example.essen.R;

import java.util.ArrayList;

public class Otros extends ListActivity {
    private int id;
    private String nombre;
    private String sucursal;
    private float rating;
    private int image;
    private int menuitem1;
    private int menuitem2;
    private String preciomitem1;
    private String preciomitem2;
    private String nombremenuitem1;
    private String nombremenuitem2;

    public static ArrayList<Otros> otros = new ArrayList<>();

    static {
        otros.add( new Otros("Hiroshima", "Shopping del Sol", 5, R.drawable.hiroshima, R.drawable.okonomiyaki, R.drawable.sushi, "40,000 GS", "80,000 GS", "Okonomiyaki", "Sushi 20 piezas"));
        otros.add( new Otros("Sukiyaki", "Casa Central", 2, R.drawable.sukiyaki, R.drawable.sukiyakiplato, R.drawable.ensaladawagyu, "50,000 GS", "55,000 GS", "Ramen", "Ensalada Wagyu"));
        otros.add( new Otros("Koggi", "Casa Central", 4, R.drawable.koggi, R.drawable.bibimbap, R.drawable.koggiwrap, "35,000 GS", "27,000 GS", "BibimBap", "Wrap de Carne"));
        otros.add( new Otros("Kyungkyune", "Casa Central", 3, R.drawable.kyungkyune, R.drawable.parrillakoreana, R.drawable.postrecoreano, "120,000 GS", "22,000 GS", "Parrilla Koreana 8/p", "Postre K" ));
        otros.add( new Otros("El Patio", "Casa Central", 2, R.drawable.el_patio, R.drawable.paella, R.drawable.conquistador, "200,000 GS", "75,000 GS", "Paella 10/p", "El Conquistador"));
        otros.add( new Otros("Kokoro'o", "Casa Central", 0, R.drawable.kokoroo, R.drawable.pollofrito, R.drawable.sandwichpollofrito, "25,000 GS", "17,000 GS", "Pollo Frito", "Sandwich Pollo Frito"));

    }

    public Otros(String nombre, String sucursal, float rating, int image, int menuitem1, int menuitem2, String preciomitem1, String preciomitem2, String nombremenuitem1, String nombremenuitem2) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.rating = rating;
        this.image = image;
        this.menuitem1 = menuitem1;
        this.menuitem2 = menuitem2;
        this.preciomitem1 = preciomitem1;
        this.preciomitem2 = preciomitem2;
        this.nombremenuitem1 = nombremenuitem1;
        this.nombremenuitem2 = nombremenuitem2;
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getNombremenuitem1() {
        return nombremenuitem1;
    }

    public void setNombremenuitem1(String nombremenuitem1) {
        this.nombremenuitem1 = nombremenuitem1;
    }

    public String getNombremenuitem2() {
        return nombremenuitem2;
    }

    public void setNombremenuitem2(String nombremenuitem2) {
        this.nombremenuitem2 = nombremenuitem2;
    }

    public String getPreciomitem1() {
        return preciomitem1;
    }

    public void setPreciomitem1(String preciomitem1) {
        this.preciomitem1 = preciomitem1;
    }

    public String getPreciomitem2() {
        return preciomitem2;
    }

    public void setPreciomitem2(String preciomitem2) {
        this.preciomitem2 = preciomitem2;
    }

    public int getMenuitem1() {
        return menuitem1;
    }

    public void setMenuitem1(int menuitem1) {
        this.menuitem1 = menuitem1;
    }

    public int getMenuitem2() {
        return menuitem2;
    }

    public void setMenuitem2(int menuitem2) {
        this.menuitem2 = menuitem2;
    }

}


