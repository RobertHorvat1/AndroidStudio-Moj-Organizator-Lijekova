package com.example.mojorganizatorlijekova;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.prefs.BackingStoreException;

public class KorisnikAdapter extends BaseAdapter {

    private ArrayList<Korisnik> mKorisnik;
    public KorisnikAdapter(ArrayList<Korisnik> korisnik) { mKorisnik = korisnik; }
    @Override
    public int getCount() { return this.mKorisnik.size(); }
    @Override
    public Object getItem(int position) { return this.mKorisnik.get(position); }
    @Override
    public long getItemId(int position) { return position; }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder korisnikViewHolder;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_korisnik, parent, false);
            korisnikViewHolder = new ViewHolder(convertView);
            convertView.setTag(korisnikViewHolder);
        }
        else{
            korisnikViewHolder = (ViewHolder) convertView.getTag();
        }
        Korisnik book = this.mKorisnik.get(position);
        korisnikViewHolder.tvKorisnikIme.setText(book.getIme());
        korisnikViewHolder.tvKorisnikSpol.setText(book.getSpol());
        korisnikViewHolder.tvKorisnikGodine.setText(String.valueOf(book.getGodine()));
        return convertView;
    }
    public void insert(Korisnik korisnik) {
        this.mKorisnik.add(korisnik);
        this.notifyDataSetChanged();
    }
    public static class ViewHolder {
        public TextView tvKorisnikIme, tvKorisnikSpol, tvKorisnikGodine;
        public ViewHolder(View bookView) {
            tvKorisnikIme = (TextView) bookView.findViewById(R.id.tvKorisnikIme);
            tvKorisnikSpol = (TextView) bookView.findViewById(R.id.tvKorisnikSpol);
            tvKorisnikGodine = (TextView) bookView.findViewById(R.id.tvKorisnikGodine);
        }
    }
}
