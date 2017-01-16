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
        modeloLugar objModeloLugar= new modeloLugar("1","Iglesia san antonio de padua","loma de quito","Este iglesia posee un estilo neogótico, se destacan las ventanas en forma de ojivas y la construcción de la edificación es de piedra y ladrillo visto. Pertenece al Monasterio de religiosas concepcionistas. Constituye una belleza arquitectónica y de gran valor cultural.","-094954395","-987859");
         dbManager.insertarLugar(objModeloLugar);

    }
    public ArrayList<String> getNombresLugar()
    {
        Cursor c=dbManager.cursorCargarInformacion("1");
        return CursorToCollection.cursorToArrayNombres(c);

    }

    public String getDescripcion(String nombreLugar)
    {
        Cursor c=dbManager.cursorCargarInformacion(nombreLugar);
        return CursorToCollection.cursorToArrayDescripcion(c);    }




}
