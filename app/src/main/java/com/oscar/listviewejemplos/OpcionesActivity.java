package com.oscar.listviewejemplos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpcionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
    }

    public void entries(View view) {
        Intent intent=new Intent(this,EntriesActivity.class);
        startActivity(intent);
    }

    public void arrayAdapter(View view) {
        Intent intent=new Intent(this,ArrayAdapterActivity.class);
        startActivity(intent);
    }


    public void baseAdapter(View view) {
        Intent intent=new Intent(this,JugadorActivity.class);
        startActivity(intent);
    }
}
