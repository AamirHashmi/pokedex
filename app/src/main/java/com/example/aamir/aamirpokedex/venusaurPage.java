package com.example.aamir.aamirpokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class venusaurPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venusaur_page);

        TextView venusaurName = (TextView) findViewById(R.id.venusaurName);
        venusaurName.setText(R.string.venusaurName);

        TextView pokedexEntry = (TextView) findViewById(R.id.pokedexEntry);
        pokedexEntry.setText(R.string.pokedexEntry);

        final TextView pokedexEntryText = (TextView) findViewById(R.id.pokedexEntryText);
        pokedexEntryText.setText(R.string.venusaurGen1DexEntry);

        final ToggleButton gen1Btn = (ToggleButton) findViewById(R.id.gen1Btn);
        final ToggleButton gen2Btn = (ToggleButton) findViewById(R.id.gen2Btn);
        final ToggleButton gen3Btn = (ToggleButton) findViewById(R.id.gen3Btn);

        gen1Btn.setChecked(true);

        gen1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gen2Btn.setChecked(false);
                gen3Btn.setChecked(false);
                pokedexEntryText.setText(R.string.venusaurGen1DexEntry);
            }
        });

        gen2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gen1Btn.setChecked(false);
                gen3Btn.setChecked(false);
                pokedexEntryText.setText(R.string.venusaurGen2DexEntry);
            }
        });

        gen3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gen1Btn.setChecked(false);
                gen2Btn.setChecked(false);
                pokedexEntryText.setText(R.string.venusaurGen3DexEntry);
            }
        });

        ImageButton ivysaurSpriteBtn = (ImageButton) findViewById(R.id.ivysaurSpriteBtn);
        ivysaurSpriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(venusaurPage.this, ivysaurPage.class));
            }
        });
        ImageButton bulbasaurSpriteBtn = (ImageButton) findViewById(R.id. bulbasaurSpriteBtn);
        bulbasaurSpriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(venusaurPage.this,  bulbasaurPage.class));
            }
        });

        TextView evolution = (TextView) findViewById(R.id.evolution);
        evolution.setText(R.string.evolution);

        TextView level16 = (TextView) findViewById(R.id.level16);
        level16.setText(R.string.level16);

        TextView level32 = (TextView) findViewById(R.id.level32);
        level32.setText(R.string.level32);

        TextView levelUpMoves = (TextView) findViewById(R.id.levelUpMoves);
        levelUpMoves.setText(R.string.levelUpMoves);




    }

}
