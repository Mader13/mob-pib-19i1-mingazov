package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CalculatorLogic calculator;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        int[] buttonActionsIDs = new int[] {
                R.id.clear, R.id.divide, R.id.multiply,
                R.id.plus, R.id.minus, R.id.equals, R.id.percent
        };

        int[] buttonNumsIDs = new int[] {
                R.id.zero, R.id.one, R.id.two, R.id.three,
                R.id.four, R.id.five, R.id.six, R.id.seven,
                R.id.eight, R.id.nine, R.id.dot
        };

        calculator = new CalculatorLogic();

        View.OnClickListener btnNumOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onNumPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        View.OnClickListener btnActionOnClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                calculator.onActionPressed(view.getId());
                text.setText(calculator.getText());
            }
        };

        for (int i = 0; i < buttonNumsIDs.length; i++) {
            findViewById(buttonNumsIDs[i]).setOnClickListener(btnNumOnClickListener);
        }
        for (int i = 0; i < buttonActionsIDs.length; i++) {
            findViewById(buttonActionsIDs[i]).setOnClickListener(btnActionOnClickListener);
        }

        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.clear();
                text.setText(calculator.getText());
            }
        });
    }
}