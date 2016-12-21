package com.riobamba.appturismorio.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.riobamba.appturismorio.R;
import com.riobamba.appturismorio.model.MenuAdapter;
import com.riobamba.appturismorio.model.entity.cMenu;

import java.util.ArrayList;

public class MenuUrbanoPatrimonialActivity extends AppCompatActivity {

    public ListView menuUrbano;

    private ListView tabla1;
    private ArrayList<String> nombres;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_urbano_patrimonial);

        ArrayList<cMenu> itemsMenuUrbano= new ArrayList<>();

        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Edificios",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Iglesias",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Museos",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Parques",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Mercados y Plazas",""));
        itemsMenuUrbano.add(new cMenu(getResources().getDrawable(R.mipmap.logo_riobamba),"Terminales Terrestres",""));

        menuUrbano=(ListView)findViewById(R.id.lstviewMenuUrbano);
        menuUrbano.setAdapter(new MenuAdapter(itemsMenuUrbano,R.layout.menu_principal_list_row,this)
        {
            @Override
            public void onEntrada(Object entrada, View view)
            {
                if(entrada !=null)
                {
                    TextView textoSuperior=(TextView) findViewById(R.id.txtvopcion);
                    if(textoSuperior !=null)
                    {
                        textoSuperior.setText(((cMenu) entrada).getTexto1());

                    }
                    ImageView imagenEntrada=(ImageView) findViewById(R.id.imgvlogo);
                    if (imagenEntrada !=null)
                    {
                        imagenEntrada.setImageDrawable(((cMenu) entrada).getImagen());
                    }

                }

            }


        });



    }
}
