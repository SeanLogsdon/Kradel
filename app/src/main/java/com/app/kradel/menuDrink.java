package com.app.kradel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuDrink extends AppCompatActivity {
    private Button ytDrink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_drink);

        ytDrink = (Button) findViewById(R.id.ytDrink);
        ytDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBreath();
            }
        });
    }

    public void openActivityBreath() {
        ((MyApplication) this.getApplication()).setUrl("https://www.healthline.com/nutrition/drinks-that-help-you-sleep");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}