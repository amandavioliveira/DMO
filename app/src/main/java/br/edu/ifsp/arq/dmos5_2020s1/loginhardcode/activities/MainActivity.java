package br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.R;
import br.edu.ifsp.arq.dmos5_2020s1.loginhardcode.model.Login;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText usuarioEditText;
    private EditText senhaEditText;

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarioEditText = findViewById(R.id.edittext_user);
        senhaEditText = findViewById(R.id.edittext_senha);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnLogin){
            abrirSegundaTela();
        }
    }

    protected void abrirSegundaTela(){
        int usuario, senha;

        try{
            usuario = Integer.valueOf(usuarioEditText.getText().toString());
            senha = Integer.valueOf(senhaEditText.getText().toString());

            if (usuario != 0 && senha != 0){
                Intent intent = new Intent(this, SegundaTela.class);
                startActivity(intent);

                Login login = new Login(usuario, senha);

                login.verificarLogin();
            }else{
                Toast.makeText(this, "Os campos usuário e senha devem ser preenchidos!", Toast.LENGTH_SHORT).show();
            }
        }catch (NumberFormatException nfe){
            usuario = 0;
            senha = 0;
        }
    }
}