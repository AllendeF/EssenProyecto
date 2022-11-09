package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.adaptadores.GrupoAdaptadorHambur;
import com.example.essen.adaptadores.GrupoAdaptadorOtros;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Otros;

public class CatalogoViewOtros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_catalogo);

        TextView titulo = findViewById(R.id.tv_titulo_catalogo);
        titulo.setText("Otros");

        ListView listView = findViewById( R.id.catalogo_listview);
        listView.setAdapter(new GrupoAdaptadorOtros(this, Otros.otros));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CatalogoViewOtros.this, ActivityOtros.class);
                intent.putExtra("idOtros", i);
                startActivity( intent );
            }
        });
    }
}

