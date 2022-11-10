package com.example.essen.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Comentarios;
import com.example.essen.data.Usuario;

public class ActivityComentario extends AppCompatActivity {
    String TAG = "ActivityComentario";
    private int local = -1;
    private int idcategoria = -1;
    TextView rateCount, muestraRating;
    EditText review;
    Button agregar;
    RatingBar ratingBar;
    float rateValue; String temp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentario);

        rateCount = findViewById(R.id.rateCount);
        ratingBar = findViewById(R.id.ratingBar);
        review = findViewById(R.id.review);
        agregar = findViewById(R.id.agregar);
        muestraRating = findViewById(R.id.muestraRating);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            local = extras.getInt("idLocal", -1);
            Log.i (TAG, "Local recibido: " + local);
            idcategoria = extras.getInt("idCategoria", -1);
        }

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){

            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b){

                rateValue =ratingBar.getRating();

                if (rateValue<=1 && rateValue>0)
                    rateCount.setText("Pauperrimo" +rateValue + "/5");
                else if(rateValue<=2 && rateValue>1)
                    rateCount.setText("Malo" +rateValue + "/5");
                else if(rateValue<=3 && rateValue>2)
                    rateCount.setText("Aceptable" +rateValue + "/5");
                else if(rateValue<=4 && rateValue>3)
                    rateCount.setText("Bueno" +rateValue + "/5");
                else if(rateValue<=5 && rateValue>4)
                    rateCount.setText("Muy Bueno" +rateValue + "/5");

            }


        });


        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = rateCount.getText().toString();
                String comentario = String.valueOf(review.getText());

                Toast.makeText(getApplicationContext(), "Se ha agregado tu comentario", Toast.LENGTH_SHORT).show();
                Log.i (TAG, "antes de crear comentario local: " + local);

                Comentarios comentarios = new Comentarios( idcategoria, comentario, rateValue, Usuario.getUsuarioLogueado(), local);
                Comentarios.agregarComentario(comentarios);

                Intent intent = new Intent();
                setResult(RESULT_OK, intent);

                finish();


            }




        });

    }
}
