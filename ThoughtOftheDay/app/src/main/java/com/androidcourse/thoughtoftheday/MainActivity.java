package com.androidcourse.thoughtoftheday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newThought(View view){


        String[] thoughtsArray = {
                "Situações dificeis, não são faceis!"
                ,
                "Cada um dá o que pode com o que tem!"
                ,
                "Força! Foco! Fé!"
                ,
                "Se caires deixa-te estar deitado! Os burpess cansam!"
        };


        TextView text = findViewById(R.id.textView);

        int number = (int)Math.floor(Math.random() * 5);

        text.setText(thoughtsArray[number]);
    }

}
