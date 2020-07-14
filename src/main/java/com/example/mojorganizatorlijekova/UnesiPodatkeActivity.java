package com.example.mojorganizatorlijekova;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class UnesiPodatkeActivity  extends AppCompatActivity {
    DatabaseHelper1 myDb=null;
    EditText unesiImeEditText,unesiGodineEditText, unesiSpolEditText;
    Button buttonSpremi;
    private static final String DataAdded = "Dodani podaci.";
    private static final String DataNotAdded = "Dodani nisu podaci.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unesi_podatke);
        myDb= new DatabaseHelper1(this);
        unesiImeEditText = (EditText) findViewById(R.id.editTextUnesiIme);
        unesiGodineEditText = (EditText) findViewById(R.id.editTextUnesiGodine);
        unesiSpolEditText = (EditText) findViewById(R.id.editTextUnesiSpol);
        buttonSpremi = (Button) findViewById(R.id.buttonSpremi);
        SpremiData();

    }

    public void SpremiData(){
        buttonSpremi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(unesiImeEditText.getText().toString(), unesiSpolEditText.getText().toString(), unesiGodineEditText.getText().toString() );
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
                if(isInserted = true){
                    displayToast(DataAdded);
                }else {
                    displayToast(DataNotAdded);
                }

            }
        });
    }
    public void displayToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
