package com.example.projetoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Encontrar os elementos de layout
        EditText playerOne = findViewById(R.id.playerOne);
        EditText playerTwo = findViewById(R.id.playerTwo);
        Button startGameButton = findViewById(R.id.startGameButton);

        // Definir evento de clique para o botão "Iniciar Jogo"
        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obter os nomes dos jogadores digitados nos campos de texto
                String getPlayerOneName = playerOne.getText().toString();
                String getPlayerTwoName = playerTwo.getText().toString();

                // Verificar se os nomes dos jogadores estão vazios
                if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()) {
                    if (getPlayerOneName.isEmpty()) {
                        Toast.makeText(SecondActivity.this, "Por favor, adicione o nome do jogador 1", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(SecondActivity.this, "Por favor, adicione o nome do jogador 2", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Criar uma Intent para iniciar a terceira atividade (ThirdActivity) e passar os nomes dos jogadores
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("playerOne", getPlayerOneName);
                    intent.putExtra("playerTwo", getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });

        // Encontrar o botão "Voltar" no layout
        Button backButton = findViewById(R.id.btnvoltarjogodavelha);

        // Definir evento de clique para o botão "Voltar"
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finalizar a atividade atual (SecondActivity) e voltar para a tela anterior
                finish();
            }
        });
    }
}
