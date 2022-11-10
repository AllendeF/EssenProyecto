package com.example.essen.activities;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Otros;
import com.example.essen.data.Pizza;

public class ActivityInfo extends AppCompatActivity {
    String TAG = "ActivityInfo";
    private ImageView infolocales;
    private int local = -1;
    private int idcategoria = -1;
    private Hamburguesas unHamburguesa;
    private Otros unOtros;
    private Pizza unPizza;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_locales);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            local = extras.getInt("idLocal", -1);
            Log.i (TAG, "Local recibido: " + local);
            idcategoria = extras.getInt("idCategoria", -1);
        }
        infolocales = (ImageView) findViewById(R.id.infolocal);
        if (idcategoria == 1) {
            Log.i (TAG, "idCategoria: " + idcategoria);
            unHamburguesa = Hamburguesas.hambur.get(local);
            Log.i (TAG, "Local recibido: " + local);
            infolocales.setImageResource(unHamburguesa.getInfo());
        } else if (idcategoria == 2) {
            Log.i (TAG, "idCategoria: " + idcategoria);
            unPizza = Pizza.pizza.get(local);
            Log.i (TAG, "Local recibido: " + local);
            infolocales.setImageResource(unPizza.getInfo());
        } else if (idcategoria == 3) {
            Log.i (TAG, "idCategoria: " + idcategoria);
            unOtros = Otros.otros.get(local);
            Log.i (TAG, "Local recibido: " + local);
            infolocales.setImageResource(unOtros.getInfo());
        }
    }
}
