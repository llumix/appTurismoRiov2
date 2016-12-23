package com.riobamba.appturismorio.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.riobamba.appturismorio.R;
import com.riobamba.appturismorio.model.MenuAdapter;
import com.riobamba.appturismorio.model.entity.cMenu;
import com.riobamba.appturismorio.ui.edificios.MenuEdificiosActivity;

import java.util.ArrayList;

public class MenuUrbanoPatrimonialActivity extends AppCompatActivity {

    public ListView menuUrbano;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_urbano_patrimonial);

        ArrayList<cMenu> itemsMenuUrbano = new ArrayList<cMenu>();
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Edificios",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Iglesias",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Museos",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Parques",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Mercados y Plazas",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Terminales Terrestres",""));


        menuUrbano = (ListView) findViewById(R.id.lstviewMenuUrbano);


        menuUrbano.setAdapter(new MenuAdapter(itemsMenuUrbano, R.layout.menu_principal_list_row, this) {

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

        menuUrbano.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //cMenu elegido = (cMenu) parent.getItemAtPosition(position);

                switch (position) {
                    case 0:

                        Intent intent = new Intent(getApplicationContext(), MenuEdificiosActivity.class);
                        startActivity(intent);
                        break;
                    case 1:

                        Intent intent1 = new Intent(getApplicationContext(), MenuEdificiosActivity.class);
                        startActivity(intent1);
                        break;


                }

            }
        });



    }
}
