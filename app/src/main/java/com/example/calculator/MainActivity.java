package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void plusFunc(View view){
        EditText int1 = (EditText) findViewById(R.id.int1);
        EditText int2 = (EditText) findViewById(R.id.int2);
        double ans = Integer.parseInt(int1.getText().toString()) + Integer.parseInt(int2.getText().toString());
        goToActivity2(ans);
    }

    public void subFunc(View view){
        EditText int1 = (EditText) findViewById(R.id.int1);
        EditText int2 = (EditText) findViewById(R.id.int2);
        double ans = Integer.parseInt(int1.getText().toString()) - Integer.parseInt(int2.getText().toString());
        goToActivity2(ans);
    }

    public void mulFunc(View view){
        EditText int1 = (EditText) findViewById(R.id.int1);
        EditText int2 = (EditText) findViewById(R.id.int2);
        double ans = Integer.parseInt(int1.getText().toString()) * Integer.parseInt(int2.getText().toString());
        goToActivity2(ans);
    }

    public void divFunc(View view){
        EditText int1 = (EditText) findViewById(R.id.int1);
        EditText int2 = (EditText) findViewById(R.id.int2);
        double ans = Integer.parseInt(int1.getText().toString()) / Integer.parseInt(int2.getText().toString());
        goToActivity2(ans);
    }

    public void goToActivity2(double i){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",String.valueOf(i));
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}