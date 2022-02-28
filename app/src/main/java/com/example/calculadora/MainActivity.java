package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    private EditText editTextA;
    private EditText editTextB;
    private TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextNumberA);
        editTextB = findViewById(R.id.editTextNumberB);
        textViewResultado = findViewById(R.id.textViewResultado);
    }
    public void sumar(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) + Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");

    }
    public void restar (View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) - Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");

    }
    public void multiplicar(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) * Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");

    }
    public void dividir(View view){
        int operacion = Integer.parseInt(editTextA.getText().toString()) / Integer.parseInt(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");

    }
}