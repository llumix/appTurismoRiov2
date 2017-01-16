package com.riobamba.appturismorio.ui.rutaChimborazo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.riobamba.appturismorio.R;
import com.riobamba.appturismorio.model.MenuAdapter;
import com.riobamba.appturismorio.model.entity.cMenu;
import com.riobamba.appturismorio.ui.rutaUrbanoPatrimonial.InformacionIglesiaActivity;

import java.util.ArrayList;

public class MenuRutaChimborazoActivity extends AppCompatActivity {

    ListView lista ;
    TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);

        ArrayList<cMenu> arraydatos = new ArrayList<cMenu>();
        cMenu datos;
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.escaladaLaChorreraTitulo), getString(R.string.escaladaLaChorreraDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.circuitoTemploMachayTitulo), getString(R.string.circuitoTemploMachayDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.altaMontañaTitulo), getString(R.string.altaMontañaDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.circuitoPolylepisTitulo), getString(R.string.circuitoPolylepisDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.rutaCiclisticaTitulo),getString(R.string.rutaCiclisticaDireccion));
        arraydatos.add(datos);


        titulo= (TextView) findViewById(R.id.txtviewTitulo);
        titulo.setText( "PRINCIPALES RUTAS DEL CHIMBORAZO");

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
                        intent.putExtra("INFORMACION", "Escalada la chorrera");
                        startActivity(intent);
                        break;
                    case 1:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Circuito templo machay");
                        startActivity(intent);
                        break;
                    case 2:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Rutas de alta montaña");
                        startActivity(intent);
                        break;
                    case 3:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Circuito polylepis");
                        startActivity(intent);
                        break;
                    case 4:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Ruta ciclística chimborazo");
                        startActivity(intent);
                        break;

                }

            }
        });

    }
}
