package com.example.taruc.cheeeeeeeeeeeeee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resources
        //layout = folder
        setContentView(R.layout.activity_main);

        //TextView = class, testViewMsg = instance;

        textViewMsg = findViewById(R.id.textView);


    }
    public void showMessage(View view){
        textViewMsg.setText("Hellow, -,-");
    }
    public void showMessage1(View view){
        textViewMsg.setText(" -,-");
    }
    public void showMessage2(View view){
        textViewMsg.setText(", -,-");
    }
}
