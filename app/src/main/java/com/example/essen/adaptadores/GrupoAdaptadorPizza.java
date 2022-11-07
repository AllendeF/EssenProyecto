package com.example.essen.adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.essen.R;
import com.example.essen.data.Otros;
import com.example.essen.data.Pizza;

import java.util.ArrayList;


public class GrupoAdaptadorPizza extends BaseAdapter {

	private final Activity actividad;
	private final ArrayList<Pizza> lista;

	public GrupoAdaptadorPizza(Activity actividad, ArrayList<Pizza> lista){
		super();
		this.actividad = actividad;
		this.lista = lista;
	}

	@Override
	public View getView(int posicion, View vista, ViewGroup padre) {
		LayoutInflater inflater = actividad.getLayoutInflater();
		View view = inflater.inflate( R.layout.elemento_catalogo, null, true);

		//TODO obtener vistas correspondientes a un elemento y asignarle valor
		Pizza unPizza = lista.get(posicion);

		TextView nombrePizza = view.findViewById( R.id.tv_nombre_categoria);
		nombrePizza.setText(unPizza.getNombre() );

		TextView sucursalPizza = view.findViewById( R.id.tv_sucursal_categoria);
		sucursalPizza.setText(unPizza.getSucursal() );

		ImageView logoPizza = view.findViewById( R.id.logo_categoria);
		logoPizza.setImageResource(unPizza.getImage() );


		return view;
	}
	
	@Override
	public int getCount() {		
		return lista.size();
	}

	@Override
	public Object getItem(int arg0) {
		if(lista != null){
			return lista.get(arg0);
		}
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		Pizza unPizza = lista.get(arg0);
		return unPizza.getId();
	}

}
