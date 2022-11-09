package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.essen.R;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Otros;

public class ActivityOtros extends AppCompatActivity {

    private int idOtros = -1;
    private Otros unOtros;
    private TextView nombre;
    private TextView sucursal;
    private ImageView logolocal;
    private ImageView logomenuitem;
    private TextView nombremenuitem;
    private RecyclerView menu_locales;
    private TextView precio;
    private RatingBar califilicacion_local;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locales);
        menu_locales = findViewById(R.id.menuview);
        menu_locales.setLayoutManager(new LinearLayoutManager(this));
        menu_locales.setAdapter(new RVAdapter());

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            idOtros = extras.getInt("idLocal", -1);
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

        califilicacion_local = (RatingBar) findViewById(R.id.ratinglocal);
        califilicacion_local.setRating(unOtros.getRating());
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
                logomenuitem.setImageResource(unOtros.getMenuitem1());

                nombremenuitem = (TextView) view.findViewById(R.id.titulomenuitem1);
                nombremenuitem.setText(unOtros.getNombremenuitem1());

                precio = (TextView) view.findViewById(R.id.menuitemcosto1);
                precio.setText(unOtros.getPreciomitem1());

                return new ActivityOtros.menulocales(view);
            }
            else {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menuitems, parent, false);

                logomenuitem = (ImageView) view.findViewById(R.id.fotomenuitem1);
                logomenuitem.setImageResource(unOtros.getMenuitem2());

                nombremenuitem = (TextView) view.findViewById(R.id.titulomenuitem1);
                nombremenuitem.setText(unOtros.getNombremenuitem2());

                precio = (TextView) view.findViewById(R.id.menuitemcosto1);
                precio.setText(unOtros.getPreciomitem2());


                return new ActivityOtros.menulocales(view);
            }
        }
        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemViewType(int position) {
            return position ;
        }

        @Override
        public int getItemCount() {
            return 2;
        }
    }
    public void lanzarComentario (View view) {
        Intent i = new Intent(this, ActivityComentario.class);
        i.putExtra("idScreen", i);
        startActivity(i);
    }

}
