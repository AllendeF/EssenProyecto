package com.example.essen.adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.essen.R;
import com.example.essen.data.Comentarios;
import com.example.essen.data.Hamburguesas;


import java.util.ArrayList;

public class GrupoAdaptadorComentario extends BaseAdapter {

    private final Activity actividad;
    private final ArrayList<Comentarios> local;

    public GrupoAdaptadorComentario(Activity actividad, ArrayList<Comentarios> local){
        super();
        this.actividad = actividad;
        this.local = local;
    }

    @Override
    public int getCount() {
        return local.size();
    }

    @Override
    public Object getItem(int args0) {
        if(local != null) {
            return local.get(args0);
        }
        return null;
    }

    @Override
    public long getItemId(int args0) {
        Comentarios unComentario = local.get(args0);
        return unComentario.getLocal();
    }

    @Override
    public View getView(int posicion, View vista, ViewGroup viewGroup) {
        LayoutInflater inflater = actividad.getLayoutInflater();
        View view = inflater.inflate( R.layout.elemento_comentario, null, true);

        Comentarios unComentario = local.get(posicion);

        TextView nombreUsuario = view.findViewById( R.id.nombre_usuario);
        nombreUsuario.setText((CharSequence) unComentario.getCreador());

        TextView comentarioUsuario = view.findViewById( R.id.coment);
        comentarioUsuario.setText(unComentario.getComentario() );

        RatingBar ratingComentario = view.findViewById( R.id.ratingcomentario);
        ratingComentario.setRating(unComentario.getRating());


        return view;
    }

}
