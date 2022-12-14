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
import com.example.essen.data.Otros;

import java.util.ArrayList;


public class GrupoAdaptadorOtros extends BaseAdapter {

	private final Activity actividad;
	private ArrayList<Otros> lista;
	private ArrayList<Otros> listaOriginal;

	public GrupoAdaptadorOtros(Activity actividad, ArrayList<Otros> lista){
		super();
		this.actividad = actividad;
		this.lista = lista;
		listaOriginal =new ArrayList<>();
		listaOriginal.addAll(lista);
	}

	@Override
	public View getView(int posicion, View vista, ViewGroup padre) {
		LayoutInflater inflater = actividad.getLayoutInflater();
		View view = inflater.inflate( R.layout.elemento_catalogo, null, true);

		//TODO obtener vistas correspondientes a un elemento y asignarle valor
		Otros unOtros = lista.get(posicion);

		TextView nombreOtros = view.findViewById( R.id.tv_nombre_categoria);
		nombreOtros.setText(unOtros.getNombre() );

		TextView sucursalOtros = view.findViewById( R.id.tv_sucursal_categoria);
		sucursalOtros.setText(unOtros.getSucursal() );

		ImageView logoOtros = view.findViewById( R.id.logo_categoria);
		logoOtros.setImageResource(unOtros.getImage() );


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
		Otros unOtros = lista.get(arg0);
		return unOtros.getId();
	}
	public void filterList(String text) {
		ArrayList<Otros> filteredList = new ArrayList<>();
		for (Otros otros : listaOriginal) {
			if (otros.getNombre().toLowerCase().contains(text.toLowerCase())) {
				filteredList.add(otros);
			}
		}
		lista = filteredList;

		notifyDataSetChanged();
	}

}
