package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.R;
import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.model.Login;

public class SegundaTela extends AppCompatActivity {

    private EditText resultadoEditText;

    private Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        resultadoEditText.findViewById(R.id.edittext_resultado);

        if(login.verificarLogin()){
            resultadoEditText.setText("Bem vindo" + login.getProntuario());
        }else{
            resultadoEditText.setText("Erro no Login");
        }
    }
}