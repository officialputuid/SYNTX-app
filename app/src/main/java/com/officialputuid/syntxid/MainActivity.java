package com.officialputuid.syntxid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, initializationStatus -> {
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CardView aboutTrigger = findViewById(R.id.aboutTrigger);
        CardView sourcesTrigger = findViewById(R.id.sourcesTrigger);
        CardView blogTrigger = findViewById(R.id.blogTrigger);
        CardView donationTrigger = findViewById(R.id.donationTrigger);

        aboutTrigger.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), About.class);
            startActivity(i);
        });
        sourcesTrigger.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Sources.class);
            startActivity(i);
        });
        blogTrigger.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Blog.class);
            startActivity(i);
        });
        donationTrigger.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Donation.class);
            startActivity(i);
        });

        TextView clickedFacebook = findViewById(R.id.clickedFacebook);
        TextView clickedInstagram = findViewById(R.id.clickedInstagram);
        TextView clickedTwitter = findViewById(R.id.clickedTwitter);
        TextView clickedTelegram = findViewById(R.id.clickedTelegram);
        TextView clickedGithub = findViewById(R.id.clickedGithub);

        clickedFacebook.setOnClickListener(view -> {
            clicked_icons("https://facebook.com/officialputuid");
        });

        clickedInstagram.setOnClickListener(view -> {
            clicked_icons("https://instagram.com/officialputuid");
        });

        clickedTwitter.setOnClickListener(view -> {
            clicked_icons("https://twitter.com/officialputuid");
        });

        clickedTelegram.setOnClickListener(view -> {
            clicked_icons("https://telegram.com/officialputuid");
        });

        clickedGithub.setOnClickListener(view -> {
            clicked_icons("https://github.com/officialputuid");
        });

    }

    public void clicked_icons(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}