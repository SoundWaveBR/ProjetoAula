package com.example.projetoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Iniciar a thread em segundo plano
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Evento de clique do botão
                findViewById(R.id.btnjogodavelha).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Criar uma Intent para iniciar uma nova Activity
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });

        // Iniciar a thread
        thread.start();
    }
}
