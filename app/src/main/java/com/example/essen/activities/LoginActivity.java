package com.example.essen.activities;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Usuario;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private EditText campoNombreUsuario;
    private EditText campoPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Inicia la creacion de la ctividad");
        setContentView(R.layout.activity_login);

        campoNombreUsuario = (EditText) findViewById( R.id.nombre_usuario );
        campoPassword = (EditText) findViewById( R.id.contrasenha );
    }

    public void iniciarSesion(View view) {
        String email = campoNombreUsuario.getText().toString();
        String password = campoPassword.getText().toString();

        if ( email.equals("") || password.equals("") ) {
//            desplegarMensajeUsuarioPasswordNoIngresado();

        } else {
            boolean estaComprobado = Usuario.comprobarCredenciales(email, password);

            if (estaComprobado) {
                Log.i(TAG, "Credenciales correctas");
                setUsuarioLogueado();
                Toast.makeText(getApplicationContext(), "Se ha iniciadio con exito", Toast.LENGTH_SHORT).show();
                Intent intentMenuPricipal = new Intent( this, MenuPrincipalActivity.class );
                startActivity( intentMenuPricipal );
            } else {
                Log.i(TAG, "Las credenciales son incorrectas");

                desplegarMensajeCredencialesIncorrectas();
//                notificar();
            }
        }

    }


    public void desplegarMensajeCredencialesIncorrectas() {
        Toast.makeText(getApplicationContext(), "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
    }

    private void setUsuarioLogueado() {
        String email = campoNombreUsuario.getText().toString();
        Usuario.setUsuarioLogueado( Usuario.getUsuario( email ));
    }
}
