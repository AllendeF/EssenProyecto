package com.example.essen.data;

import android.app.ListActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.essen.R;
import com.example.essen.adaptadores.GrupoAdaptadorHambur;
import com.example.essen.adaptadores.GrupoAdaptadorPizza;

import java.util.ArrayList;

public class Pizza extends ListActivity {
    public static int idcategoria = 2;
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
    private int info;
    private RecyclerView recyclerView;
    private GrupoAdaptadorPizza lista;
    private String link;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_catalogo);
        recyclerView = findViewById(R.id.txtBuscar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public static ArrayList<Pizza> pizza = new ArrayList<>();

    static {
        pizza.add( new Pizza("Pizza Hut", "SuperSeis", 5, R.drawable.pizzahutlogo, R.drawable.pepperonipizza, R.drawable.ovenbakedpastas, "55,000 GS","45,000 GS", "Pizza Familiar", "Baked Pasta", R.drawable.info_pizzahut, "https://www.instagram.com/pizzahutpy/?hl=en"));
        pizza.add( new Pizza("Sbarro", "Mcal. Lopez", 2, R.drawable.sbarro, R.drawable.sbarroslides, R.drawable.breadsticks, "20,000 GS", "7,000 GS", "Pizza Slides", "Breadsticks", R.drawable.info_sbarro, "https://sbarro.com/"));
        pizza.add( new Pizza("Papa John's", "Paseo la Galeria", 5, R.drawable.papajohns, R.drawable.quesadilla, R.drawable.nocrust, "17,000 GS", "30,000 GS", "Quesadilla de Pollo", "Pizza NoCrust", R.drawable.info_papa, "https://www.papajohns.com/international/"));
        pizza.add( new Pizza("Sicilia", "Paseo la Galeria", 4, R.drawable.sicilia, R.drawable.vinossicilia, R.drawable.siciliamediana, "90,000 GS", "67,000 GS","Vino Sicilia", "Pizza Mediana", R.drawable.info_sicilia, "https://www.instagram.com/siciliapy/?hl=en"));
        pizza.add( new Pizza("Little Caesars", "Casa Central", 2, R.drawable.litllec, R.drawable.combocompleto, R.drawable.detroitstyle, "120,000 GS", "70,000 GS", "Combo Completo", "Detroit Style", R.drawable.info_lilc, "https://littlecaesars.com/en-us/"));
        pizza.add( new Pizza("Dominos", "Shopping del Sol", 1, R.drawable.dominos,R.drawable.dominossmall, R.drawable.dominosdoublecombo, "35,000 GS", "175,000 GS", "Pizza Small", "Doble Pizza Combo", R.drawable.info_dominos, "https://www.dominos.com.py/"));

    }

    public Pizza(String nombre, String sucursal, float rating, int image, int menuitem1, int menuitem2, String preciomitem1, String preciomitem2, String nombremenuitem1, String nombremenuitem2, int info, String link) {
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
        this.info = info;
        this.link = link;
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

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
