package com.example.rod.callingact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class receipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("foodTitle");
        TextView txtView = (TextView) findViewById(R.id.txtFoodTitle);
        txtView.setText(message);

        Button btn = (Button) findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        Log.d("receipe", "onCreate called");
    }
}
