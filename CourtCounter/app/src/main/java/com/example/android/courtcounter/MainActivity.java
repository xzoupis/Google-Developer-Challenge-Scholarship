package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA=0, scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when a +3 button is clicked.
     */
    public void addThree(View view) {
        switch (view.getId()) {
            case R.id.add3TeamA:
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.add3TeamB:
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

    }


    /**
     * This method is called when a +2 button is clicked.
     */
    public void addTwo(View view) {
        switch (view.getId()) {
            case R.id.add2TeamA:
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.add2TeamB:
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

    }

    /**
     * This method is called when a +1 button is clicked.
     */
    public void addOne(View view) {
        switch (view.getId()) {
            case R.id.add1TeamA:
                scoreTeamA += 1;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.add1TeamB:
                scoreTeamB += 1;
                displayForTeamB(scoreTeamB);
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }

    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void Reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
