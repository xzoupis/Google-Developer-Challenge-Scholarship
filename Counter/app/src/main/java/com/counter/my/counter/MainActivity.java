package com.counter.my.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    private int scoreA = 0, scoreB = 0, pointsA = 50, pointsB = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the 1-2 button is clicked.
     */
    public void BothWin(View view) {
        switch(view.getId()) {
            case R.id.BothWinA:
                scoreA += 200;
                break;
            case R.id.BothWinB:
                scoreB += 200;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
        displayScore(scoreA,scoreB);
    }

    /**
     * This method is called when the Large Tichu button is clicked.
     */
    public void LargeTichu(View view) {
        switch(view.getId()) {
            case R.id.LargeTichuA:
                scoreA += 200;
                break;
            case R.id.LargeTichuB:
                scoreB += 200;
                break;
            case R.id.NoLargeTichuA:
                scoreA -= 200;
                break;
            case R.id.NoLargeTichuB:
                scoreB -= 200;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
        displayScore(scoreA,scoreB);
    }


    /**
     * This method is called when the Green Tichu button is clicked.
     */
    public void Tichu(View view) {
        switch(view.getId()) {
            case R.id.TichuA:
                scoreA += 100;
                break;
            case R.id.TichuB:
                scoreB += 100;
                break;
            case R.id.NoTichuA:
                scoreA -= 100;
                break;
            case R.id.NoTichuB:
                scoreB -= 100;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
        displayScore(scoreA,scoreB);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increase(View view) {
        switch (view.getId()) {
            case R.id.increaseA:
                pointsA += 5;
                pointsB -= 5;
                break;
            case R.id.increaseB:
                pointsB += 5;
                pointsA -= 5;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
        displayPoints(pointsA,pointsB);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrease(View view) {
        switch (view.getId()) {
            case R.id.decreaseA:
                pointsA -= 5;
                pointsB += 5;
                break;
            case R.id.decreaseB:
                pointsB -= 5;
                pointsA += 5;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

        displayPoints(pointsA,pointsB);

    }

    /**
     * This method is called when the Add Points button is clicked.
     */
    public void AddPoints(View view) {

        scoreA += pointsA;
        scoreB += pointsB;
        displayScore(scoreA,scoreB);
        pointsA = 50;
        pointsB = 50;
        displayPoints(pointsA,pointsB);
    }

    /**
     * This method is called when a reset button is clicked.
     */
    public void Reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScore(scoreA,scoreB);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPoints(int numberA, int numberB) {
        TextView pointsATextView = (TextView) findViewById(R.id.pointsA);
        pointsATextView.setText("" + numberA);

        TextView pointsBTextView= (TextView) findViewById(R.id.pointsB);
        pointsBTextView.setText("" + numberB);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayScore(int numberA, int numberB) {
        TextView scoreATextView = (TextView) findViewById(R.id.scoreA);
        scoreATextView.setText("" + numberA);

        TextView scoreBTextView= (TextView) findViewById(R.id.scoreB);
        scoreBTextView.setText("" + numberB);
    }


}