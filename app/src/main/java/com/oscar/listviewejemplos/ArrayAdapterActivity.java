package com.oscar.listviewejemplos;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        String[]animales=getResources().getStringArray(R.array.animales);
        ArrayAdapter<String>adptAnimal=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,animales);

        listAnimales.setAdapter(adptAnimal);
    }
}
