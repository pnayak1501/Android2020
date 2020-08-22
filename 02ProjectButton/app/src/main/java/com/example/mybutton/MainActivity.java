package com.example.mybutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button bluebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.mybtn);
        bluebutton = findViewById(R.id.bluebtn);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("TEST","Clicked");
//            }
//        });

//        bluebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("blue","blue clicked!");
//            }
//        });


    }

    public void bluePressed(View v){
////        Log.d("blue","clicked blue via method");

//        Context context = getApplicationContext();
//        String text = "Hello From Blue";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context,text,duration);
//        toast.show();

        Toast.makeText(getApplicationContext(),"Hello there from blue",Toast.LENGTH_SHORT).show();
        // we can use the keyword this instead of getApplicationContext()
    }


    public void redPressed(View v){
//        Log.d("red","clicked red via method");
        Context context = getApplicationContext();
        String text = "Hello From Red";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }
}