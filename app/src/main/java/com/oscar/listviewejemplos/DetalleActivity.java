package com.oscar.listviewejemplos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    private Jugador selectedJugador;
    private ImageView imgJugador;
    private TextView tvNombre, tvPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imgJugador=(ImageView)findViewById(R.id.imgJugador);
        tvNombre=(TextView)findViewById(R.id.tvNombre);
        tvPos=(TextView)findViewById(R.id.tvPos);

        Bundle bundle=getIntent().getExtras();
        if(bundle.containsKey("jugador")){
            selectedJugador= bundle.getParcelable("jugador");
            imgJugador.setImageResource(selectedJugador.getImagen());
            tvNombre.setText(selectedJugador.getNombre());
            tvPos.setText(selectedJugador.getPosicion());
        }


    }
}
