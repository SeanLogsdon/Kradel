package com.example.kradel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class menuBreath extends AppCompatActivity {
        private Button ytBreath;


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_breath);

            ytBreath = (Button) findViewById(R.id.ytBreath);
            ytBreath.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openActivityBreath();
                }
            });
        }

        public void openActivityBreath() {
            ((MyApplication) this.getApplication()).setUrl("https://www.youtube.com/watch?v=RHpTR2wRc8c");
            Intent intent = new Intent(this, ASMR.class);
            startActivity(intent);
        }
}
