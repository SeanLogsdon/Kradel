package com.example.kradel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuSupplements extends AppCompatActivity {
    private Button ytSupplements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_a_s_m_r);

        ytSupplements = (Button) findViewById(R.id.ytSupplements);
        ytSupplements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySupplements();
            }
        });
    }

    public void openActivitySupplements() {
        ((MyApplication) this.getApplication()).setUrl("https://health.gov/myhealthfinder/topics/everyday-healthy-living/mental-health-and-relationships/get-enough-sleep");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}