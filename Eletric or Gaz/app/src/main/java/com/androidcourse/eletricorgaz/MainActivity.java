package com.androidcourse.eletricorgaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText eletricPrice, gazPrice;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void calculator(View view){
        eletricPrice =  findViewById(R.id.caixa1);
        gazPrice =  findViewById(R.id.caixa2);
        result = findViewById(R.id.textView2);

        String eletricPriceText = eletricPrice.getText().toString();
        String gazPriceText = gazPrice.getText().toString();



        boolean boxValues = checked(eletricPriceText, gazPriceText);

        //if (boxValues){

            double valueElectric = Double.parseDouble(eletricPriceText);
            double valueGaz = Double.parseDouble(gazPriceText);

            if(valueElectric / valueGaz >= 0.7){
                result.setText("Use Eletricity");
            }else {
                result.setText("Use Gaz");
            }
        //}else {
           // result.setText("Fill the boxes");
        //}
    }

    public boolean checked(String pElet, String pGaz){
        boolean haveValues = true;


        if (pElet == null || pElet.equals("") || pGaz == null || pGaz.equals("")){
            haveValues = false;

        }

        return haveValues;
    }

}
