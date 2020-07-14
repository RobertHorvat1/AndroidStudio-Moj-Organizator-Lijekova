package com.example.mojorganizatorlijekova;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper1 extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "korisnik.db";
    public static final String TABLE_NAME = "korisnik_table";
    public static final String col1 = "ID";
    public static final String col2 = "Ime";
    public static final String col3 = "Spol";
    public static final String col4 = "Godine";


    public DatabaseHelper1( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Ime TEXT, Spol TEXT, Godine INTEGER )" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public  boolean insertData(String ime, String spol, String godine){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col2, ime);
        contentValues.put(col3, spol);
        contentValues.put(col4, godine);



        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1){
            return  false;
        }else {
            return  true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME,null);
        return res;
    }

}

