package com.example.essen.data;


import java.util.ArrayList;
import java.util.Date;

public class Comentarios {
    private int id;
    private String comentario;
    private float rating;
    private Usuario creador;
    private int local;

    public static ArrayList<Comentarios> comments = new ArrayList<>();


    static {

    }

    public Comentarios(String comentario, float rating, Usuario creador, int local) {
        this.comentario = comentario;
        this.rating = rating;
        this.creador = com.example.essen.data.Usuario.getUsuarioLogueado();
    }
    public static void agregarComentario( Comentarios unComentario ) {
        comments.add( unComentario );
    }
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }
}
