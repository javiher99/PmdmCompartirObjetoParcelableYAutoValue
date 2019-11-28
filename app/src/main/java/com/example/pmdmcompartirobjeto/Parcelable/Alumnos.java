package com.example.pmdmcompartirobjeto.Parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Alumnos implements Parcelable {

    private long id;
    private String nombre;
    private String curso;

    // Constructor
    public Alumnos(long id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
    }

    // Parte Parcelable
    protected Alumnos(Parcel in) {
        id = in.readLong();
        nombre = in.readString();
        curso = in.readString();
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // ToString
    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    // Metodos del Parcelable

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(nombre);
        dest.writeString(curso);
    }

    // Creator de Alumnos
    public static final Creator<Alumnos> CREATOR = new Creator<Alumnos>() {
        @Override
        public Alumnos createFromParcel(Parcel in) {
            return new Alumnos(in);
        }

        @Override
        public Alumnos[] newArray(int size) {
            return new Alumnos[size];
        }
    };
}
