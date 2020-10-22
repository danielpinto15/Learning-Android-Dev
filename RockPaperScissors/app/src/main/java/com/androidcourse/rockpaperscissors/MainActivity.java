package com.androidcourse.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rockSelection(View view){
        this.selection("rock");
    }

    public void paperSelection(View view){
        this.selection("paper");
    }

    public void scissorSelection(View view){
        this.selection("scissor");
    }

    public void selection(String option){

        ImageView resultImage = findViewById(R.id.imageView);
        int number = new Random().nextInt(3);
        String[] options = {"rock", "paper", "scissor"};
        String appOption = options[number];
        TextView result = findViewById(R.id.textView2);


        switch (appOption){
            case "rock":
                resultImage.setImageResource(R.drawable.pedra);
                break;
            case "paper":
                resultImage.setImageResource(R.drawable.papel);
                break;
            case "scissor":
                resultImage.setImageResource(R.drawable.tesoura);
                break;
        }

        if(option == appOption){
            result.setText("That's a tie!!");
        } else if((option == "rock" && appOption == "paper")
                || (option == "paper" && appOption == "scissor")
                || (option == "scissor" && appOption == "rock")){

            result.setText("You Lose!");

        }else {
            result.setText("YOU WIN!!");
        }

    }
}
