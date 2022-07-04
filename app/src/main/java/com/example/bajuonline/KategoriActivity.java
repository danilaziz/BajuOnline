package com.example.bajuonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class KategoriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
    }

    public void BajuActivity(View view) {
        Intent intent = new Intent(KategoriActivity.this,BajuActivity.class);
        startActivity(intent);
    }

    public void CelanaActivity(View view) {
        Intent intent = new Intent(KategoriActivity.this,CelanaActivity.class);
        startActivity(intent);
    }

    public void JaketActivity(View view) {
        Intent intent = new Intent(KategoriActivity.this,JaketActivity.class);
        startActivity(intent);
    }
}