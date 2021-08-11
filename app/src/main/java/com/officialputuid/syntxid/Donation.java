package com.officialputuid.syntxid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Objects;

public class Donation extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        MobileAds.initialize(this, initializationStatus -> {
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Toolbar ToolBarAtasRedesign = findViewById(R.id.toolbar_redesign);
        setSupportActionBar(ToolBarAtasRedesign);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        CardView clickedTrakteer = findViewById(R.id.clickedTrakteer);

        clickedTrakteer.setOnClickListener(view -> {
            clicked_icons("https://trakteer.id/officialputuid");
        });

        CardView clickedTGC = findViewById(R.id.clickedTGC);
        CardView clickedTCP = findViewById(R.id.clickedTCP);
        CardView clickedTLG = findViewById(R.id.clickedTLG);

        clickedTGC.setOnClickListener(view -> {
            clicked_icons("https://t.me/SYNTXchat");
        });

        clickedTCP.setOnClickListener(view -> {
            clicked_icons("https://t.me/SYNTXchannel");
        });

        clickedTLG.setOnClickListener(view -> {
            clicked_icons("https://t.me/SYNTXlogs");
        });
    }

    public void clicked_icons(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}