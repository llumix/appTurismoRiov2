package com.riobamba.appturismorio.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Administrador on 15-Nov-16.
 */
public abstract class MenuAdapter extends BaseAdapter {

    private ArrayList<?> entradas;
    private int R_layout_IdView;
    private Context contexto;

    public MenuAdapter(ArrayList<?> entradas, int r_layout_IdView, Context contexto) {
        this.entradas = entradas;
        R_layout_IdView = r_layout_IdView;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return entradas.size();
    }

    @Override
    public Object getItem(int position) {
        return entradas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R_layout_IdView, null);
        }
        onEntrada (entradas.get(position), convertView);
        return convertView;
    }


     public void onEntrada(Object entrada, View convertView){

     }
}
