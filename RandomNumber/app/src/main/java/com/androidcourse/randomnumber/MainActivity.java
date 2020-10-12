package com.androidcourse.randomnumber;

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

    public void randomNumber (View view){
        TextView text = findViewById(R.id.textView2);
        int randomNumbers = (int) Math.ceil(Math.random() * 10);
        text.setText("And the number is: " + randomNumbers);
    }
}
