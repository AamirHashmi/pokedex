package com.example.aamir.aamirpokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ivysaurPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivysaur_page);

        TextView ivysaurName = (TextView) findViewById(R.id.ivysaurName);
        ivysaurName.setText(R.string.ivysaurName);

        TextView pokedexEntry = (TextView) findViewById(R.id.pokedexEntry);
        pokedexEntry.setText(R.string.pokedexEntry);

        final TextView pokedexEntryText = (TextView) findViewById(R.id.pokedexEntryText);
        pokedexEntryText.setText(R.string.ivysaurGen1DexEntry);

        final ToggleButton gen1Btn = (ToggleButton) findViewById(R.id.gen1Btn);
        final ToggleButton gen2Btn = (ToggleButton) findViewById(R.id.gen2Btn);
        final ToggleButton gen3Btn = (ToggleButton) findViewById(R.id.gen3Btn);

        gen1Btn.setChecked(true);

        gen1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gen2Btn.setChecked(false);
                gen3Btn.setChecked(false);
                pokedexEntryText.setText(R.string.ivysaurGen1DexEntry);
            }
        });

        gen2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gen1Btn.setChecked(false);
                gen3Btn.setChecked(false);
                pokedexEntryText.setText(R.string.ivysaurGen2DexEntry);
            }
        });

        gen3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gen1Btn.setChecked(false);
                gen2Btn.setChecked(false);
                pokedexEntryText.setText(R.string.ivysaurGen3DexEntry);
            }
        });

        ImageButton bulbasaurSpriteBtn = (ImageButton) findViewById(R.id.bulbasaurSpriteBtn);
        bulbasaurSpriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ivysaurPage.this, bulbasaurPage.class));
            }
        });
        ImageButton venusaurSpriteBtn = (ImageButton) findViewById(R.id.venusaurSpriteBtn);
        venusaurSpriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ivysaurPage.this, venusaurPage.class));
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
