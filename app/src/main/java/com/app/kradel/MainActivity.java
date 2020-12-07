package com.app.kradel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonASMR;
    private Button buttonBreath;
    private Button buttonDrink;
    private Button buttonSounds;
    private Button buttonSupplements;
    private Button buttonUSDH;

        @Override
         protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonASMR = (Button) findViewById(R.id.buttonASMR);
        buttonASMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMenuASMR();
            }
        });
        buttonBreath = (Button) findViewById(R.id.buttonBreath);
        buttonBreath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMenuBreath();
            }
        });
        buttonDrink = (Button) findViewById(R.id.buttonDrink);
        buttonDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMenuDrink();
            }
        });
        buttonSounds = (Button) findViewById(R.id.buttonSoothing);
        buttonSounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMenuSounds();
            }
        });
        buttonSupplements = (Button) findViewById(R.id.buttonSupplements);
        buttonSupplements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMenuSupplements();
            }
        });
        buttonUSDH = (Button) findViewById(R.id.buttonUSDH);
        buttonUSDH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMenuUSDH();
            }
        });

    }

    public void openActivityMenuASMR() {
        Intent intent = new Intent(this, menuASMR.class);
        startActivity(intent);
    }
    public void openActivityMenuBreath() {
        Intent intent = new Intent(this, menuBreath.class);
        startActivity(intent);
    }public void openActivityMenuDrink() {
        Intent intent = new Intent(this, menuDrink.class);
        startActivity(intent);
    }public void openActivityMenuSounds() {
        Intent intent = new Intent(this, menuSounds.class);
        startActivity(intent);
    }public void openActivityMenuSupplements() {
        Intent intent = new Intent(this, menuSupplements.class);
        startActivity(intent);
    }public void openActivityMenuUSDH() {
        Intent intent = new Intent(this, menuUSDH.class);
        startActivity(intent);
    }

}
