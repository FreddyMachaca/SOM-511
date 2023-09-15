package com.bezerrodev.h3_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String user = "admin";
    private String password = "1234";
    private String textoMensaje = "Usuario o contraseña incorrectos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario = findViewById(R.id.et1);
        EditText Contrasena = findViewById(R.id.et2);
        Button ingresar = findViewById(R.id.bt1);
        TextView mensaje = findViewById(R.id.tv4);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usuario.getText().toString().equals(user) && Contrasena.getText().toString().equals(password)) {
                    //mensaje.setText("Bienvenido");
                    Intent i;
                    i = new Intent(MainActivity.this, WelcomeActivity.class);
                    i.putExtra("NUser", usuario.getText().toString());
                    startActivity(i);
                } else {
                    //mensaje.setText(textoMensaje);
                    Toast.makeText(MainActivity.this, textoMensaje, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}