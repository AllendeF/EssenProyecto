package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.adaptadores.GrupoAdaptadorHambur;
import com.example.essen.data.Hamburguesas;

public class CatalogoViewHambur extends AppCompatActivity {
    String TAG = "CatalogoViewHambur";
    TextView listview;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_catalogo);

        TextView titulo = findViewById(R.id.tv_titulo_catalogo);
        titulo.setText("Hamburguesa");

        ListView listView = findViewById( R.id.catalogo_listview);
        listView.setAdapter(new GrupoAdaptadorHambur(this, Hamburguesas.hambur));
        GrupoAdaptadorHambur adaptador =  new GrupoAdaptadorHambur(this, Hamburguesas.hambur);
        listView.setAdapter((ListAdapter) adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CatalogoViewHambur.this, ActivityHambur.class);
                intent.putExtra("idLocal", i);
                Log.i (TAG, "IdLocal: " + i);
                startActivity( intent );
            }
        });
        SearchView searchView= findViewById(R.id.txtBuscar);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String newText) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adaptador.filterList(newText);
                return true;
            }
        });
    }

}
