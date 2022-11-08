package com.example.essen.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Pizza;

public class ActivityPizza extends AppCompatActivity {

    private int idPizza = -1;
    private Pizza unPizza;
    private TextView nombre;
    private TextView sucursal;
    private ImageView logolocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locales);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            idPizza = extras.getInt("idGrupo", -1);
        }

        actualizarVista();
    }

    public void actualizarVista(){
        if ( idPizza < 0 || idPizza > (Pizza.pizza.size()-1) ) {
            finish();
            return;
        }

        unPizza = Pizza.pizza.get( idPizza );

        nombre = (TextView) findViewById(R.id.nombre_local);
        nombre.setText( unPizza.getNombre() );

        sucursal = (TextView) findViewById(R.id.nombre_sucursal);
        sucursal.setText(unPizza.getSucursal());

        logolocal= (ImageView) findViewById(R.id.logo_local);
        logolocal.setImageResource(unPizza.getImage());
    }


}
