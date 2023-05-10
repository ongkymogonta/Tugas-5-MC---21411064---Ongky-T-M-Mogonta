package com.example.tugas_5_mc_211411064_ongky;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvclub;
    private ArrayList<ClubModel> list = new ArrayList<>();

    private String title = "Daftar Club";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvclub =findViewById(R.id.rv_club);
        rvclub.setHasFixedSize(true);
        list.addAll(ClubData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvclub.setLayoutManager(new LinearLayoutManager(this));
        CardViewClubAdapter cardViewMoviesAdapter = new CardViewClubAdapter(list, this);
        rvclub.setAdapter(cardViewMoviesAdapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}