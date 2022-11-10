package com.example.essen.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.essen.R;
import com.example.essen.adaptadores.GrupoAdaptadorComentario;
import com.example.essen.data.Comentarios;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Pizza;

import java.util.ArrayList;

public class ActivityPizza extends AppCompatActivity {

    private int idPizza = -1;
    private Pizza unPizza;
    private TextView nombre;
    private TextView sucursal;
    private ImageView logolocal;
    private ImageView logomenuitem;
    private TextView nombremenuitem;
    private TextView precio;
    private RatingBar califilicacion_local;
    private RecyclerView menu_locales;

    GrupoAdaptadorComentario adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locales);
        menu_locales = findViewById(R.id.menuview);
        menu_locales.setLayoutManager(new LinearLayoutManager(this));
        menu_locales.setAdapter(new RVAdapter());

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            idPizza = extras.getInt("idLocal", -1);
        }

        ListView listView = findViewById( R.id.comentarios);
        ArrayList<Comentarios> comentariosPizza = obtenerComentarios(Comentarios.comments);
        adaptador = new GrupoAdaptadorComentario(this, comentariosPizza);
        listView.setAdapter(adaptador);

        actualizarVista();
    }
    ArrayList<Comentarios> obtenerComentarios (ArrayList<Comentarios> comentarios) {
        ArrayList<Comentarios> comentariosPizza = new ArrayList<>();
        for (Comentarios c: comentarios){
            if (c.getIdcategoria() == 2) {
                if (c.getLocal() == idPizza) {
                    comentariosPizza.add(c);
                }
            }
        }
        return comentariosPizza;
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

        califilicacion_local = (RatingBar) findViewById(R.id.ratinglocal);
        califilicacion_local.setRating(unPizza.getRating());
    }

    class menulocales extends RecyclerView.ViewHolder{
        public menulocales(@NonNull View itemView) {
            super(itemView);
        }
    }
    class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            if (viewType == 0) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menuitems, parent, false);

                logomenuitem = (ImageView) view.findViewById(R.id.fotomenuitem1);
                logomenuitem.setImageResource(unPizza.getMenuitem1());

                nombremenuitem = (TextView) view.findViewById(R.id.titulomenuitem1);
                nombremenuitem.setText(unPizza.getNombremenuitem1());

                precio = (TextView) view.findViewById(R.id.menuitemcosto1);
                precio.setText(unPizza.getPreciomitem1());

                return new ActivityPizza.menulocales(view);
            }
            else {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menuitems, parent, false);
                logomenuitem = (ImageView) view.findViewById(R.id.fotomenuitem1);
                logomenuitem.setImageResource(unPizza.getMenuitem2());

                nombremenuitem = (TextView) view.findViewById(R.id.titulomenuitem1);
                nombremenuitem.setText(unPizza.getNombremenuitem2());

                precio = (TextView) view.findViewById(R.id.menuitemcosto1);
                precio.setText(unPizza.getPreciomitem2());

                return new ActivityPizza.menulocales(view);
            }
        }
        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemViewType(int position) {
            return position;
        }

        @Override
        public int getItemCount() {
            return 2;
        }
    }

    public void lanzarComentario (View view) {
        Intent i = new Intent(this, ActivityComentario.class);
        i.putExtra("idLocal", idPizza);
        i.putExtra("idCategoria", Pizza.idcategoria);
        startActivityForResult(i, 123);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 123 && resultCode == Activity.RESULT_OK) {
            adaptador.setLocal( obtenerComentarios(Comentarios.comments) );
            adaptador.notifyDataSetChanged();
        }
    }
    public void returnHome(View view){
        Intent i = new Intent(this, MenuPrincipalActivity.class);
        Toast.makeText(getApplicationContext(), "Se ha vuelto a Home", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
    public void lanzarWeb(View view){
        Intent i = new Intent(this, ActivityWebview.class);
        i.putExtra("idLocal", idPizza);
        i.putExtra("idCategoria", Pizza.idcategoria);
        Toast.makeText(getApplicationContext(), "Se ha inicilizado la web", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
    public void lanzarInfo(View view){
        Intent i = new Intent(this, ActivityInfo.class);
        i.putExtra("idLocal", idPizza);
        i.putExtra("idCategoria", Hamburguesas.idcategoria);
        Toast.makeText(getApplicationContext(), "Informacion de Restaurante", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}


