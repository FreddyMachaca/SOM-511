package com.bezerrodev.h3_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private String name = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView NomUsuario = findViewById(R.id.tv6);
        name = getIntent().getStringExtra("NUser");
        NomUsuario.setText("Usuario Ingresado: " + name);
    }
}