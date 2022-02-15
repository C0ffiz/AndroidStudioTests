package com.teste.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fraseNova(View view){
        String[] frases= {
                "Frase1",
                "Frase2",
                "Frase3",
                "Frase4"
        };

        TextView texto = findViewById(R.id.txt_frase);
        int random1 = new Random().nextInt(4);
                texto.setText(frases[random1]);

    }
}