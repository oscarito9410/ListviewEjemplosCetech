package com.oscar.listviewejemplos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by oemy9 on 12/11/2017.
 */
public class BaseActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    protected ListView listAnimales;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        listAnimales=(ListView)findViewById(R.id.listAnimales);
        listAnimales.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String []animales=getResources().getStringArray(R.array.animales);
        String animal=animales[position];
        String mensajeSeleccionado=getString(R.string.has_seleccionado);
        Toast.makeText(this,mensajeSeleccionado.concat(" ").concat(animal),
                Toast.LENGTH_SHORT).show();

        switch (animal.toLowerCase()){
            case "perro":
                MediaPlayer.create(this,R.raw.dog).start();
                break;
            case "gato":
                MediaPlayer.create(this,R.raw.cat).start();
                break;
            case "cerdo":
                MediaPlayer.create(this,R.raw.pig).start();
                break;
            case "caballo":
                MediaPlayer.create(this,R.raw.horse).start();
                break;
            default:

                break;
        }
    }
}
