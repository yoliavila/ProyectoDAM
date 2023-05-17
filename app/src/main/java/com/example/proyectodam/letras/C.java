package com.example.proyectodam.letras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.example.proyectodam.R;

public class C extends AppCompatActivity {
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;

    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        boton3 = findViewById(R.id.button3);
        boton4 = findViewById(R.id.button4);
        boton5 = findViewById(R.id.button5);
        boton6 = findViewById(R.id.button6);


        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateForOneSecond();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateForOneSecond();
            }
        });
    }

    private void vibrateForOneSecond() {
        if (vibrator != null && vibrator.hasVibrator()) {
            // Vibrar durante un segundo (1000 milisegundos)
            vibrator.vibrate(1000);
        }
    }
}
