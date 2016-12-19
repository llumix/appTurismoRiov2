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

}
