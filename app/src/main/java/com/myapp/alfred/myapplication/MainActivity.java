package com.myapp.alfred.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public void convertFun(View view) {
        EditText moneyEditText = (EditText) findViewById(R.id.moneyEditText);
        String textFromET = moneyEditText.getText().toString();
        double hkd = Double.parseDouble(textFromET);
        double usd = hkd / 7.8;
        String usdRound = df2.format(usd);
        Toast.makeText(this, textFromET + " HKD = " + usdRound + " USD", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
