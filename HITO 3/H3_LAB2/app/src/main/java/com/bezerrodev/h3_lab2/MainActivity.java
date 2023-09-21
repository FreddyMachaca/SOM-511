package com.bezerrodev.h3_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnMostar, btnBuscar;
    private TextView edtPalabraBuscar;
    private TextView txtCantidadPalabras, txtCajaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuscar = findViewById(R.id.b1);
        edtPalabraBuscar = findViewById(R.id.et1);
        txtCantidadPalabras = findViewById(R.id.tv2);
        btnMostar = findViewById(R.id.b2);
        txtCajaTexto = findViewById(R.id.tv3);


        /*Manejo de archivos
         * Desarrollar una aplicación que permita mostrar texto,
         * extraída de un archivo llamado texto.txt y que permita
         * buscar una palabra y ver cuantas veces se repite del archivo texto.txt
         * que esta en src/main/assets
         */

        btnMostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String miTexto;
                //para Stream de conexion a archivo de disco
                InputStream myInputStram;
                //intentar abrir el archivo de texto y luego
                //guardar el contenido en un String
                try {
                    myInputStram = getBaseContext().getAssets().open("texto.txt");
                    int size = myInputStram.available();
                    byte[] buffer = new byte[size];
                    myInputStram.read(buffer);
                    myInputStram.close();
                    miTexto = new String(buffer);
                    //colocar el texto leido en la caja de texto
                    txtCajaTexto.setText(miTexto);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String delimite = " ";
                List palabras = Arrays.asList(txtCajaTexto.getText().toString().split(delimite));
                Long cantidad = palabras.stream().filter(x -> x.equals(edtPalabraBuscar.getText().toString())).count();
                txtCantidadPalabras.setText("La palabra " + edtPalabraBuscar.getText().toString() + " se repite " + cantidad + " veces");
            }
        });
    }
}