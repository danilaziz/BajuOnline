package com.example.bajuonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PencarianActivity(View view) {
        Intent intent = new Intent(MainActivity.this,PencarianActivity.class);
        startActivity(intent);
    }

    public void KategoriActivity(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,KategoriActivity.class);
        startActivity(intent);
    }

    public void BajuActivity(View view) {
        Intent intent = new Intent(MainActivity.this,BajuActivity.class);
        startActivity(intent);
    }

    public void CelanaActivity(View view) {
        Intent intent = new Intent(MainActivity.this,CelanaActivity.class);
        startActivity(intent);
    }

    public void JaketActivity(View view) {
        Intent intent = new Intent(MainActivity.this,JaketActivity.class);
        startActivity(intent);
    }

    public void LihatSemuaTerlarisActivity(View view) {
        Intent intent = new Intent(MainActivity.this,LihatSemuaTerlarisActivity.class);
        startActivity(intent);
    }

    public void LihatSemuaProdukActivity(View view) {
        Intent intent = new Intent(MainActivity.this,LihatSemuaProdukActivity.class);
        startActivity(intent);
    }

    public void KeranjangActivity(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,KeranjangActivity.class);
        startActivity(intent);
    }

    public void KeranjangActivity(View view) {
        Intent intent = new Intent(MainActivity.this,KeranjangActivity.class);
        startActivity(intent);
    }

    public void FavoritActivity(MenuItem item) {
        Intent intent = new Intent(MainActivity.this,FavoritActivity.class);
        startActivity(intent);
    }

    public void PesanActivity(View view) {
        Intent intent = new Intent(MainActivity.this,PesanActivity.class);
        startActivity(intent);
    }
}