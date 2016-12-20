package com.riobamba.appturismorio.model.entity;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrador on 15-Nov-16.
 */
public class cMenu {

    protected Long id;
    protected Drawable imagen;
    protected String texto1;
    protected String texto2;


    public cMenu(Drawable imagen, String texto1, String texto2) {
        this.imagen = imagen;
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }
}
