package com.androidcourse.switchandstuff;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Switch switchButton;
    private TextView result;
    private TextView result2;
    private ProgressBar progressBar;
    private ProgressBar waitingProgressBar;
    private int progress = 0;
    private SeekBar seekBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        switchButton = findViewById(R.id.switch1);
        result = findViewById(R.id.resultado);
        result2 = findViewById(R.id.textView7);
        progressBar = findViewById(R.id.progressBar);
        waitingProgressBar = findViewById(R.id.progressBar2);
        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                result2.setText("Progress " + progress + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //result2.setText("Start");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //result2.setText("Stop");
            }
        });

        listener();
    }


    public void search(View view){
        result2.setText("Progress " + seekBar.getProgress());
    }




    public void progressBar(View view){

        this.progress = this.progress + 1;
        progressBar.setProgress(this.progress);

        waitingProgressBar.setVisibility(View.VISIBLE);

        if(this.progress == 10){
            waitingProgressBar.setVisibility(View.GONE);
        }
    }

    public void dialog(View view){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle("Dialog Tittle");
        alertDialog.setMessage("Dialog Message");

        alertDialog.setCancelable(false);
        alertDialog.setIcon(android.R.drawable.ic_btn_speak_now);

        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Success!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "no no no!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        alertDialog.create();
        alertDialog.show();


    }


    public void toast(View view){
        /*Toast.makeText(
                getApplicationContext(),
                "Sucess!!!",
                Toast.LENGTH_LONG
        ).show();*/


        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(android.R.drawable.star_big_off);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imageView);
        toast.show();
    }


    public void listener(){
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    result.setText("Switch On");
                }else{
                    result.setText("Switch Off");
                }
            }
        });
    }

    public void send(View view){

        if(switchButton.isChecked()){
            result.setText("Switch On");
        }else{
            result.setText("Switch Off");
        }
    }




}