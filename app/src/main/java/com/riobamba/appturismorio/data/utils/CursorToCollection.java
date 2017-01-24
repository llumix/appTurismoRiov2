package com.riobamba.appturismorio.data.utils;

import android.database.Cursor;

import java.util.ArrayList;

/**
 * Created by lllum on 15/12/2016.
 */

public class CursorToCollection {


    /**
     * Convierte un objeto Cursor en un ArrayList con los nombres.
     *
     * @param c
     * @return ArrayList<String>
     */
    public static ArrayList<String> cursorToArrayNombres(Cursor c)
    {
    ArrayList<String> nombres= new ArrayList<>();
        if(c.moveToFirst())
        {
            do{
                nombres.add(c.getString(1));

            }while (c.moveToNext());

        }
        return nombres;
    }
    public static String cursorToArrayDescripcion(Cursor c)//Devuelve la descripcion de un lugar
    {
        String descripcion = "" ;
        if(c.moveToFirst())
        {

                descripcion=(c.getString(0));


        }
        return descripcion;
    }
   /* public static String[] cursorToString(Cursor cursor)
    {
        int i=0;
        String[] nombres=new String[]{};
        if(cursor.moveToFirst())
        {
            do {

                nombres[i]=cursor.getString(1);
                i++;
            }while(cursor.moveToNext());
        }
        return nombres;

    }*/
   public static String[] cursorToString(Cursor cursor)
   {
       ArrayList<String> names=new ArrayList<>();

       if(cursor.moveToFirst())
       {
           do {

               names.add(cursor.getString(0));

           }while(cursor.moveToNext());
       }
       return names.toArray(new String[names.size()]);

   }

}
