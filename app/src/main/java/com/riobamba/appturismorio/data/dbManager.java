package com.riobamba.appturismorio.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.riobamba.appturismorio.data.modelo.modeloImagen;
import com.riobamba.appturismorio.data.modelo.modeloLugar;

/**
 * Created by lllum on 19/12/2016.
 */

public class dbManager {

    private static dbHelper dbHelper;
    private static SQLiteDatabase db;
    //private static turismoRioDbManager objTurismoRioDbManager=new turismoRioDbManager();


    public dbManager(Context contexto) {
        dbHelper=new dbHelper(contexto);
    }

    /* public static turismoRioDbManager optenerIntancia(Context context){
        if(dbHelper==null)
        {
            dbHelper=new turismoRioDbHelper(context);
        }
        return objTurismoRioDbManager;
    }*/
    public void open()
    {
        db=dbHelper.getWritableDatabase();

    }

    public void close()
    {
        db.close();

    }


    //INSERTAR DATOS EN LA TABLA

    public void insertarLugar(modeloLugar lugar)
    {
        ContentValues valores= new ContentValues();

        // base = new turismoRioDBHelper(contexto);
        // db = base.getWritableDatabase();
        SQLiteDatabase db=dbHelper.getWritableDatabase();

        valores.put("idLugar",lugar.idLugar );
        valores.put("nombreLugar",lugar.nombreLugar );
        valores.put("direccionLugar",lugar.direccionLugar );
        valores.put("descripcionLugar",lugar.descripcionLugar );
        valores.put("latitudLugar",lugar.latitudLugar );
        valores.put("longitudLugar",lugar.longitudLugar );
        db.insert("lugar",null,valores);

    }

    public void insertarImagen(modeloImagen imagen)
    {
        ContentValues valores = new ContentValues();
        SQLiteDatabase db= dbHelper.getWritableDatabase();

        valores.put("idImagen",imagen.idImagen);
        valores.put("nombreImagen",imagen.nombreImagen);

        valores.put("pathImagen",imagen.pathImagen);
        valores.put("idLugar",imagen.idLugar.idLugar);
        db.insert("imagenLugar",null,valores);
    }

    public Cursor cursorCargarInformacion(String nombreLugar) //Carga la descripcion de un lugar
    {
        SQLiteDatabase db= dbHelper.getReadableDatabase();
        String query= String.format("SELECT descripcionLugar FROM lugar where nombreLugar = '"+nombreLugar+"'");
        return db.rawQuery(query,null);
    }
    public Cursor cursorCargarImagenes(String nombreLugar)
    {
        SQLiteDatabase db=dbHelper.getReadableDatabase();
        String query=String.format("select pathImagen from imagenLugar, lugar where nombreLugar='"+nombreLugar+"' and imagenLugar.idLugar=lugar.idLugar");
        return db.rawQuery(query,null);

    }



}
