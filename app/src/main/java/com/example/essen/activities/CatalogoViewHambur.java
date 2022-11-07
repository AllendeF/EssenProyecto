package com.example.essen.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.adaptadores.GrupoAdaptadorHambur;
import com.example.essen.data.Hamburguesas;

public class CatalogoViewHambur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_hamburguesas);

        ListView listView = findViewById( R.id.catalogo_hamburguesas);
        listView.setAdapter(new GrupoAdaptadorHambur(this, Hamburguesas.hambur));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CatalogoViewHambur.this, VerDatosGrupoActivity.class);
                intent.putExtra("idGrupo", i);
                startActivity( intent );
            }
        });
    }
}
