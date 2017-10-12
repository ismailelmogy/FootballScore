package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.footballscore.R.drawable.zamalek;

public class MainActivity extends AppCompatActivity {

    TextView zamalekGoal;

    TextView zamalekFoul;

    TextView zamalekOFFside;

    TextView alahlyGoal;

    TextView alahlyFoul;

    TextView alahlyOffside;


    int goalScoreOfZamalek = 0;

    int foulScoreOfZamalek = 0 ;

    int offsideScoreOfZamalek = 0;

    int goalScoreOfAlahly= 0;

    int foulScoreOfAlahly = 0 ;

    int offsideScoreOfAlahly = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zamalekGoal =(TextView)findViewById(R.id.zamalek_goal);
        zamalekFoul =(TextView)findViewById(R.id.zamalek_foul);
        zamalekOFFside=(TextView)findViewById(R.id.zamalek_offside);
        alahlyGoal=(TextView)findViewById(R.id.alahly_goal);
        alahlyFoul=(TextView)findViewById(R.id.alahly_foul);
        alahlyOffside=(TextView)findViewById(R.id.alahly_offside);
    }


    public void addGoalForZamalek(View view){

        goalScoreOfZamalek++;
        zamalekGoal.setText(String.valueOf(goalScoreOfZamalek));
    }

    public void addFoulForZamalek(View view){

        foulScoreOfZamalek++;
        zamalekFoul.setText(String.valueOf(foulScoreOfZamalek));
    }

    public void addOffsideForZamalek(View view){

        offsideScoreOfZamalek++;
        zamalekOFFside.setText(String.valueOf(offsideScoreOfZamalek));
    }


    public void addGoalForAlahly(View view){

        goalScoreOfAlahly++;
        alahlyGoal.setText(String.valueOf(goalScoreOfAlahly));
    }

    public void addFoulForAlahly(View view){

        foulScoreOfAlahly++;
        alahlyFoul.setText(String.valueOf(foulScoreOfAlahly));
    }

    public void addOffsideForAlahly(View view){

        offsideScoreOfAlahly++;
        alahlyOffside.setText(String.valueOf(offsideScoreOfAlahly));
    }


    /*
    this methos is used to set values of goals,fouls and offsides for both teams
     */

    public void reset(View view){

        goalScoreOfAlahly=goalScoreOfZamalek = 0;
        foulScoreOfAlahly=foulScoreOfZamalek = 0;
        offsideScoreOfAlahly=offsideScoreOfZamalek = 0;
        zamalekGoal.setText(String.valueOf(goalScoreOfZamalek));
        zamalekFoul.setText(String.valueOf(foulScoreOfZamalek));
        zamalekOFFside.setText(String.valueOf(offsideScoreOfZamalek));
        alahlyGoal.setText(String.valueOf(goalScoreOfAlahly));
        alahlyFoul.setText(String.valueOf(foulScoreOfAlahly));
        alahlyOffside.setText(String.valueOf(offsideScoreOfAlahly));

    }
}

