package com.example.lab33;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityThree extends AppCompatActivity implements View.OnClickListener {
    String s = "відповідь прийнято";
    Button btn;

    final String TAG = "States";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        btn = findViewById(R.id.btnActFour);
        btn.setOnClickListener(this);
        Log.d(TAG, "onCreate(): ActivityThree");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): ActivityThree");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): ActivityThree");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): ActivityThree");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): ActivityThree");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): ActivityThree");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): ActivityThree");
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActFour:
                Intent intent = new Intent(this, ActivityFour.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void addPointA(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointB(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void addPointC(View v) {
        // підрахунок поінтів
        display(s);
    }
    public void display(String s) {
        TextView scoreView = findViewById(R.id.txt);
        scoreView.setText(String.valueOf(s));
    }
}
