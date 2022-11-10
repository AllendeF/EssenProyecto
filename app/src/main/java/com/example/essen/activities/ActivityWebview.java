package com.example.essen.activities;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.essen.R;
import com.example.essen.data.Comentarios;
import com.example.essen.data.Hamburguesas;
import com.example.essen.data.Otros;
import com.example.essen.data.Pizza;

import java.util.ArrayList;

public class ActivityWebview extends AppCompatActivity {
    String TAG = "ActivityWebview";
    private WebView webview;
    private int local = -1;
    private int idcategoria = -1;
    private Hamburguesas unHamburguesa;
    private Otros unOtros;
    private Pizza unPizza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            local = extras.getInt("idLocal", -1);
            Log.i (TAG, "Local recibido: " + local);
            idcategoria = extras.getInt("idCategoria", -1);
        }
        if (idcategoria == 1) {
            unHamburguesa = Hamburguesas.hambur.get(local);
            webview.loadUrl(unHamburguesa.getLink());
        } else if (idcategoria == 2) {
            unPizza = Pizza.pizza.get(local);
            webview.loadUrl(unPizza.getLink());
        } else if (idcategoria == 3) {
            unOtros = Otros.otros.get(local);
            webview.loadUrl(unOtros.getLink());
        }
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }


}
