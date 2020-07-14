package com.example.mojorganizatorlijekova;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class PrikaziOsobnePodatkeActivity extends AppCompatActivity {
    com.example.mojorganizatorlijekova.DatabaseHelper1 myDat;
    Button prikaziSvePodatkeBtn;
    TextView prikaziText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prikazi_osobne_podatke);
        myDat = new DatabaseHelper1(this);
        prikaziSvePodatkeBtn=(Button) findViewById(R.id.prikaziSvePodatkeBtn);
        prikaziText = (TextView) findViewById(R.id.txt);
        viewAll();
    }

    public void viewAll(){
        prikaziSvePodatkeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDat.getAllData();
                if(res.getCount() == 0){
                    showMessage("Error", "Nothing found");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Id :" + res.getString(0) + "\n");
                    buffer.append("Ime :" + res.getString(1)+ "\n");
                    buffer.append("Spol :" + res.getString(2)+ "\n");
                    buffer.append("Godine :" + res.getString(3)+ "\n\n");
                }




                //show all data
                showMessage("Podaci", buffer.toString() );
            }
        });
    }
    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}