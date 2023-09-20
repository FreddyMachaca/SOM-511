package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //variaveis
    double num1,num2,res;
    TextView tv_resultado;
    EditText et_valor1;
    EditText et_valor2;

    @Override //sobreescritura de una clase ya existente
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos los elementos de la interfaz
        Button btn_soma = findViewById(R.id.btn_soma);
        Button btn_subtrair = findViewById(R.id.btn_subtrair);
        Button btn_multiplicar = findViewById(R.id.btn_multiplicar);
        Button btn_dividir = findViewById(R.id.btn_dividir);

        tv_resultado = findViewById(R.id.tv_resultado);
        et_valor1 = findViewById(R.id.et_valor1);
        et_valor2 = findViewById(R.id.et_valor2);

    }

    public void somar(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        res = num1 + num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void subtrair(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        res = num1 - num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void multiplicar(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        res = num1 * num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void dividir(View v){
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2 = Double.parseDouble(et_valor2.getText().toString());
        res = num1 / num2;
        if(num2 == 0){
            Toast.makeText(MainActivity.this, "Não é possível dividir por 0", Toast.LENGTH_SHORT).show();
        }
        tv_resultado.setText(String.valueOf(res));
    }

}