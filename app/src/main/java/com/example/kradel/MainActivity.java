package com.example.kradel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonASMR;


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
    }

    public void openActivityMenuASMR() {
        Intent intent = new Intent(this, menuASMR.class);
        startActivity(intent);
    }

}
