package com.riobamba.appturismorio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.riobamba.appturismorio.model.MenuAdapter;
import com.riobamba.appturismorio.model.entity.cMenu;
import com.riobamba.appturismorio.ui.MenuUrbanoPatrimonialActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView tabla1;
    private ArrayList<String> nombres;
    private ListView lista;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client2;

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

        ArrayList<cMenu> itemsMenu = new ArrayList<cMenu>();
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Ruta Urbano Patrimonial", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Ruta Chimborazo", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Ruta Puertas del Altar", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Riobamba Ferroviaria", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Rata de las Iglesias", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Terminales Terrestres", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Realidad Aumentada", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Identidad y Tradición", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Puntos de Información", ""));
        itemsMenu.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba), "Acerca de", ""));

        lista = (ListView) findViewById(R.id.tabla1);


        lista.setAdapter(new MenuAdapter(itemsMenu, R.layout.menu_principal_list_row, this) {

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

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //cMenu elegido = (cMenu) parent.getItemAtPosition(position);

                switch (position) {
                    case 0:

                        Intent intent = new Intent(getApplicationContext(), MenuUrbanoPatrimonialActivity.class);
                        startActivity(intent);
                        break;
                    case 1:

                        Intent intent1 = new Intent(getApplicationContext(), MenuUrbanoPatrimonialActivity.class);
                        startActivity(intent1);
                        break;


                }

            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2 = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client2.connect();
        AppIndex.AppIndexApi.start(client2, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client2, getIndexApiAction());
        client2.disconnect();
    }
}
