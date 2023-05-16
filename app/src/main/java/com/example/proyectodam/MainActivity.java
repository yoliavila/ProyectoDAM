package com.example.proyectodam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button juego;
Button abecedario;
Button porque;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abecedario = (Button) findViewById(R.id.vamosBtn);
        abecedario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Abecedario.class);
                startActivity(intent);
            }
        });
        juego = (Button) findViewById(R.id.jugamosBtn);
        juego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dificultad.class);
                startActivity(intent);

            }
        });
        porque = (Button) findViewById(R.id.porqueBtn);
        porque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PorQue.class);
                startActivity(intent);
            }
        });
    }
}