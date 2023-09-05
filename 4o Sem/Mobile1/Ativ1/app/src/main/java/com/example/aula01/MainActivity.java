package com.example.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvT;
    private Button btnPrimeira;
    private Button btnSegunda;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvT = findViewById(R.id.tvTelas);

        btnPrimeira = findViewById(R.id.btnPrimeira);
        btnPrimeira.setOnClickListener(this);

        btnSegunda = findViewById(R.id.btnSegunda);
        btnSegunda.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnPrimeira) {
            Intent i = new Intent(getApplicationContext(), PrimeiraActivity.class);
            startActivity(i);
        }
        else if (view.getId()==R.id.btnSegunda) {
            Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
            startActivity(i);
        }
    }

    // Outra implementação do botão
    public void Voltar(View view) {
        finish();
    }
}
