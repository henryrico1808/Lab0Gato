package com.example.henry.lab0gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String o,x;
    int cono = 0;
    int conx = 0;
    int con = 0;

    Button btn0,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btng;
    EditText etganador;
    String gana = "Ganador ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        etganador = findViewById(R.id.editText);
        btng = findViewById(R.id.button10);


       // public static void ganador(){


        //}
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                con = 0;
                btn0.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                etganador.setText("GATO");


            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn0.setText("O");
                }else{
                    btn0.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Ganador X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Ganador O");
                }
                //ganador;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn2.setText("O");
                }else{
                    btn2.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn3.setText("O");
                }else{
                    btn3.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }



            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn4.setText("O");
                }else{
                    btn4.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn5.setText("O");
                }else{
                    btn5.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn6.setText("O");
                }else{
                    btn6.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn7.setText("O");
                }else{
                    btn7.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn8.setText("O");
                }else{
                    btn8.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con++;
                if(con%2==0){
                    btn9.setText("O");
                }else{
                    btn9.setText("X");
                }
                if (btn0.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //
                if (btn0.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                if (btn7.getText().equals("X") && btn5.getText().equals("X") && btn3.getText().equals("X")) {
                    etganador.setText("Gana X");
                }
                //-----------------------------------
                if (btn0.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                //
                if (btn0.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {
                    etganador.setText("Gana O");
                }
                if (btn7.getText().equals("O") && btn5.getText().equals("O") && btn3.getText().equals("O")) {
                    etganador.setText("Gana O");
                }


            }
        });


    }
}
