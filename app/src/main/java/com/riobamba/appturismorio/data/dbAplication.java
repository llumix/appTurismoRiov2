package com.riobamba.appturismorio.data;

import android.app.Application;
import android.database.Cursor;

import com.riobamba.appturismorio.data.modelo.modeloLugar;
import com.riobamba.appturismorio.data.utils.CursorToCollection;

import java.util.ArrayList;

/**
 * Created by lllum on 15/12/2016.
 */

public class dbAplication extends Application {

    dbManager dbManager;

    @Override
    public void onCreate() {
        dbManager = new dbManager(getApplicationContext());
        dbManager.open();

        rellenarDatos();

        super.onCreate();
    }

    public void onTerminate(){
        dbManager.close();
        super.onTerminate();
    }

    public void rellenarDatos()
    {
        modeloLugar objModeloLugar= new modeloLugar("1","san antonio","loma de quito","es una iglesia","-094954395","-987859");
         dbManager.insertarLugar(objModeloLugar);

    }
    public ArrayList<String> getNombresLugar()
    {
        Cursor c=dbManager.cursorCargarInformacion("1");
        return CursorToCollection.cursorToArrayNombres(c);

    }




}
