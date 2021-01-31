package com.example.gamememory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        //per giocare nuova partita
        Button btnNew = (Button)findViewById(R.id.btnNew);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WinActivity.this, SecondActivity.class);
                startActivity(i);
                finish();
            }
        });

        //torna alla schermata principale
        Button btnExit = (Button)findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(WinActivity.this, MainActivity.class);
                startActivity(e);
                finish();
            }
        });

        //recupero i punti dall'attività precedente
        Bundle extras = getIntent().getExtras();
        int playerPoints = extras.getInt("point1");
        int cpuPoints = extras.getInt("point2");

        //controllo chi ha vinto
        TextView txt = (TextView)findViewById(R.id.txtPunti);
        if(playerPoints > cpuPoints){
            txt.setText("Complimenti!\nVITTOTIRA PER IL GIOCATORE 1!!\n\nP1: " + playerPoints + "\nP2: " + cpuPoints);
        }else if(playerPoints < cpuPoints){
            txt.setText("Complimenti!\nVITTOTIRA PER IL GIOCATORE 2!!\n\nP1: " + playerPoints + "\nP2: " + cpuPoints);
        }else if(playerPoints == cpuPoints){
            txt.setText("Complimenti!\nPAREGGIO!!\n\nP1: " + playerPoints + "\nP2: " + cpuPoints);
        }


    }
}