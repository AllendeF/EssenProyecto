package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;

public class MenuPrincipalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
    }
    public void lanzarCatalogoHambur(View view){
        Intent i = new Intent(this, CatalogoViewHambur.class);
        //i.putExtra("id", (long)0);
        startActivity(i);
    }
    public void lanzarCatalogoPizza(View view){
        Intent i = new Intent(this, CatalogoViewPizza.class);
        //i.putExtra("id", (long)0);
        startActivity(i);
    }
    public void lanzarCatalogoOtros(View view){
        Intent i = new Intent(this, CatalogoViewOtros.class);
        //i.putExtra("id", (long)0);
        startActivity(i);
    }
}
