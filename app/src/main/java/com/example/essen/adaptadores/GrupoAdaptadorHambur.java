package com.example.essen.adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.essen.R;
import com.example.essen.data.Hamburguesas;

import java.util.ArrayList;


public class GrupoAdaptadorHambur extends BaseAdapter {

	private final Activity actividad;
	private final ArrayList<Hamburguesas> lista;

	public GrupoAdaptadorHambur(Activity actividad, ArrayList<Hamburguesas> lista){
		super();
		this.actividad = actividad;
		this.lista = lista;
	}
	
	@Override
	public View getView(int posicion, View vista, ViewGroup padre) {
		LayoutInflater inflater = actividad.getLayoutInflater();
		View view = inflater.inflate( R.layout.elemento_catalogo_hambur, null, true);

		//TODO obtener vistas correspondientes a un elemento y asignarle valor
		Hamburguesas unHamburguesa = lista.get(posicion);

		TextView nombreHamburguesa = view.findViewById( R.id.tv_nombre_hambur);
		nombreHamburguesa.setText(unHamburguesa.getNombre() );

		TextView sucursalHamburguesa = view.findViewById( R.id.tv_sucursal_hambur);
		sucursalHamburguesa.setText(unHamburguesa.getSucursal() );

		ImageView logoHamburguesa = view.findViewById( R.id.logo_hambur);
		logoHamburguesa.setImageResource(unHamburguesa.getImage() );


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
		Hamburguesas unHamburguesa = lista.get(arg0);
		return unHamburguesa.getId();
	}

}
