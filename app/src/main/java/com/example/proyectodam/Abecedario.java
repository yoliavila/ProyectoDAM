package com.example.proyectodam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectodam.letras.A;
import com.example.proyectodam.letras.B;
import com.example.proyectodam.letras.C;
import com.example.proyectodam.letras.D;
import com.example.proyectodam.letras.E;
import com.example.proyectodam.letras.F;
import com.example.proyectodam.letras.G;
import com.example.proyectodam.letras.H;
import com.example.proyectodam.letras.I;
import com.example.proyectodam.letras.J;
import com.example.proyectodam.letras.K;
import com.example.proyectodam.letras.L;
import com.example.proyectodam.letras.M;
import com.example.proyectodam.letras.N;
import com.example.proyectodam.letras.O;
import com.example.proyectodam.letras.P;
import com.example.proyectodam.letras.Q;
import com.example.proyectodam.letras.S;
import com.example.proyectodam.letras.T;
import com.example.proyectodam.letras.U;
import com.example.proyectodam.letras.V;
import com.example.proyectodam.letras.W;
import com.example.proyectodam.letras.X;
import com.example.proyectodam.letras.Y;
import com.example.proyectodam.letras.Z;

public class Abecedario extends AppCompatActivity {
Button botonA;
Button botonB;
Button botonC;
Button botonD;
Button botonE;
Button botonF;
Button botonG;
Button botonH;
Button botonI;
Button botonJ;
Button botonK;
Button botonL;
Button botonM;
Button botonN;
Button botonO;
Button botonP;
Button botonQ;
Button botonR;
Button botonS;
Button botonT;
Button botonU;
Button botonV;
Button botonW;
Button botonX;
Button botonY;
Button botonZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abecedario);
        botonA = (Button) findViewById(R.id.botonA);
        botonB = (Button) findViewById(R.id.botonB);
        botonC = (Button) findViewById(R.id.botonC);
        botonD = (Button) findViewById(R.id.botonD);
        botonE = (Button) findViewById(R.id.botonE);
        botonF = (Button) findViewById(R.id.botonF);
        botonG = (Button) findViewById(R.id.botonG);
        botonH = (Button) findViewById(R.id.botonH);
        botonI = (Button) findViewById(R.id.botomI);
        botonJ = (Button) findViewById(R.id.botonJ);
        botonK = (Button) findViewById(R.id.botonK);
        botonL = (Button) findViewById(R.id.botonL);
        botonM = (Button) findViewById(R.id.botonM);
        botonN = (Button) findViewById(R.id.botonN);
        botonO = (Button) findViewById(R.id.botonO);
        botonP = (Button) findViewById(R.id.botonP);
        botonQ = (Button) findViewById(R.id.botonQ);
        botonR = (Button) findViewById(R.id.botonR);
        botonS = (Button) findViewById(R.id.botonS);
        botonT = (Button) findViewById(R.id.botonT);
        botonU = (Button) findViewById(R.id.botonU);
        botonV = (Button) findViewById(R.id.botonV);
        botonW= (Button) findViewById(R.id.botonW);
        botonX = (Button) findViewById(R.id.botonX);
        botonY = (Button) findViewById(R.id.botonY);
        botonZ = (Button) findViewById(R.id.botonZ);

        botonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, A.class );
                startActivity(intent);
            }
        });
        botonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, B.class );
                startActivity(intent);
            }
        });
        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, C.class );
                startActivity(intent);
            }
        });

        botonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, D.class );
                startActivity(intent);
            }
        });

        botonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, E.class );
                startActivity(intent);
            }
        });

        botonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, F.class );
                startActivity(intent);
            }
        });

        botonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, G.class );
                startActivity(intent);
            }
        });


        botonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, H.class );
                startActivity(intent);
            }
        });


        botonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, I.class );
                startActivity(intent);
            }
        });


        botonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, J.class );
                startActivity(intent);
            }
        });


        botonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, K.class );
                startActivity(intent);
            }
        });


        botonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, L.class );
                startActivity(intent);
            }
        });


        botonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, M.class );
                startActivity(intent);
            }
        });


        botonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, N.class );
                startActivity(intent);
            }
        });


        botonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, O.class );
                startActivity(intent);
            }
        });

        botonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, P.class );
                startActivity(intent);
            }
        });

        botonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, Q.class );
                startActivity(intent);
            }
        });

        botonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, R.class );
                startActivity(intent);
            }
        });

        botonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, S.class );
                startActivity(intent);
            }
        });

        botonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, T.class );
                startActivity(intent);
            }
        });

        botonU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, U.class );
                startActivity(intent);
            }
        });

        botonV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, V.class );
                startActivity(intent);
            }
        });

        botonW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, W.class );
                startActivity(intent);
            }
        });

        botonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, X.class );
                startActivity(intent);
            }
        });

        botonY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, Y.class );
                startActivity(intent);
            }
        });

        botonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Abecedario.this, Z.class );
                startActivity(intent);
            }
        });




    }
}