package com.example.kradel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menuSupplements extends AppCompatActivity {
    private Button ytBreath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_a_s_m_r);

        // ytBreath = (Button) findViewById(R.id.ytBreath);
        ytBreath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBreath();
            }
        });
    }

    public void openActivityBreath() {
        ((MyApplication) this.getApplication()).setUrl("https://www.youtube.com/results?search_query=asmr+for+sleeping");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}