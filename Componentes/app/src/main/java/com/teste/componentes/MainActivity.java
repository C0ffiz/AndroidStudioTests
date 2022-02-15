package com.teste.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoEmail;
    private EditText campoNome;
    private TextView txtNome;
    private TextView txtEmail;
    private TextView txtCor;
    private CheckBox checkVerde, checkVermelho, checkAzul;
    private RadioButton sexoMasculino, sexoFeminino;
    private TextView txtSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoEmail = findViewById(R.id.editEmail);
        campoNome = findViewById(R.id.editNome);
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtCor = findViewById(R.id.txtCor);
        checkVerde = findViewById(R.id.checkVerde);
        checkVermelho = findViewById(R.id.checkVermelho);
        checkAzul = findViewById(R.id.checkAzul);
        sexoFeminino = findViewById(R.id.radioButtonF);
        sexoMasculino = findViewById(R.id.radioButtonM);
        txtSexo = findViewById(R.id.txtSexo);
    }

    public void enviar(View view) {

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String cor = "";
        String sexo = "";

        boolean resultVerde = checkVerde.isChecked();
        txtNome.setText(nome);
        txtEmail.setText(email);


        if (checkVerde.isChecked()) {
            cor = cor + "Verde - ";
        }
        if (checkVermelho.isChecked()) {
            cor = cor + "Vermelho - ";
        }
        if (checkAzul.isChecked()) {
            cor = cor + "Azul ";
        }

        txtCor.setText(cor);


        if (sexoFeminino.isChecked()) {
            txtSexo.setText("Feminino");
        } else {
            txtSexo.setText("Masculino");
        }

        //campoEmail.setText("");
        //campoNome.setText("");

    }

}