package com.oscar.listviewejemplos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class EntriesActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private ListView listAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entries);
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

        /*HashMap<String,Integer> hashAnimales=new HashMap<>();
        for(String ani: animales){
            hashAnimales.put(ani,R.raw.cat);
        }
        MediaPlayer.create(this,hashAnimales.get(animal));*/


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
