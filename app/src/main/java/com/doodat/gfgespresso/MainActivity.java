package com.doodat.gfgespresso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button english, german, french, hindi, urdu;
    TextView preferred_language;


    public void onClick(View view) {

        // whenever a user chooses a preferred language by tapping button, it changes the chosen language textView.

        switch (view.getId()){
            case R.id.english:
                preferred_language.setText("English");
                break;
            case R.id.french:
                preferred_language.setText("French");
                break;
            case R.id.german:
                preferred_language.setText("German");
                break;
            case R.id.hindi:
                preferred_language.setText("Hindi");
                break;
            case R.id.urdu:
                preferred_language.setText("Urdu");
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        english = findViewById(R.id.english);
        german = findViewById(R.id.german);
        french = findViewById(R.id.french);
        hindi = findViewById(R.id.hindi);
        urdu = findViewById(R.id.urdu);
        preferred_language = findViewById(R.id.preferred_language);

    }
}