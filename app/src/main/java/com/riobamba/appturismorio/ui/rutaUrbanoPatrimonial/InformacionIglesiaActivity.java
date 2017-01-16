package com.riobamba.appturismorio.ui.rutaUrbanoPatrimonial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.riobamba.appturismorio.R;
import com.riobamba.appturismorio.data.dbAplication;

import java.util.ArrayList;
import java.util.List;

public class InformacionIglesiaActivity extends AppCompatActivity {

    private String nombreIglesia;
    private String descripcion;
    int[] imagenes= {R.mipmap.ic_launcher, R.mipmap.logo_riobamba};
    private ManejadorGaleria galeria;
    private ViewPager mViewPager;


    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */

    /**
     * The {@link ViewPager} that will host the section contents.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_iglesia);

        TextView informacion = (TextView) findViewById(R.id.txtInformacion);
        galeria = new ManejadorGaleria(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);

        Bundle extras=getIntent().getExtras();
        nombreIglesia = extras.getString("INFORMACION");
        descripcion=((dbAplication) getApplication()).getDescripcion(nombreIglesia);


        switch (nombreIglesia) {
            case("Iglesia la merced"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;
            case("Iglesia la basílica"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;

            case("Capilla de santa bárbara"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;
            case("Iglesia san alfonso"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;
            case("Capilla el sacrilegio"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;
            case("Iglesia la concepcion"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;
            case("Iglesia la catedral"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;
            case("Iglesia san antonio de padua"):
                informacion.setText(descripcion);
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[0]));
                galeria.agregarFragmentos(PlaceholderFragment.newInstance(imagenes[1]));
                break;

        }
        mViewPager.setAdapter(galeria);

        Button boton =(Button) findViewById(R.id.btnRuta);

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mapa = new Intent(getApplicationContext(), MapasActivity.class);
                mapa.putExtra("RUTA", nombreIglesia);
                startActivity(mapa);

            }
        });

    }






    // Representa un fragmento de la galeria
    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_IMAGE = "imagen";
        private int imagen;

        public PlaceholderFragment() {
        }

        //Retorna una nueva instancia del fragmento
         public static PlaceholderFragment newInstance(int imagen) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_IMAGE, imagen);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstance){
            super.onCreate(savedInstance);

            if(getArguments()!=null)
            {
                imagen  = getArguments().getInt(ARG_IMAGE);
            }

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_informacion_iglesia, container, false);
            ImageView imagenView = (ImageView) rootView.findViewById(R.id.imgInformacion);
            imagenView.setImageResource(imagen);
            return rootView;
        }
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */



    public class ManejadorGaleria extends FragmentPagerAdapter {//SectionsPagerAdapter

        List<Fragment> fragmentos;
        public ManejadorGaleria(FragmentManager fm) {
            super(fm);
            fragmentos= new ArrayList<Fragment>();
        }

        public void agregarFragmentos(Fragment fragmento)
        {
            fragmentos.add(fragmento);
        }

        @Override
        public Fragment getItem(int position) {

            return fragmentos.get(position);}// retorna las imagenes de acuerdo a su posicion

        @Override
        public int getCount() {
            return fragmentos.size();//retorna el número de imagenes a mostrar
        }


    }



}
