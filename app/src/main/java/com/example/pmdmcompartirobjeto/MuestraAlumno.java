package com.example.pmdmcompartirobjeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.pmdmcompartirobjeto.Autovalue.Alumno;
import com.example.pmdmcompartirobjeto.Parcelable.Alumnos;
import com.example.pmdmcompartirobjeto.R;

public class MuestraAlumno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_alumno);

        Bundle bundle = getIntent().getExtras();
        Alumno student = bundle.getParcelable("alumno1");

        TextView unAlumno = findViewById(R.id.etNombre);
        String datosA1 = student.toString();

        unAlumno.setText(datosA1);
    }
}
