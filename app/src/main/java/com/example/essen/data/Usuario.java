package com.example.essen.data;

import java.util.ArrayList;

public class Usuario {
    private String nombreApellido;
    private String mail;
    private String password;
    private String telefono;

    private static Usuario usuarioLogueado;
    private static ArrayList<Usuario> usuarios;

    static {
        usuarios = new ArrayList<>();
        usuarios.add( new Usuario("Bruce Wine", "h", "h", "0900123123"));
    }

    public Usuario(String nombreApellido, String mail, String password,
                   String telefono) {
        this.nombreApellido = nombreApellido;
        this.mail = mail;
        this.password = password;
        this.telefono = telefono;
    }
    public static void agregarUsuario(Usuario usuario) {
        usuarios.add( usuario );
    }

    public static boolean comprobarCredenciales(String email, String password) {

        for( Usuario usuario : usuarios) {
            if ( email.equals(usuario.getMail()) && password.equals(usuario.getPassword())){
                return true;
            }
        }
        return false;
    }

    public static void setUsuarioLogueado(Usuario usuario) {
        usuarioLogueado = usuario;
    }

    public static Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public static Usuario getUsuario(String email ) {
        for( Usuario usuario : usuarios) {
            if ( email.equals(usuario.getMail()) ){
                return usuario;
            }
        }
        return null;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
