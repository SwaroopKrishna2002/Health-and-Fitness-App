package com.example.health_thing;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class workplan extends AppCompatActivity {

    private TextView wplan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_plan);

        wplan = findViewById(R.id.wplan);

        Intent intent = getIntent();
        String workoutPlan = intent.getStringExtra("workoutplan");
        wplan.setText(workoutPlan);
    }
}