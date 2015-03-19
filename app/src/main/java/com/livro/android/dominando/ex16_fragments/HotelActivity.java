package com.livro.android.dominando.ex16_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;


public class HotelActivity extends ActionBarActivity implements HotelListFragment.AoClicarNoHotel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }

    @Override
    public void clicouNoHotel(Hotel hotel) {
        if(isTablet()) {
            HotelDetalheFragment fragment = HotelDetalheFragment.novaInstancia(hotel);
            //
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.detalhe, fragment, HotelDetalheFragment.TAG_DETALHE);
            ft.commit();
        } else {
            Intent it = new Intent(this, HotelDetalheActivity.class);
            it.putExtra(HotelDetalheActivity.EXTRA_HOTEL, hotel);
            startActivity(it);
        }
    }

    private boolean isTablet() {

        return findViewById(R.id.detalhe) != null;
    }
}
