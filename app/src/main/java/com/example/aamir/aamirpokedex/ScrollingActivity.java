package com.example.aamir.aamirpokedex;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        ImageButton bulbasaurBtn = (ImageButton) findViewById(R.id.bulbasaurBtn);
        bulbasaurBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, bulbasaurPage.class));
            }
        });

        ImageButton ivysaurBtn = (ImageButton) findViewById(R.id.ivysaurBtn);
        ivysaurBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, ivysaurPage.class));
            }
        });

        ImageButton venusaurBtn = (ImageButton) findViewById(R.id.venusaurBtn);
        venusaurBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScrollingActivity.this, venusaurPage.class));
            }
        });
    }


}
