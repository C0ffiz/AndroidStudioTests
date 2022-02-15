package com.teste.pedrapapeloutesoura;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void selecionadoPedra(View view) {
        this.opcaoSelecionada(0);
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada(1);
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada(2);
    }

    public void opcaoSelecionada(Integer opcaoSelecionada) {

        ImageView imgOponente = findViewById(R.id.imgOponente);
        TextView txtResultado = findViewById(R.id.txtResultado);

        int i = new Random().nextInt(3);

        switch (i) {
            case 0:
                imgOponente.setImageResource(R.drawable.pedra);
                break;
            case 1:
                imgOponente.setImageResource(R.drawable.papel);
                break;
            case 2:
                imgOponente.setImageResource(R.drawable.tesoura);
                break;
        }

        if (opcaoSelecionada == i){
            txtResultado.setText("Empate");
        }
        else if (
                (opcaoSelecionada == 0 && i == 2) ||
                (opcaoSelecionada == 1 && i == 0) ||
                (opcaoSelecionada == 2 && i == 1)
        ){
            txtResultado.setText("Ganhou");
        }
        else {
            txtResultado.setText("Perdeu");
        }


    }
}