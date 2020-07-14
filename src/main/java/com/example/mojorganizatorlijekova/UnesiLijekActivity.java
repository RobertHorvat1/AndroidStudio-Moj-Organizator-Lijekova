package com.example.mojorganizatorlijekova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UnesiLijekActivity extends AppCompatActivity {
    DatabaseHelper2 myDb2=null;
    EditText unesiImeLijeka, unesiKolicinuLijeka, unesiTrajanjeLijeka, unesiFrekvencijuLijeka, unesiVrijemeKoristenjaLijeka;
    Button buttonSpremiLijek;
    private static final String DataAdded = "Dodani podaci.";
    private static final String DataNotAdded = "Dodani nisu podaci.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unesi_lijek);
        myDb2= new DatabaseHelper2(this);
        unesiImeLijeka=(EditText) findViewById(R.id.editTextUnesiImeLijeka);
        unesiKolicinuLijeka=(EditText) findViewById(R.id.editTextUnesiKolicinuLijeka);
        unesiTrajanjeLijeka=(EditText) findViewById(R.id.editTextUnesiTrajanjeLijeka);
        unesiFrekvencijuLijeka=(EditText) findViewById(R.id.editTextUnesiFrekvencijuLijeka);
        unesiVrijemeKoristenjaLijeka=(EditText) findViewById(R.id.editTextUnesiVrijemeKoristenjaLijeka);
        buttonSpremiLijek = (Button) findViewById(R.id.buttonSpremiLijek);
        SpremiDataLijeka();
    }

    public void SpremiDataLijeka(){
        buttonSpremiLijek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb2.insertData(unesiImeLijeka.getText().toString(), unesiKolicinuLijeka.getText().toString(), unesiTrajanjeLijeka.getText().toString(), unesiFrekvencijuLijeka.getText().toString(), unesiVrijemeKoristenjaLijeka.getText().toString() );

                if(isInserted = true){
                    displayToast(DataAdded);
                }else {
                    displayToast(DataNotAdded);
                }
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);

            }
        });
    }
    public void displayToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
