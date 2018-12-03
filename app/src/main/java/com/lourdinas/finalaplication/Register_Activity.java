package com.lourdinas.finalaplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register_Activity extends AppCompatActivity {

    SharedPreferences meusDados;
    public static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);
        meusDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        final EditText novoEmail = findViewById(R.id.edit_r_email);
        final EditText novaSenha = findViewById(R.id.senha1);
        final EditText confirmasenha = findViewById(R.id.conf_senha);
        Button cadastrar = (Button) findViewById(R.id.btn_registrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (novaSenha.getText().toString().equals(confirmasenha.getText().toString())){

                    SharedPreferences.Editor editor = meusDados.edit();
                    editor.putString("email", novoEmail.getText().toString());
                    editor.putString("senha", novaSenha.getText().toString());

                    editor.commit();

                    Toast.makeText(getApplicationContext(),"Dados salvos com sucesso!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Register_Activity.this, principal_Activity.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),
                            "As senhas não conferem", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}