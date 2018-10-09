package com.example.fikridzakwan.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1 Menginisiasi widget ke dalam variable
        Button btnMasuk = findViewById(R.id.btnMasuk);

        // TODO 2 Membuat method onClick
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 3 Membuat intent untuk pindah halaman
                Intent pindah = new Intent(MainActivity.this, MenuActivity.class);

                // TODO 4 Lalu kita pangil function staractivity untuk berpindah halaman
                startActivity(pindah);

            }
        });

    }
}
