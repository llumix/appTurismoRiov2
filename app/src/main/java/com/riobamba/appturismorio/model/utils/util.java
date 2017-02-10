package com.riobamba.appturismorio.model.utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lllum on 17/1/2017.
 */

public class util {
    public static Context self;
    public String name;

    public util(Context contexto,String name) {
        this.name = name;
        this.self=contexto;

    }
    public String loadJson()
    {
        String json=null;
        try {
            InputStream is=self.getAssets().open(name+".json");
            int size=is.available();
            byte[] buffer=new byte[size];
            is.read(buffer);
            is.close();
            json=new String(buffer,"UTF-8");

        }catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
        return json;
    }
    public String[] loadAssets()
    {
        String[] images=new String []{};
        try {
            images=self.getAssets().list(name);


        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return images;
    }
    public int getCount()
    {
        int cantidad=0;
        try {
            cantidad=self.getAssets().list(name).length;

        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return cantidad;

    }
}
