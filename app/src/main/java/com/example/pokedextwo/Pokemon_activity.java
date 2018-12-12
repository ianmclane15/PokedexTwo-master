package com.example.pokedextwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Pokemon_activity extends AppCompatActivity {

    public static final String EXTRA_POKEMONID = "pokemonID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        int poksId = (Integer)getIntent().getExtras().get(EXTRA_POKEMONID);
        Pokemon p = PokemonFamily.poks[poksId];

        TextView name = (TextView)findViewById(R.id.textview_main_name);
        name.setText(p.getName());

        TextView hp = (TextView)findViewById(R.id.textview_main_hp);
        hp.setText("HP: " + p.getHp());

        TextView attack = (TextView)findViewById(R.id.textview_main_attack);
        attack.setText("Attack: "+p.getAttack());

        TextView defense = (TextView)findViewById(R.id.textview_main_defense);
        defense.setText("Defense: "+p.getDefense());

        TextView spatk = (TextView)findViewById(R.id.textview_main_speicialattack);
        spatk.setText("Sp. Atk: "+p.getSattack());

        TextView spdef = (TextView)findViewById(R.id.textview_main_specialdefense);
        spdef.setText("Sp. Def: "+p.getSdefense());

        TextView speed = (TextView)findViewById(R.id.textview_main_speed);
        speed.setText("Speed: "+p.getSpeed());




        ImageView photo = (ImageView)findViewById(R.id.photo_main_pokemon);
        photo.setImageResource(p.getImageResourceId());
        photo.setContentDescription(p.getName());

    }




}
