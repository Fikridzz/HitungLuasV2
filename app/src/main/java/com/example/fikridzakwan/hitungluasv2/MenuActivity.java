package com.example.fikridzakwan.hitungluasv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }
    // TODO 1 Luas persegi membuat method luasPersegi
    public void luasPersegi(View view) {
        // TODO 2 Luas persegi membuat object Intent
        Intent pindah = new Intent(MenuActivity.this, LuasPersegiActivity.class);

        // TODO 3 Menjalankan starActivity
        startActivity(pindah);
    }
}
