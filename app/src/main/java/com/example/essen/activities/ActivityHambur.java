package com.example.essen.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Hamburguesas;

public class ActivityHambur extends AppCompatActivity {

    private int idHambur = -1;
    private Hamburguesas unHamburguesa;
    private TextView nombre;
    private TextView sucursal;
    private ImageView logolocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locales);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            idHambur = extras.getInt("idGrupo", -1);
        }

        actualizarVista();
    }

    public void actualizarVista(){
        if ( idHambur < 0 || idHambur > (Hamburguesas.hambur.size()-1) ) {
            finish();
            return;
        }

        unHamburguesa = Hamburguesas.hambur.get( idHambur );

        nombre = (TextView) findViewById(R.id.nombre_local);
        nombre.setText( unHamburguesa.getNombre() );

        sucursal = (TextView) findViewById(R.id.nombre_sucursal);
        sucursal.setText(unHamburguesa.getSucursal());

        logolocal= (ImageView) findViewById(R.id.logo_local);
        logolocal.setImageResource(unHamburguesa.getImage());
    }


}
