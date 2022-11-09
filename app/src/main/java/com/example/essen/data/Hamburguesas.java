package com.example.essen.data;

import android.app.ListActivity;

import com.example.essen.R;

import java.util.ArrayList;

public class Hamburguesas extends ListActivity {
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

    public static ArrayList<Hamburguesas> hambur = new ArrayList<>();

    static {
        hambur.add( new Hamburguesas("Mcdonald's", "Superseis", 5, R.drawable.mcdonalds, R.drawable.mcdonaldsmenuitem1, R.drawable.mcdonaldsmenuitem2, "25,000 GS", "30,000 GS", "Combo Doble Bacon", "McChicken"));
        hambur.add( new Hamburguesas("Burger King", "Casa Central", 5,R.drawable.bk, R.drawable.whopper, R.drawable.tendercrisp, "25,000 GS", "20,000 GS", "Whopper", "TenderCrisp"));
        hambur.add( new Hamburguesas("Wendys", "Casa Central", 4, R.drawable.wendys,R.drawable.combo_wendys,R.drawable.papa_wendys, "60,000 GS", "15,000 GS", "Combo Completo", "Papas Singulares Grandes"));
        hambur.add( new Hamburguesas("Five Guys", "Casa Central", 4, R.drawable.five_guys, R.drawable.milkshake, R.drawable.fiveguyscheese, "12,000 GS", "25,000 GS", "Gingerbread Milkshake", "CheeseBurger"));
        hambur.add( new Hamburguesas("Carl's Jr.", "Casa Central", 2, R.drawable.carlsjr, R.drawable.californiaclassic, R.drawable.breakfastburger, "30,000 GS", "27,000 GS", "CaliforniaClassic", "Breakfast Burger"));
        hambur.add( new Hamburguesas("Sonic", "Casa Central", 1, R.drawable.sonic, R.drawable.butterbacon, R.drawable.steakhousebacon, "25,000 GS", "35,000 GS", "Butterbacon", "Steakhouse Bacon"));

    }


    public Hamburguesas(String nombre, String sucursal, float rating, int image, int menuitem1, int menuitem2, String preciomitem1, String preciomitem2, String nombremenuitem1, String nombremenuitem2) {
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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
