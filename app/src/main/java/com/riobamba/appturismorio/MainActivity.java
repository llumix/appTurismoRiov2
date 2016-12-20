package com.riobamba.appturismorio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.riobamba.appturismorio.data.dbAplication;
import com.riobamba.appturismorio.model.MenuAdapter;
import com.riobamba.appturismorio.model.entity.cMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView tabla1;
    private ArrayList<String> nombres;
    private ListView lista;

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
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Ruta Urbano Patrimonial", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Ruta Chimborazo", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Ruta Puertas del Altar", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Riobamba Ferroviaria", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Rata de las Iglesias", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Terminales Terrestres", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Realidad Aumentada", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Identidad y Tradición", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Puntos de Información", ""));
        itemsMenu.add( new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Acerca de", ""));

        lista= (ListView) findViewById(R.id.tabla1);
        lista.setAdapter(new MenuAdapter(itemsMenu, R.layout.menu_principal_list_row, this)
        {
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView texto_superior_entrada = (TextView) view.findViewById(R.id.txtvopcion);
                    if (texto_superior_entrada != null)
                        texto_superior_entrada.setText(((cMenu) entrada).getTexto1());



                    ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imgvlogo);
                    if (imagen_entrada != null)
                        imagen_entrada.setImageDrawable(((cMenu) entrada).getImagen());
                }
            }
        });

    }
}
