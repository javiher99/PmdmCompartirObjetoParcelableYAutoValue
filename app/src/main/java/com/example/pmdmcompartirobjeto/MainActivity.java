package com.example.pmdmcompartirobjeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pmdmcompartirobjeto.Autovalue.Alumno;
import com.example.pmdmcompartirobjeto.Parcelable.Alumnos;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private EditText nombre, curso;
    private Alumno alumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.etNombre);
        curso = findViewById(R.id.etCurso);

        bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lancarActividadParcelable();
                lanzarActividadAutoValue();
            }
        });

    }

    // Hace
    private void lancarActividadParcelable() {
        Intent i = new Intent(this, MuestraAlumno.class);

        String minombre = nombre.getText().toString();
        String micurso = curso.getText().toString();

        Alumnos miAlumno = new Alumnos(1, minombre, micurso);

        // Bundle b = new Bundle();
        // b.putString("id", valorString);
        i.putExtra("alumno1", miAlumno);
        startActivity(i);
    }

    private void lanzarActividadAutoValue() {
        Intent i = new Intent(this, MuestraAlumno.class);

        String minombre = nombre.getText().toString();
        String micurso = curso.getText().toString();

        alumno = Alumno.create(1, minombre, micurso);

        // Bundle b = new Bundle();
        // b.putString("id", valorString);
        i.putExtra("alumno1", alumno);
        startActivity(i);
    }
}
