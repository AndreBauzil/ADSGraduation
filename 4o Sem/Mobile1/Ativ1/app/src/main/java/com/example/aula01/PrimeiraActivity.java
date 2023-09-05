package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PrimeiraActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText ed1;
    private TextView txt1;
    private Button btnEnviar;
    private Button btnToast;
    public String texto="";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        ed1 = findViewById(R.id.edtNome);
        txt1 = findViewById(R.id.txtLabelNome);

        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);

        btnToast = findViewById(R.id.btnToast);
        btnToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnEnviar) {
            String nome = ed1.getText().toString();
            String mensagem = "Olá, " + nome;
            texto = mensagem;
            txt1.setText(texto);
        }
        else if (view.getId()==R.id.btnToast) {
            Toast.makeText(getApplicationContext(),texto,Toast.LENGTH_LONG).show();
        }

    }

    // Outra implementação do botão
    public void Voltar(View view) {
        finish();
    }
}