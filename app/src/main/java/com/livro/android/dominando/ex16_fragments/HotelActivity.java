package com.livro.android.dominando.ex16_fragments;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class HotelActivity extends ActionBarActivity implements HotelListFragment.AoClicarNoHotel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
    }

    @Override
    public void clicouNoHotel(Hotel hotel) {
        Intent intent = new Intent(this, HotelDetalheActivity.class);
        intent.putExtra(HotelDetalheActivity.EXTRA_HOTEL, hotel);
        startActivity(intent);
    }
}
