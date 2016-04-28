package com.example.jiwoo.belikebillmemegeneratorhw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        TextView line1 = (TextView) findViewById(R.id.textView);
        TextView line2 = (TextView) findViewById(R.id.textView3);
        TextView line3 = (TextView) findViewById(R.id.textView4);
        TextView line4 = (TextView) findViewById(R.id.textView5);
        TextView line5 = (TextView) findViewById(R.id.textView6);

        line1.setText("This is " + name + ".");
        line4.setText(name + " is smart.");
        line5.setText("Be like " + name + ".");

        int randomScript = (int) Math.floor(Math.random()*6);
        switch(randomScript) {
            case 0:
                line2.setText(name + " never reads messages of his or her significant other.");
                line3.setText(name + " knows that would break the relationship.");
                break;
            case 1:
                line2.setText(name + " doesn't search for quotes by famous people on Google and then share them on Facebook.");
                line3.setText(name + " knows that's stupid.");
                break;
            case 2:
                line2.setText(name + " doesn't shout at the TV when the football is on.");
                line3.setText(name + " is aware that they cannot hear him.");
                break;
            case 3:
                line2.setText(name + " doesn't live in a virtual life.");
                line3.setText(name + " doesn't ask people to like his photos.");
                break;
            case 4:
                line2.setText(name + " likes football.");
                line3.setText(name + " doesn't argue who's better between Ronaldo and Messi.");
                break;
            case 5:
                line2.setText(name + " enjoys CS.");
                line3.setText(name + " doesn't feel a compelling need to start a startup every day.");
                break;
        }
    }
}
