package com.example.ivan_.actividad1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public String AdecuarCadena(String Cadena){
        String cadAux = Cadena.toUpperCase().trim();
        //Sustituir letras acentuadas
        char [] vocalesAcentuadas = {'Á', 'É' , 'Í' ,'Ó', 'Ú'};
        char[] vocales = {'A','E','I','O','U', 'a','e','i','o','u'};
        for (byte pos = 0; pos < vocalesAcentuadas.length; pos++)
            cadAux.replace(vocalesAcentuadas[pos], vocales[pos]);
            return  cadAux;

    }

    public void Generar(View v){
        //Tomar la primer letra
        EditText Apellido_paterno = (EditText) findViewById(R.id.Apellido_pa);
        String apPaterno = AdecuarCadena(Apellido_paterno.getText().toString());

        Toast.makeText(this, "Cadena convertida" + apPaterno,Toast.LENGTH_LONG);
        char primerLetraAP = apPaterno.charAt(0);
        //Sustituir letras acentuadas
        char[] vocales = {'A','E','I','O','U'};

        byte pos = 0;
        boolean encontrada = false;

        for (pos = 0 ; pos < vocales.length; pos++){
            if(apPaterno.indexOf(vocales[pos])>=0){
                break;
            }
        }if (encontrada ) {
            char primervocal;
            primervocal = vocales[pos];
        }
        //Tomar la primer letra del apellido materno;

        //Tomar la primer letra del primer nombre

        //Tomar los últimos 2 digitos del año del nacimiento

        //Tomar los 2 digitos del mes de nacimiento

        //TOmar los 2 digitos del dia de nacimiento

        //Generar 3 caracteres (lestras mayúsculas o números) aleatoriamente
        String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" , "0", "2", "3", "4", "5", "6", "7", "8", "9"};
        int x= (int) (Math.random()*150) +1;
        //Concatenar los anteriror y mostrar el rfc

    }

}
