package com.app.kradel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuASMR extends AppCompatActivity {
    private Button ytASMR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_a_s_m_r);

        ytASMR = (Button) findViewById(R.id.ytASMR);
        ytASMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityASMR();
            }
        });
    }

    public void openActivityASMR() {
        ((MyApplication) this.getApplication()).setUrl("https://www.youtube.com/watch?v=O830yXVvxiM&list=PL6OBhoc6fvu0PFlEtJzlS2XJV9GQO7iKr&ab_channel=pokiASMR");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}