package com.example.eronmac.actwellness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
}

    public void gotoWorkoutScheduleScreen (View view){

        Intent intent = new Intent(this, WorkoutSchedule.class);
        startActivity(intent);
    }

    public void gotoMealTracking (View view){

        Intent intent = new Intent(this, MealTracking.class);
        startActivity(intent);
    }

    public void gotoUserProfile (View view){

        Intent intent = new Intent(this, UserProfile.class);
        startActivity(intent);
    }
}
