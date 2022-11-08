package com.example.essen.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Otros;

public class ActivityOtros extends AppCompatActivity {

    private int idOtros = -1;
    private Otros unOtros;
    private TextView nombre;
    private TextView sucursal;
    private ImageView logolocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locales);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            idOtros = extras.getInt("idGrupo", -1);
        }

        actualizarVista();
    }

    public void actualizarVista(){
        if ( idOtros < 0 || idOtros > (Otros.otros.size()-1) ) {
            finish();
            return;
        }

        unOtros = Otros.otros.get( idOtros );

        nombre = (TextView) findViewById(R.id.nombre_local);
        nombre.setText( unOtros.getNombre() );

        sucursal = (TextView) findViewById(R.id.nombre_sucursal);
        sucursal.setText(unOtros.getSucursal());

        logolocal= (ImageView) findViewById(R.id.logo_local);
        logolocal.setImageResource(unOtros.getImage());
    }


}
