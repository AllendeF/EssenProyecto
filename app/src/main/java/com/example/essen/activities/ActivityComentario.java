package com.example.essen.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Comentarios;
import com.example.essen.data.Usuario;

public class ActivityComentario extends AppCompatActivity {
    private int local;
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
            local = extras.getInt("idScreen", -1);
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
                muestraRating.setText("Tu calificación: \n" + temp + "\n" + comentario);

                Comentarios comentarios = new Comentarios( comentario, rateValue, Usuario.getUsuarioLogueado(), local);
                Comentarios.agregarComentario(comentarios);

                review.setText("");
                ratingBar.setRating(0);
                rateCount.setText("");


            }




        });

    }
}
