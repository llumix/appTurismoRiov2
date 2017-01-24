package com.riobamba.appturismorio.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lllum on 19/12/2016.
 */

public class dbHelper extends SQLiteOpenHelper {

    private static int version=1;
    private static String dbName="turismoRio.db";
    private static SQLiteDatabase.CursorFactory factory=null;

    public dbHelper(Context context) {
        super(context, dbName, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE lugar (idLugar INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,nombreLugar TEXT NOT NULL, direccionLugar TEXT NOT NULL, descripcionLugar TEXT NOT NULL, latitudLugar TEXT NOT NULL, longitudLugar TEXT NOT NULL)");
        db.execSQL("CREATE TABLE imagenLugar (idImagen INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,nombreImagen TEXT NOT NULL,pathImagen TEXT NOT NULL, idLugar INTEGER NOT NULL REFERENCES lugar(idLugar) )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
