package com.example.gamememory;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecondActivity extends AppCompatActivity {

    TextView txt1, txt2;

    ImageView retro11, retro12, retro13, retro14, retro21, retro22, retro23, retro24, retro31, retro32, retro33, retro34;

    //array for the images
    Integer[] cardArray = {101,102,103,104,105,106,201,202,203,204,205,206};

    //immagini attuali
    int image101, image102, image103, image104, image105, image106,
            image201, image202, image203, image204, image205, image206;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);

        retro11 = (ImageView) findViewById(R.id.retro11);
        retro12 = (ImageView) findViewById(R.id.retro12);
        retro13 = (ImageView) findViewById(R.id.retro13);
        retro14 = (ImageView) findViewById(R.id.retro14);
        retro21 = (ImageView) findViewById(R.id.retro21);
        retro22 = (ImageView) findViewById(R.id.retro22);
        retro23 = (ImageView) findViewById(R.id.retro23);
        retro24 = (ImageView) findViewById(R.id.retro24);
        retro31 = (ImageView) findViewById(R.id.retro31);
        retro32 = (ImageView) findViewById(R.id.retro32);
        retro33 = (ImageView) findViewById(R.id.retro33);
        retro34 = (ImageView) findViewById(R.id.retro34);

        retro11.setTag("0");
        retro12.setTag("1");
        retro13.setTag("2");
        retro14.setTag("3");
        retro21.setTag("4");
        retro22.setTag("5");
        retro23.setTag("6");
        retro24.setTag("7");
        retro31.setTag("8");
        retro32.setTag("9");
        retro33.setTag("10");
        retro34.setTag("11");

        //caricamento immgini carte
        frontOfCardsResouces();

        //mischiare le immagini
        Collections.shuffle(Arrays.asList(cardArray));

        //cambio il colore del secondo giocatore (inattivo)
        txt2.setTextColor(Color.rgb(34,39,107));

        //11-12-13-14
        retro11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro11, theCard);
            }
        });

        retro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro12, theCard);
            }
        });

        retro13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro13, theCard);
            }
        });

        retro14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro14, theCard);
            }
        });

        //21-22-23-24
        retro21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro21, theCard);
            }
        });

        retro22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro22, theCard);
            }
        });

        retro23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro23, theCard);
            }
        });

        retro24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro24, theCard);
            }
        });

        //31-32-33-34
        retro31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro31, theCard);
            }
        });

        retro32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro32, theCard);
            }
        });

        retro33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro33, theCard);
            }
        });

        retro34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(retro34, theCard);
            }
        });
    }

    private void doStuff(ImageView iv, int card)
    {
        //imposta la corretta imagine nelle imageview
        //sostituisce l'immagine del retro della carta con l'anteriore della carta
        if(cardArray[card] == 101)
        {
            iv.setImageResource(image101);
        }else if(cardArray[card] == 102)
        {
            iv.setImageResource(image102);
        }else if(cardArray[card] == 103)
        {
            iv.setImageResource(image103);
        }else if(cardArray[card] == 104)
        {
            iv.setImageResource(image104);
        }else if(cardArray[card] == 105)
        {
            iv.setImageResource(image105);
        }else if(cardArray[card] == 106)
        {
            iv.setImageResource(image106);
        }else if(cardArray[card] == 201)
        {
            iv.setImageResource(image201);
        }else if(cardArray[card] == 202)
        {
            iv.setImageResource(image202);
        }else if(cardArray[card] == 203)
        {
            iv.setImageResource(image203);
        }else if(cardArray[card] == 204)
        {
            iv.setImageResource(image204);
        }else if(cardArray[card] == 205)
        {
            iv.setImageResource(image205);
        }else if(cardArray[card] == 206)
        {
            iv.setImageResource(image206);
        }

        //controlla quale immagina è selezionata e la salva
        if(cardNumber == 1) //se è la prima carta cliccata
        {
            firstCard = cardArray[card];
            if(firstCard > 200)
            {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        }else if(cardNumber == 2) //se è la seconda carta cliccata
        {
            secondCard = cardArray[card];
            if(secondCard > 200)
            {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            retro11.setEnabled(false);
            retro12.setEnabled(false);
            retro13.setEnabled(false);
            retro14.setEnabled(false);
            retro21.setEnabled(false);
            retro22.setEnabled(false);
            retro23.setEnabled(false);
            retro24.setEnabled(false);
            retro31.setEnabled(false);
            retro32.setEnabled(false);
            retro33.setEnabled(false);
            retro34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //controlla se l'immagini selezionate sono uguali
                    calculate();
                }
            } ,1000);
        }
    }

    private void calculate()
    {
        //se le immagini sono uguali rimuovi immagine e aggiungi punti turno resta invariato
        if(firstCard == secondCard)
        {
            //first click
            if(clickedFirst == 0)
            {
                retro11.setVisibility(View.INVISIBLE); //setto l'immagine invisibile così scompare
            }else if(clickedFirst == 1)
            {
                retro12.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 2)
            {
                retro13.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 3)
            {
                retro14.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 4)
            {
                retro21.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 5)
            {
                retro22.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 6)
            {
                retro23.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 7)
            {
                retro24.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 8)
            {
                retro31.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 9)
            {
                retro32.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 10)
            {
                retro33.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 11)
            {
                retro34.setVisibility(View.INVISIBLE);
            }

            //second click
            if(clickedSecond == 0)
            {
                retro11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 1)
            {
                retro12.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 2)
            {
                retro13.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 3)
            {
                retro14.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 4)
            {
                retro21.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 5)
            {
                retro22.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 6)
            {
                retro23.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 7)
            {
                retro24.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 8)
            {
                retro31.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 9)
            {
                retro32.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 10)
            {
                retro33.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 11)
            {
                retro34.setVisibility(View.INVISIBLE);
            }

            //aggiungi punti al corretto giocatore
            if(turn == 1)
            {
                playerPoints++; //aggiungo un punto al giocatore 1
                txt1.setText("P1: " + playerPoints);
            }else if(turn == 2)
            {
                cpuPoints++; //aggiungo un punto al giocatore 2
                txt2.setText("P2: " + cpuPoints);
            }
        }else //se le immagini sono diverse allora rigira le carte cliccate e cambia il turno
            {
                retro11.setImageResource(R.drawable.retro);
                retro12.setImageResource(R.drawable.retro);
                retro13.setImageResource(R.drawable.retro);
                retro14.setImageResource(R.drawable.retro);
                retro21.setImageResource(R.drawable.retro);
                retro22.setImageResource(R.drawable.retro);
                retro23.setImageResource(R.drawable.retro);
                retro24.setImageResource(R.drawable.retro);
                retro31.setImageResource(R.drawable.retro);
                retro32.setImageResource(R.drawable.retro);
                retro33.setImageResource(R.drawable.retro);
                retro34.setImageResource(R.drawable.retro);

                //cambia il turno del giocatore
                if(turn == 1)
                {
                    turn = 2;
                    txt1.setTextColor(Color.rgb(34,39,107));
                    txt2.setTextColor(Color.WHITE);
                }else if(turn == 2)
                {
                    turn = 1;
                    txt2.setTextColor(Color.rgb(34,39,107));
                    txt1.setTextColor(Color.WHITE);
                }
            }

        retro11.setEnabled(true);
        retro12.setEnabled(true);
        retro13.setEnabled(true);
        retro14.setEnabled(true);
        retro21.setEnabled(true);
        retro22.setEnabled(true);
        retro23.setEnabled(true);
        retro24.setEnabled(true);
        retro31.setEnabled(true);
        retro32.setEnabled(true);
        retro33.setEnabled(true);
        retro34.setEnabled(true);

        //controlla se il gioco è finito
        checkEnd();
    }

    private void checkEnd()
    {
        // se tutte le caret sono girate allora il gioco è terminato
        if(retro11.getVisibility() == View.INVISIBLE &&
                retro12.getVisibility() == View.INVISIBLE &&
                retro13.getVisibility() == View.INVISIBLE &&
                retro14.getVisibility() == View.INVISIBLE &&
                retro21.getVisibility() == View.INVISIBLE &&
                retro22.getVisibility() == View.INVISIBLE &&
                retro23.getVisibility() == View.INVISIBLE &&
                retro24.getVisibility() == View.INVISIBLE &&
                retro31.getVisibility() == View.INVISIBLE &&
                retro32.getVisibility() == View.INVISIBLE &&
                retro33.getVisibility() == View.INVISIBLE &&
                retro34.getVisibility() == View.INVISIBLE) //se tutte le immagini sono state abbinate e quinid invisibili
        {
            //se il gioco è finito allora ti porta in una nuova activity che fa vedere il vincitore e i punti dei giocatori
            //inoltre puoi giocare una nuova partita subito o tornare alla schermata principale
            Intent intent = new Intent(getApplicationContext(), WinActivity.class);
            intent.putExtra("point1", playerPoints); //passo i punti del giocatore 1
            intent.putExtra("point2", cpuPoints); //passo i punti del giocatore 2
            startActivity(intent); //avvio nuova attività
            finish();//faccio finire l'attivita corrente
        }
    }

    //"disegno" le carte giuste nelle carte da girare
    private void frontOfCardsResouces()
    {
        image101 = R.drawable.cane;
        image102 = R.drawable.gatto;
        image103 = R.drawable.volpe;
        image104 = R.drawable.panda;
        image105 = R.drawable.leone;
        image106 = R.drawable.tigre;
        image201 = R.drawable.c;
        image202 = R.drawable.g;
        image203 = R.drawable.v;
        image204 = R.drawable.p;
        image205 = R.drawable.l;
        image206 = R.drawable.t;
    }
}