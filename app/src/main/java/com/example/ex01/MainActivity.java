package com.example.ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.text);
        Button btPlus = (Button) findViewById(R.id.buttonAdd);
        Button btReduce = (Button) findViewById(R.id.buttonReduce);
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                t.setText(String.valueOf(counter));
            }
        });
        btReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                t.setText(String.valueOf(counter));
            }
        });
    }
}