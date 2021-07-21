package com.famous.footballscorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int countA = 0;
    int foulA = 0;
    int throwInA = 0;

    int countB = 0;
    int foulB = 0;
    int throwInB = 0;

    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void addThrowB(View view) {
        throwInB = throwInB + 1;
        addThrow2(throwInB);
    }

    private void addThrow2(int throwInB) {
        score = findViewById(R.id.throwCountB);
        score.setText(String.valueOf(throwInB));
    }

    public void addFoulB(View view) {
        foulB = foulB + 1;
        addFoul2(foulB);
    }

    private void addFoul2(int foulB) {
        score = findViewById(R.id.foulCountB);
        score.setText(String.valueOf(foulB));
    }

    public void addScoreB(View view) {
        countB = countB + 1;
        addScore2(countB);
    }

    private void addScore2(int countB) {
       score = findViewById(R.id.scoreCountB);
        score.setText(String.valueOf(countB));
    }

    public void addThrowA(View view) {
        throwInA = throwInA + 1;
        addThrowIn(throwInA);
    }

    private void addThrowIn(int throwInA) {
        score = findViewById(R.id.throwCountA);
        score.setText(String.valueOf(throwInA));
    }

    public void addFoulA(View view) {
        foulA = foulA + 1;
        addFoul(foulA);
    }

    private void addFoul(int foulA) {
       score = findViewById(R.id.foulCountA);
        score.setText(String.valueOf(foulA));
    }

    public void addScoreA(View view) {
        countA = countA + 1;
        addScore(countA);
    }

    private void addScore(int countA) {
        score = findViewById(R.id.scoreCountA);
        score.setText(String.valueOf(countA));
    }

    public void resetBtn(View view) {

        countA = 0;
        foulA = 0;
        throwInA = 0;

       addScore(countA);
       addFoul(foulA);
       addThrowIn(throwInA);

       countB = 0;
       foulB = 0;
       throwInB = 0;

       addScore2(countB);
       addFoul2(foulB);
       addThrow2(throwInB);
    }


}