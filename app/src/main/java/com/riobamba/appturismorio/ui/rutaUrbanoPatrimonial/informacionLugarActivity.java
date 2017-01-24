package com.riobamba.appturismorio.ui.rutaUrbanoPatrimonial;

import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bluejamesbond.text.DocumentView;
import com.riobamba.appturismorio.R;
import com.riobamba.appturismorio.data.dbAplication;
import com.riobamba.appturismorio.model.informacionLugarAdapter;
import com.riobamba.appturismorio.model.utils.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lllum on 17/1/2017.
 */

public class informacionLugarActivity extends AppCompatActivity {
    int position;
    private String nombreLugar;
    private String descripcion;
    private String[] imagenes;
  //  private informacionLugarActivity.ManejadorGaleria galeria;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_lugar);

        //esta es una objeto de la clase que me permite justificar el texto
        DocumentView informacion=(DocumentView) findViewById(R.id.texto);
        informacion.getDocumentLayoutParams().setHyphenated(true);
        informacion.getDocumentLayoutParams().setTextTypeface(Typeface.createFromAsset(getAssets(),"fonts/Roboto-Regular.ttf"));


        Bundle extras=getIntent().getExtras();
        nombreLugar = extras.getString("INFORMACION");
        descripcion=((dbAplication) getApplication()).getDescripcion(nombreLugar);

        informacion.setText(descripcion);

        util objUtil= new util(this,nombreLugar);

        String[] lugarImagenesList=((dbAplication) getApplication()).getRuta(nombreLugar);
        List<ImageView> images=new ArrayList<>();
        for (int i =0;i<3;i++)
        {
            ImageView imageView= new ImageView(this);
            try{
                String currentImagenFile=lugarImagenesList[i];
                InputStream is=this.getAssets().open(currentImagenFile);
                imageView.setImageBitmap(BitmapFactory.decodeStream(is));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                images.add(imageView);

            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        informacionLugarAdapter pageradapter= new informacionLugarAdapter(images);
        ViewPager viewPager=(ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(pageradapter);
        viewPager.setCurrentItem(position);


    }


}
