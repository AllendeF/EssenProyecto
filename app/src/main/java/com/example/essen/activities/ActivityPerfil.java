package com.example.essen.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Usuario;

public class ActivityPerfil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Usuario publicador = Usuario.getUsuarioLogueado();

        TextView nombreUsuario = findViewById( R.id.nombreuser);
        nombreUsuario.setText (publicador.getNombreApellido());

        TextView mailUsuario = findViewById(R.id.mailuser);
        mailUsuario.setText(publicador.getMail());

        TextView telefonoUsuario = findViewById(R.id.telefonouser);
        telefonoUsuario.setText(publicador.getTelefono());

    }
}
