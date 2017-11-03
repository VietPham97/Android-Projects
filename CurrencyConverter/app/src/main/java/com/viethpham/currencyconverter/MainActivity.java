package com.viethpham.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        EditText usdAmountEditText = (EditText) findViewById(R.id.USDAmountEditText);

        Double usdAmount = Double.parseDouble(usdAmountEditText.getText().toString());

        Double cadAmount = usdAmount * 1.27;

        Toast.makeText(this, "C$" + String.format("%.2f", cadAmount), Toast.LENGTH_SHORT).show();

        Log.i("USD", "$" + usdAmountEditText.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
