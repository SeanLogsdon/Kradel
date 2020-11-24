package com.example.kradel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuSounds extends AppCompatActivity {
    private Button ytSounds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sounds);

        ytSounds = (Button) findViewById(R.id.ytSounds);
        ytSounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySounds();
            }
        });
    }

    public void openActivitySounds() {
        ((MyApplication) this.getApplication()).setUrl("https://www.youtube.com/watch?v=8Ad-YfhbIvY");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}