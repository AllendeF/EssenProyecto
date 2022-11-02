package com.example.essen.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import com.example.essen.R;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        MotionLayout motionLayout = findViewById(R.id.splash);
        motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int startId, int endId) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int startId, int endId, float progress) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int currentId) {
                setContentView(R.layout.activity_inicio);


            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int triggerId, boolean positive, float progress) {

            }
        });

    }
    public void lanzarCrearCuenta(View view) {
        Intent intentCrearCuenta = new Intent( this, CrearCuentaActivity.class );
        startActivity( intentCrearCuenta );
    }
    public void lanzarLogin(View view) {
        Intent intentLogin = new Intent( this, LoginActivity.class );
        startActivity( intentLogin );
    }

}
