package com.example.essen.activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;

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
        i.putExtra("idHambur", 1);
        startActivity( i );
    }
    public void lanzarmcdonaldspantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idHambur", 0);
        startActivity( i );
    }
    public void lanzarwendyspantalla(View view){
        Intent i = new Intent(this, ActivityHambur.class);
        i.putExtra("idHambur", 2);
        startActivity( i );
    }
    public void lanzarlitllecpantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idPizza", 4);
        startActivity( i );
    }
    public void lanzardominospantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idPizza", 5);
        startActivity( i );
    }
    public void lanzarpizzahutpantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idPizza", 0);
        startActivity( i );
    }
    public void lanzarsiciliapantalla(View view){
        Intent i = new Intent(this, ActivityPizza.class);
        i.putExtra("idPizza", 3);
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

