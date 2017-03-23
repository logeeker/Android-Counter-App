package com.example.logeeker.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int c=0;
    TextView counterTextView ;
    Button addOneBtn;
    Button resetBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = (TextView)findViewById(R.id.editText);
        addOneBtn = (Button)findViewById(R.id.btn1);
        resetBtn = (Button)findViewById(R.id.btn2);

        addOneBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                c++;
                counterTextView.setText(c);
            }

        });

        resetBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                c=0;
                counterTextView.setText(c);
            }

        });

    }


}
