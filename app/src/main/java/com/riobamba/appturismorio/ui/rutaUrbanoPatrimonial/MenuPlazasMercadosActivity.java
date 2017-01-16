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
 * Created by Administrador on 04-Jan-17.
 */

public class MenuPlazasMercadosActivity extends AppCompatActivity {

    ListView lista ;
    TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);




        ArrayList<cMenu> arraydatos = new ArrayList<cMenu>();
        cMenu datos;
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.mercadoSanFranciscoTitulo), getString(R.string.mercadoSanFranciscoDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.plazaConcepcionTitulo), getString(R.string.plazaConcepcionDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.mercadoLaMercedTitulo), getString(R.string.mercadoLaMercedDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.plazaDelTrenTitulo), getString(R.string.plazaDelTrenDireccion));
        arraydatos.add(datos);


        titulo= (TextView) findViewById(R.id.txtviewTitulo);
        titulo.setText( "PRINCIPALES PLAZAS Y MERCADOS DE LA CIUDAD");

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
