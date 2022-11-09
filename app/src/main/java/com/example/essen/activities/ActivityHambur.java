package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ActivityHambur extends AppCompatActivity {

    private int idHambur = -1;
    private Hamburguesas unHamburguesa;
    private TextView nombre;
    private TextView sucursal;
    private ImageView logomenuitem;
    private TextView nombremenuitem;
    private TextView precio;
    private ImageView logolocal;
    private RatingBar califilicacion_local;
    private RecyclerView menu_locales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locales);
        menu_locales = findViewById(R.id.menuview);

        menu_locales.setAdapter(new RVAdapter(this, Hamburguesas.hambur));
        menu_locales.setLayoutManager(new LinearLayoutManager(this));


        Bundle extras = getIntent().getExtras();
        if(extras != null){
            idHambur = extras.getInt("idHambur", -1);
        }

        actualizarVista();
    }

    public void actualizarVista() {
        if (idHambur < 0 || idHambur > (Hamburguesas.hambur.size() - 1)) {
            finish();
            return;
        }

        unHamburguesa = Hamburguesas.hambur.get(idHambur);

        nombre = (TextView) findViewById(R.id.nombre_local);
        nombre.setText(unHamburguesa.getNombre());

        sucursal = (TextView) findViewById(R.id.nombre_sucursal);
        sucursal.setText(unHamburguesa.getSucursal());

        logolocal = (ImageView) findViewById(R.id.logo_local);
        logolocal.setImageResource(unHamburguesa.getImage());

        califilicacion_local = (RatingBar) findViewById(R.id.ratinglocal);
        califilicacion_local.setRating(unHamburguesa.getRating());

    }

    class menulocales extends RecyclerView.ViewHolder{
        public menulocales(@NonNull View itemView) {
            super(itemView);
        }
    }
    class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
        public RVAdapter(ActivityHambur activityHambur, ArrayList<Hamburguesas> hambur) {

        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            if (viewType == 0) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menuitems, parent, false);
                    logomenuitem = (ImageView) view.findViewById(R.id.fotomenuitem1);
                    logomenuitem.setImageResource(unHamburguesa.getMenuitem1());

                    nombremenuitem = (TextView) view.findViewById(R.id.titulomenuitem1);
                    nombremenuitem.setText(unHamburguesa.getNombremenuitem1());

                    precio = (TextView) view.findViewById(R.id.menuitemcosto1);
                    precio.setText(unHamburguesa.getPreciomitem1());

                        return new menulocales (view);
            }
            else {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menuitems, parent, false);
                    logomenuitem = (ImageView) view.findViewById(R.id.fotomenuitem1);
                    logomenuitem.setImageResource(unHamburguesa.getMenuitem2());

                    nombremenuitem = (TextView) view.findViewById(R.id.titulomenuitem1);
                    nombremenuitem.setText(unHamburguesa.getNombremenuitem2());

                    precio = (TextView) view.findViewById(R.id.menuitemcosto1);
                    precio.setText(unHamburguesa.getPreciomitem2());

                        return new menulocales (view);
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
        //i.putExtra("id", (long)0);
        startActivity(i);
    }
}



