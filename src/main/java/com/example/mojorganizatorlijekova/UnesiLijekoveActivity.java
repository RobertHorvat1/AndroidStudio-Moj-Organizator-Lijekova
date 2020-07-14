package com.example.mojorganizatorlijekova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnesiLijekoveActivity extends AppCompatActivity {
    Button unesiLijekActivityBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unesi_lijekove);

         unesiLijekActivityBtn =(Button) findViewById(R.id.unesiLijekBtn);
        unesiLijekActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), UnesiLijekActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
