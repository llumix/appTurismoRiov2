package com.riobamba.appturismorio.ui.rutaUrbanoPatrimonial;

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

import java.util.ArrayList;

/**
 * Created by Administrador on 03-Jan-17.
 */

public class MenuEdificiosActivity extends AppCompatActivity {
    ListView lista ;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);



        ArrayList<cMenu> arraydatos = new ArrayList<cMenu>();
        cMenu datos;
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioSRITitulo), getString(R.string.edificioSRIDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioCorreoTitulo), getString(R.string.edificioCorreoDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioCasaCaleroTitulo), getString(R.string.edificioCasaCaleroDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioGobernacionTitulo), getString(R.string.edificioGobernacionDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioOlimpicoTitulo),getString(R.string.edificioOlimpicoDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioCasaBolivarTitulo),getString(R.string.edificioCasaBolivarDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioCasaIndependenciaTitulo),getString(R.string.edificioCasaIndependenciaDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioPalacioMunicipalTitulo),getString(R.string.edificioPalacioMunicipalDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioPlazaTorosTitulo),getString(R.string.edificioPlazaTorosDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioRelojLaraTitulo),getString(R.string.edificioRelojLaraDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioEstacionTitulo),getString(R.string.edificioEstacionDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioMaldonadoTitulo),getString(R.string.edificioMaldonadoDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.edificioTeatroLeonTitulo),getString(R.string.edificioTeatroLeonDireccion));
        arraydatos.add(datos);

        titulo= (TextView) findViewById(R.id.txtviewTitulo);
        titulo.setText( "PRINCIPALES EDIFICIOS DE LA CIUDAD");

        lista = (ListView)findViewById(R.id.lstviewRuta);
        lista.setAdapter(new MenuAdapter(arraydatos, R.layout.ruta_list_row, this)  {

            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView texto_superior_entrada = (TextView) view.findViewById(R.id.txtviewTitulo);
                    if (texto_superior_entrada != null)
                        texto_superior_entrada.setText(((cMenu) entrada).getTexto1());

                    TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.txtviewDescripcion);
                    if (texto_inferior_entrada != null)
                        texto_inferior_entrada.setText(((cMenu) entrada).getTexto2());



                    ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagviewImagen);
                    if (imagen_entrada != null)
                        imagen_entrada.setImageDrawable(((cMenu) entrada).getImagen());
                }


            }
        });


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "La Merced");
                        startActivity(intent);
                        break;
                    case 1:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Capilla de Santa Barbara");
                        startActivity(intent);
                        break;
                    case 2:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "San Alfonso");
                        startActivity(intent);
                        break;
                    case 3:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Capilla el Sacrilegio");
                        startActivity(intent);
                        break;
                    case 4:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "La Concepcion");
                        startActivity(intent);
                        break;
                    case 5:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "La Catedral");
                        startActivity(intent);
                        break;
                    case 6:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "San Antonio de Padua");
                        startActivity(intent);
                        break;

                }

            }
        });

    }
}
