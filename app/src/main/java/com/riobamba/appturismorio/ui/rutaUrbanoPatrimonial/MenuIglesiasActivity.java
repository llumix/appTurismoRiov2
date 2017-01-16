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

public class MenuIglesiasActivity extends AppCompatActivity {

    ListView lista ;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);


        ArrayList<cMenu> arraydatos = new ArrayList<cMenu>();
        cMenu datos;
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaLaMercedTitulo), getString(R.string.iglesiaLaMercedDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaLaBasilicaTitulo), getString(R.string.iglesiaLaBasilicaDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaSantaBarbaraTitulo), getString(R.string.iglesiaSantaBarbaraDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaSanAlfonsoTitulo), getString(R.string.iglesiaSanAlfonsoDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaSacrilegioTitulo),getString(R.string.iglesiaSacrilegioDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaConcepcionTitulo),getString(R.string.iglesiaConcepcionDireccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaCatedralTitulo),getString(R.string.iglesiaCatedralDirecccion));
        arraydatos.add(datos);
        datos=new cMenu(getResources().getDrawable(R.drawable.l),getString(R.string.iglesiaSanAntonioTitulo),getString(R.string.iglesiaSanAntonioDireccion));
        arraydatos.add(datos);

        titulo= (TextView) findViewById(R.id.txtviewTitulo);
        titulo.setText("PRINCIPALES IGLESIAS DE LA CIUDAD");

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
                        intent.putExtra("INFORMACION", "Iglesia la merced");
                        startActivity(intent);
                        break;
                    case 1:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Iglesia la basílica");
                        startActivity(intent);
                        break;
                    case 2:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Capilla de santa bárbara");
                        startActivity(intent);
                        break;
                    case 3:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Iglesia san alfonso");
                        startActivity(intent);
                        break;
                    case 4:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Capilla el sacrilegio");
                        startActivity(intent);
                        break;
                    case 5:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Iglesia la concepcion");
                        startActivity(intent);
                        break;
                    case 6:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Iglesia la catedral");
                        startActivity(intent);
                        break;

                    case 7:

                        intent = new Intent(getApplicationContext(), InformacionIglesiaActivity.class);
                        intent.putExtra("INFORMACION", "Iglesia san antonio de padua");
                        startActivity(intent);
                        break;

                }

            }
        });


    }
}
