package com.example.mojorganizatorlijekova;

public class Korisnik {
    private String mIme, mSpol;
    private int mGodine;
    public Korisnik(String ime, String spol, int godine) {
        mIme = ime;
        mSpol = spol;
        mGodine = godine;
    }
    public String getIme() { return mIme; }
    public String getSpol() { return mSpol; }
    public int getGodine() { return mGodine; }
}
