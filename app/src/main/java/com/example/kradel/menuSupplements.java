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
        setContentView(R.layout.activity_menu_supplements);

        ytSupplements = (Button) findViewById(R.id.ytSupplements);
        ytSupplements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySupplements();
            }
        });
    }

    public void openActivitySupplements() {
        ((MyApplication) this.getApplication()).setUrl("https://www.webmd.com/sleep-disorders/ss/slideshow-natural-sleep-remedies");
        Intent intent = new Intent(this, ASMR.class);
        startActivity(intent);
    }
}