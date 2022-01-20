package com.psp.progress_indicator_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public class MainActivity extends AppCompatActivity {

    Button btnStartRound, btnStopRound,btnStartLinear,btnStopLinear;
    CircularProgressIndicator circularProgressIndicator;
    LinearProgressIndicator linearProgressIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartRound = findViewById(R.id.btnStartRound);
        btnStopRound = findViewById(R.id.btnStopRound);
        circularProgressIndicator = findViewById(R.id.circularProgressIndicator);

        btnStartLinear = findViewById(R.id.btnStartLinear);
        btnStopLinear = findViewById(R.id.btnStopLinear);
        linearProgressIndicator = findViewById(R.id.linearProgressIndicator);


        btnStartRound.setOnClickListener(v-> {
            circularProgressIndicator.setVisibility(View.VISIBLE);
        });

        btnStopRound.setOnClickListener(v-> {
            circularProgressIndicator.setVisibility(View.INVISIBLE);
        });

        btnStartLinear.setOnClickListener(v-> {
            linearProgressIndicator.setVisibility(View.VISIBLE);
        });

        btnStopLinear.setOnClickListener(v-> {
            linearProgressIndicator.setVisibility(View.INVISIBLE);
        });
    }
}