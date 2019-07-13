package com.example.alcandroidchallenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutButton = (Button) findViewById(R.id.bt_about);
        Button myProfile = (Button) findViewById(R.id.bt_profile);

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutALCActivity.class);
                startActivity(aboutIntent);
            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myProfileIntent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(myProfileIntent);
            }
        });

    }


}
