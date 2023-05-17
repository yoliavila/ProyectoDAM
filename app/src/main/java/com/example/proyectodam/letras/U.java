package com.example.proyectodam.letras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import com.example.proyectodam.R;

public class U extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u);

        // Obtiene referencias a los botones
        Button button1 = findViewById(R.id.button1);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

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

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vibra durante 100 milisegundos
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vibra durante 100 milisegundos
                vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE));
            }
        });
    }
}
