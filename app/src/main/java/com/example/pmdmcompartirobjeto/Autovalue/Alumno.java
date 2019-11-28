package com.example.pmdmcompartirobjeto.Autovalue;

import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Alumno implements Parcelable {
    @NonNull public abstract int id();
    @NonNull public abstract String nombre();
    public abstract String curso();

    public static Alumno create(int id, String nom, String grado){
        return new AutoValue_Alumno(id, nom, grado);
    }

}
