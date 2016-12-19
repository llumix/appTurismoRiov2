package com.riobamba.appturismorio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.riobamba.appturismorio.data.dbAplication;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView tabla1;
    private ArrayList<String> nombres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recojemos los datos
         nombres=((dbAplication) getApplication()).getNombresLugar();
        //creamos el adapter y le pasamos la lista de nombres
         ArrayAdapter<String> adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nombres);

        //iniciamos el listview y el asignamos el adapter
        tabla1=(ListView) findViewById(R.id.tabla1);
         tabla1.setAdapter(adapter);
    }
}
