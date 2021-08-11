package com.officialputuid.syntxid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.Objects;

public class Sources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);

        Toolbar ToolBarAtasRedesign = findViewById(R.id.toolbar_redesign);
        setSupportActionBar(ToolBarAtasRedesign);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        CardView source1 = findViewById(R.id.source1);
        CardView source2 = findViewById(R.id.source2);
        CardView source3 = findViewById(R.id.source3);
        CardView source4 = findViewById(R.id.source4);
        CardView source5 = findViewById(R.id.source5);
        CardView source6 = findViewById(R.id.source6);
        CardView source7 = findViewById(R.id.source7);
        CardView source8 = findViewById(R.id.source8);

        source1.setOnClickListener(view -> clicked_icons(getString(R.string.source_l1)));
        source2.setOnClickListener(view -> clicked_icons(getString(R.string.source_l2)));
        source3.setOnClickListener(view -> clicked_icons(getString(R.string.source_l3)));
        source4.setOnClickListener(view -> clicked_icons(getString(R.string.source_l4)));
        source5.setOnClickListener(view -> clicked_icons(getString(R.string.source_l5)));
        source6.setOnClickListener(view -> clicked_icons(getString(R.string.source_l6)));
        source7.setOnClickListener(view -> clicked_icons(getString(R.string.source_l7)));
        source8.setOnClickListener(view -> clicked_icons(getString(R.string.source_l8)));
    }

    public void clicked_icons(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}