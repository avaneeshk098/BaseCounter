package com.example.android.basecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int runs = 0;
    int outs = 0;

    public void run1(View view){
        TextView run = (TextView) findViewById(R.id.runs);
        runs += 1;
        run.setText(""+runs);
    }

    public void run2(View view){
        TextView run = (TextView) findViewById(R.id.runs);
        runs += 2;
        run.setText(""+runs);
    }

    public void run3(View view){
        TextView run = (TextView) findViewById(R.id.runs);
        runs += 3;
        run.setText(""+runs);
    }

    public void run4(View view){
        TextView run = (TextView) findViewById(R.id.runs);
        runs += 4;
        run.setText(""+runs);
    }

    public void out(View view){
        TextView out = (TextView) findViewById(R.id.outs);
        outs += 1;
        out.setText("" + outs);

    }

    int runs2 = 0;
    int outs2 = 0;

    public void run12(View view){
        TextView run = (TextView) findViewById(R.id.runs2);
        runs2 += 1;
        run.setText(""+runs2);
    }

    public void run22(View view){
        TextView run = (TextView) findViewById(R.id.runs2);
        runs2 += 2;
        run.setText(""+runs2);
    }

    public void run32(View view){
        TextView run = (TextView) findViewById(R.id.runs2);
        runs2 += 3;
        run.setText(""+runs2);
    }

    public void run42(View view){
        TextView run = (TextView) findViewById(R.id.runs2);
        runs2 += 4;
        run.setText(""+runs2);
    }

    public void out2(View view){
        TextView out = (TextView) findViewById(R.id.outs2);
        outs2 += 1;
        out.setText("" + outs2);

    }

    public void reset(View view){
        TextView runs1 = (TextView) findViewById(R.id.runs);
        TextView outs1 = (TextView) findViewById(R.id.outs);
        TextView runs22 = (TextView) findViewById(R.id.runs2);
        TextView outs22 = (TextView) findViewById(R.id.outs2);
        runs = 0;
        runs2 = 0;
        outs = 0;
        outs2 = 0;
        runs1.setText(""+0);
        outs1.setText(""+0);
        runs22.setText(""+0);
        outs22.setText(""+0);
    }
}

