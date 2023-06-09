package com.example.projetoaula;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultDialog extends Dialog {

    private final String message;
    private final ThirdActivity thirdActivity;

    public ResultDialog(@NonNull Context context, String message, ThirdActivity thirdActivity) {
        super(context);
        this.message = message;
        this.thirdActivity = thirdActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_dialog);

        // Encontrar os elementos de layout
        TextView messageText = findViewById(R.id.messageText);
        Button startAgainButton = findViewById(R.id.startAgainButton);

        // Definir o texto da mensagem
        messageText.setText(message);

        // Configurar o evento de clique do botão "Jogar Novamente"
        startAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirdActivity.restartMatch(); // Reiniciar a partida na atividade ThirdActivity
                dismiss(); // Fechar o diálogo
            }
        });
    }
}