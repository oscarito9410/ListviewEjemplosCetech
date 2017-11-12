package com.oscar.listviewejemplos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class JugadorActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listJugador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugador);
        listJugador=(ListView)findViewById(R.id.listJugadores);
        //Origen de datos
        //Adaptador instancia
        AdapterJugador adpt=new AdapterJugador(this,obtenerJugadores());
        //Establecemos el adapter a listview de jugador
        listJugador.setAdapter(adpt);
        listJugador.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Jugador jugador=obtenerJugadores().get(position);
        Intent intent=new Intent(this,DetalleActivity.class);
        Bundle bundle=new Bundle();
        bundle.putParcelable("jugador",jugador);
        intent.putExtras(bundle);
        startActivity(intent);
    }


    private ArrayList<Jugador>obtenerJugadores(){
        ArrayList<Jugador>listJugadores=new ArrayList<>();
        listJugadores.add(new Jugador(R.drawable.guillermo_ochoa,"Guillermo Ochoa","Portero"));
        listJugadores.add(new Jugador(R.drawable.miguel_layun,"Miguel Layun","Defensa"));
        listJugadores.add(new Jugador(R.drawable.hector_moreno,"Hector Moreno","Defensa"));
        listJugadores.add(new Jugador(R.drawable.diego_reyes,"Diego Reyes","Defensa"));
        listJugadores.add(new Jugador(R.drawable.andres_guardado,"Andres Guardado","Medio"));
        listJugadores.add(new Jugador(R.drawable.elias_hernandez_elias,"Elias Hernandez","Medio"));
        listJugadores.add(new Jugador(R.drawable.giovani_dos_santos,"Giovani Dos Santos","Medio"));
        listJugadores.add(new Jugador(R.drawable.hector_herrera,"Hector Herrera","Medio"));
        listJugadores.add(new Jugador(R.drawable.javier_hernandez,"Javier Hernandez","Delantero"));
        listJugadores.add(new Jugador(R.drawable.raul_jimenez,"Raul Jimenez","Delantero"));
        return listJugadores;
    }


}
