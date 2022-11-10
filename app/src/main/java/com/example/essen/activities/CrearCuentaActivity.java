package com.example.essen.activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Usuario;

public class CrearCuentaActivity extends AppCompatActivity {

    EditText campoNombreApellido;
    EditText campoTelefono;
    EditText campoEmail;
    EditText campoPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        campoNombreApellido = (EditText) findViewById(R.id.crear_cuenta_nombreapellido);
        campoTelefono = (EditText) findViewById(R.id.crear_cuenta_telefono);
        campoEmail = (EditText) findViewById(R.id.crear_cuenta_email);
        campoPassword = (EditText) findViewById(R.id.crear_cuenta_password);
    }

    public void crearCuenta(View view) {
        String nombreApellido = campoNombreApellido.getText().toString();
        String telefono = campoTelefono.getText().toString();
        String email = campoEmail.getText().toString();
        String password = campoPassword.getText().toString();

        Usuario usuario = new Usuario( nombreApellido, email, password, telefono);
        Usuario.agregarUsuario(usuario);

        Toast.makeText(getApplicationContext(), "Usuario Creado Exitosamente", Toast.LENGTH_SHORT).show();

        Intent intentLanzarLogin = new Intent( this, LoginActivity.class ) ;
        startActivity( intentLanzarLogin );
    }
}