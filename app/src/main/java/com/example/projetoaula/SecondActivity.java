package com.example.projetoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SectionIndexer;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText playerOne = findViewById(R.id.playerOne);
        EditText playerTwo = findViewById(R.id.playerTwo);
        Button startGameButton = findViewById(R.id.startGameButton);


        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getPlayerOneName = playerOne.getText().toString();
                String getPlayerTwoName = playerTwo.getText().toString();


                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                    Toast.makeText(SecondActivity.this, "Por favor insira o nome do jogador", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                    intent.putExtra("JogadorUm", getPlayerOneName);
                    intent.putExtra("JogadorDois", getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });

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