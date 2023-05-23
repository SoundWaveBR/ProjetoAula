package com.example.projetoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Encontrar o botão no layout

        Button backButton = findViewById(R.id.btnvoltarjogodavelha);

        // Adicionar evento de clique ao botão
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Finalizar a atividade (SecondActivity) e voltar para a tela anterior.
                finish();
            }
        });

        // Encontrar o botão dentro do View no layout
        Button viewButton = findViewById(R.id.startGameButton);

        // Adicionar evento de clique ao botão dentro do View
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a terceira atividade (ThirdActivity)
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });
    }
}