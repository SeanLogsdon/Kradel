package com.example.kradel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuUSDH extends AppCompatActivity {
    private Button ytUSDH;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usdh);

        ytUSDH = (Button) findViewById(R.id.ytUSDH);
        ytUSDH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityUSDH();
            }
        });
    }

    public void openActivityUSDH() {
        ((MyApplication) this.getApplication()).setUrl("https://health.gov/myhealthfinder/topics/everyday-healthy-living/mental-health-and-relationships/get-enough-sleep");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}