package com.riobamba.appturismorio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.riobamba.appturismorio.data.dbAplication;
import com.riobamba.appturismorio.model.entity.cMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView tabla1;
    private ArrayList<String> nombres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  //recojemos los datos
         nombres=((dbAplication) getApplication()).getNombresLugar();
        //creamos el adapter y le pasamos la lista de nombres
         ArrayAdapter<String> adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nombres);

        //iniciamos el listview y el asignamos el adapter
        tabla1=(ListView) findViewById(R.id.tabla1);
         tabla1.setAdapter(adapter);*/

        ArrayList<cMenu> itemsMenu = new ArrayList<>();
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Ruta Urbano Patrimonial", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Ruta Chimborazo", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Ruta Puertas del Altar", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Riobamba Ferroviaria", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Rata de las Iglesias", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Terminales Terrestres", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Realidad Aumentada", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Identidad y Tradición", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Puntos de Información", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_iglesia), "Acerca de", ""));


    }
}
