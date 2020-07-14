package com.example.mojorganizatorlijekova;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrikaziListuLijekovaActivity extends AppCompatActivity {
    com.example.mojorganizatorlijekova.DatabaseHelper2 myDat2;
    Button prikaziLijekoveBtn;
    TextView prikaziText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prikazi_listu_lijekova);
        myDat2 = new DatabaseHelper2(this);
        prikaziLijekoveBtn=(Button) findViewById(R.id.prikaziLijekoveBtn);
        prikaziText2 = (TextView) findViewById(R.id.txt);
        viewAll();
    }

    public void viewAll(){
        prikaziLijekoveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDat2.getAllData();
                if(res.getCount() == 0){
                    showMessage("Error", "Nothing found");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Id :" + res.getString(0) + "\n");
                    buffer.append("Ime lijeka :" + res.getString(1)+ "\n");
                    buffer.append("Kolicina lijeka :" + res.getString(2)+ "\n");
                    buffer.append("Trajanje lijeka :" + res.getString(3)+ "\n\n");
                    buffer.append("Frekvencija lijeka :" + res.getString(4)+ "\n\n");
                    buffer.append("Vrijeme trajanja lijeka :" + res.getString(5)+ "\n\n");
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
