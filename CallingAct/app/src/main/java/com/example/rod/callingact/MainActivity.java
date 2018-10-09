package com.example.rod.callingact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Log.d("Event: ", "onCreate invoked");

        Button btn = (Button) findViewById(R.id.btnCall);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, receipe.class);
                TextView txt = (TextView) findViewById(R.id.txtTitle);
                myIntent.putExtra("foodTitle", txt.getText().toString());
                startActivity(myIntent);

            }
        });
//        Log.d("MainActivity: ", "onCreate called");
    }

}
