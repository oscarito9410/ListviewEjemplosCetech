package com.oscar.listviewejemplos;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by oemy9 on 12/11/2017.
 */

public class Jugador implements Parcelable {
    private String nombre;
    private String posicion;
    private int imagen;


    public Jugador(int imagen, String nombre,String posicion){
        this.imagen=imagen;
        this.posicion=posicion;
        this.nombre=nombre;
    }

    public Jugador(String nombre, String posicion, int imagen) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.imagen = imagen;
    }

    protected Jugador(Parcel in) {
        nombre = in.readString();
        posicion = in.readString();
        imagen = in.readInt();
    }

    public static final Creator<Jugador> CREATOR = new Creator<Jugador>() {
        @Override
        public Jugador createFromParcel(Parcel in) {
            return new Jugador(in);
        }

        @Override
        public Jugador[] newArray(int size) {
            return new Jugador[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", imagen=" + imagen +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(posicion);
        dest.writeInt(imagen);
    }
}
