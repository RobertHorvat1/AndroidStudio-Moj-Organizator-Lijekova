package com.example.mojorganizatorlijekova;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper2 extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "lijek.db";
    public static final String TABLE_NAME = "lijek_table";
    public static final String col1 = "ID";
    public static final String col2 = "Imelijeka";
    public static final String col3 = "Kolicinalijeka";
    public static final String col4 = "Trajanjelijeka";
    public static final String col5 = "Frekvencijalijeka";
    public static final String col6 = "Vrijemekoristenjalijeka";


    public DatabaseHelper2( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, ImeLijeka TEXT, KolicinaLijeka TEXT, TrajanjeLijeka TEXT, FrekvencijaLijeka TEXT, VrijemeKoristenjaLijeka TEXT )" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public  boolean insertData(String imeLijeka, String kolicinaLijeka, String trajanjeLijeka, String frekvencijaLijeka, String vrijemeKoristenjaLijeka){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col2, imeLijeka);
        contentValues.put(col3, kolicinaLijeka);
        contentValues.put(col4, trajanjeLijeka);
        contentValues.put(col5, frekvencijaLijeka );
        contentValues.put(col6, vrijemeKoristenjaLijeka);



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
