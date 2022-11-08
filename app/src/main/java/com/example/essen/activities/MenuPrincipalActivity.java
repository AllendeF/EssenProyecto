package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;

public class MenuPrincipalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

    }
    //Lanzar diferentes botones a activity
    public void lanzarbkpantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idGrupo", 1);
        startActivity( i );
    }
    public void lanzarmcdonaldspantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idGrupo", 0);
        startActivity( i );
    }
    public void lanzarwendyspantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idGrupo", 2);
        startActivity( i );
    }
    public void lanzarlitllecpantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idGrupo", 4);
        startActivity( i );
    }
    public void lanzardominospantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idGrupo", 5);
        startActivity( i );
    }
    public void lanzarpizzahutpantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idGrupo", 0);
        startActivity( i );
    }
    public void lanzarsiciliapantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idGrupo", 3);
        startActivity( i );
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

