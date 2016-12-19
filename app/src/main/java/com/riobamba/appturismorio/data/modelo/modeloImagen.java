package com.riobamba.appturismorio.data.modelo;

/**
 * Created by lllum on 15/12/2016.
 */

public class modeloImagen {
    public String idImagen;
    public String nombreImagen;
    public String pathImagen;
    public modeloLugar idLugar;

    public modeloImagen(String idImagen, String nombreImagen, String pathImagen, modeloLugar idLugar) {

        this.idImagen = idImagen;
        this.nombreImagen = nombreImagen;
        this.pathImagen = pathImagen;
        this.idLugar = idLugar;
    }

    public String getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(String idImagen) {
        this.idImagen = idImagen;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getPathImagen() {
        return pathImagen;
    }

    public void setPathImagen(String pathImagen) {
        this.pathImagen = pathImagen;
    }

    public modeloLugar getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(modeloLugar idLugar) {
        this.idLugar = idLugar;
    }
}
