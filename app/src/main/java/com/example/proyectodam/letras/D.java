package com.example.proyectodam.letras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.example.proyectodam.R;

public class D extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
// Obtiene referencias a los botones
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button4 = findViewById(R.id.button4);

// Obtiene una instancia de Vibrator
        final Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

// Configura el OnClickListener para los botones
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vibra durante 100 milisegundos
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vibra durante 100 milisegundos
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vibra durante 100 milisegundos
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE));
            }
        });

    }

}