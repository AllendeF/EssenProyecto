package com.example.essen.activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;

public class MenuPrincipalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
        showDialog();

    }
    Dialog dialog;

    private void showDialog() {
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.popup);

        ImageButton close = (ImageButton) dialog.findViewById(R.id.btnClose);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                //TODO Close button action
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dialog.show();
    }
    //Lanzar diferentes botones a activity
    public void lanzarbkpantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idLocal", 1);
        startActivity( i );
    }
    public void lanzarmcdonaldspantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idLocal", 0);
        startActivity( i );
    }
    public void lanzarwendyspantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idLocal", 2);
        startActivity( i );
    }
    public void lanzarlitllecpantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idLocal", 4);
        startActivity( i );
    }
    public void lanzardominospantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idLocal", 5);
        startActivity( i );
    }
    public void lanzarpizzahutpantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idLocal", 0);
        startActivity( i );
    }
    public void lanzarsiciliapantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idLocal", 3);
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

    public void cerrarSesion(View view){
        Toast.makeText(getApplicationContext(), "Se ha cerrado sesion", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, InicioActivity.class);
        startActivity(i);
    }

    public void verPerfil (View view){
        Intent i = new Intent(this, ActivityPerfil.class);
        Toast.makeText(getApplicationContext(), "Ha ingresado a perfil", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.ver_grupo_menu , menu );
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch( item.getItemId() ) {
            case R.id.cerrarsesion1:{
                Toast.makeText(getApplicationContext(), "Se ha cerrado sesion", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, InicioActivity.class);
                startActivity(i);
            }case R.id.verperfil:{
                Intent i = new Intent(this, ActivityPerfil.class);
                Toast.makeText(getApplicationContext(), "Ha ingresado a perfil", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }

        }
        return true;
    }
}

