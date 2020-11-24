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
        setContentView(R.layout.activity_menu_a_s_m_r);

        // ytUSDH = (Button) findViewById(R.id.ytBreath);
        ytUSDH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBreath();
            }
        });
    }

    public void openActivityBreath() {
        ((MyApplication) this.getApplication()).setUrl("https://health.gov/myhealthfinder/topics/everyday-healthy-living/mental-health-and-relationships/get-enough-sleep#panel-8");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}