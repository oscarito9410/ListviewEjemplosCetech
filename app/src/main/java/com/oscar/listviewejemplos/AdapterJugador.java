package com.oscar.listviewejemplos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by oemy9 on 12/11/2017.
 */

public class AdapterJugador extends BaseAdapter {

    private Context ctx;
    private ArrayList<Jugador>listJugador;
    private LayoutInflater layoutInflater;

    public AdapterJugador(Context ctx, ArrayList<Jugador> listJugador) {
        this.ctx = ctx;
        this.listJugador = listJugador;
        this.layoutInflater=LayoutInflater.from(this.ctx);
    }

    @Override
    public int getCount() {
        return listJugador.size();
    }

    @Override
    public Jugador getItem(int position) {
        return listJugador.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //INDICAMOS QUE RECURSO DE LAYOYT SERÁ UTILIZADO
        convertView=layoutInflater.inflate(R.layout.item_jugador,
                    parent,false);
        //REFERENCIA A LOS ELEMENTOS QUE SE ENCUENTRA EN 'item_jugador.xml'
        ImageView imgJugador=(ImageView)convertView.findViewById(R.id.imgJugador);
        TextView tvNombre=(TextView)convertView.findViewById(R.id.tvNombre);
        TextView tvPos=(TextView)convertView.findViewById(R.id.tvPos);
        //INDICAMOS LA INFORMACIÓN DEL JUGADOR QUE MOSTRAREMOS
        Jugador jugador=getItem(position);
        tvNombre.setText(jugador.getNombre());
        tvPos.setText(jugador.getPosicion());
        imgJugador.setImageResource(jugador.getImagen());

        return convertView;
    }
}
