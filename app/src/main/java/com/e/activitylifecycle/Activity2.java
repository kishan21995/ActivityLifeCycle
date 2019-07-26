package com.e.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity2  onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "Activity2  onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity2  onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity2  onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity2  onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Activity2  onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toast.makeText(this, "Activity2  onCreate", Toast.LENGTH_SHORT).show();
    }
}
