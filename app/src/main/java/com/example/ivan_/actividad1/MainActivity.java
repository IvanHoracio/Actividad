package com.example.ivan_.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GenerarRFC(View v){
        //Tomar la primer letra y primer vocal del apellido paterno
        EditText Apellido_paterno = (EditText) findViewById(R.id.Apellido_pa);
        char primerLetraAP = Apellido_paterno.getText().charAt(0);

        char[] vocales = {'A','E','I','O','U', 'a','e','i','o','u'};
        String cadAux = "";
        Character LetraAP = new Character(cadAux.charAt())
        //Tomar la primer letra del apellido materno;

        //Tomar la primer letra del primer nombre

        //Tomar los últimos 2 digitos del año del nacimiento

        //Tomar los 2 digitos del mes de nacimiento

        //TOmar los 2 digitos del dia de nacimiento

        //Generar 3 caracteres (lestras mayúsculas o números) aleatoriamente

        //Concatenar los anteriror y mostrar el rfc

    }
}
