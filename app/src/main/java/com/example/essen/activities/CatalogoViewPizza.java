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
import com.example.essen.adaptadores.GrupoAdaptadorPizza;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Pizza;

public class CatalogoViewPizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_catalogo);

        TextView titulo = findViewById(R.id.tv_titulo_catalogo);
        titulo.setText("Pizza");

        ListView listView = findViewById( R.id.catalogo_listview);
        listView.setAdapter(new GrupoAdaptadorPizza(this, Pizza.pizza));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CatalogoViewPizza.this, ActivityHambur.class);
                intent.putExtra("idGrupo", i);
                startActivity( intent );
            }
        });
    }
}
