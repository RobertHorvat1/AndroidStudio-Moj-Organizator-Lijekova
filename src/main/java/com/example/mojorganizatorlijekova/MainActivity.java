package com.example.mojorganizatorlijekova;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button unesiPodatkeBtnActivity = (Button) findViewById(R.id.unesiPodatkeBtn);
        unesiPodatkeBtnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), UnesiPodatkeActivity.class);
                startIntent.putExtra("com.example.roberthorvatvjeba2.SOMETHING", "Hello World!");
                startActivity(startIntent);
            }
        });
        Button prikaziPodatkeBtnActivity = (Button) findViewById(R.id.prikaziPodatkeBtn);
        prikaziPodatkeBtnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), PrikaziOsobnePodatkeActivity.class);
                startActivity(startIntent);
            }
        });
        Button unesiLijekoveBtnActivity =(Button) findViewById(R.id.unesiLijekoveBtn);
        unesiLijekoveBtnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), UnesiLijekoveActivity.class);
                startActivity(startIntent);
            }
        });
        Button prikaziListuLijekovaBtnActivity = (Button) findViewById(R.id.prikaziListuLijekovaBtn);
        prikaziListuLijekovaBtnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), PrikaziListuLijekovaActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
