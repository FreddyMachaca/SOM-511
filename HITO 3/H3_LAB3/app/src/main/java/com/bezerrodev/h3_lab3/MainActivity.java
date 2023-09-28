package com.bezerrodev.h3_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMensaje;
    ListView lvPaises;

    private String paises[] = {"Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil"};
    private String poblacion[] = {"45.000.000", "18.000.000", "7.000.000", "11.000.000", "32.000.000", "16.000.000", "210.000.000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMensaje = findViewById(R.id.tv1);
        lvPaises = findViewById(R.id.lv1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.view_list_item, paises);
        lvPaises.setAdapter(adaptador);

        lvPaises.setOnItemClickListener((parent, view, position, id) -> {
            tvMensaje.setText("La poblacion de " + lvPaises.getItemAtPosition(position) + " es de " + poblacion[position] + " habitantes");
        });
    }
}