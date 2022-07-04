package com.example.bajuonline;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerlarisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terlaris);
    }

    public void LihatSemuaTerlarisActivity(View view) {
        Intent intent = new Intent(TerlarisActivity.this,LihatSemuaTerlarisActivity.class);
        startActivity(intent);
    }
}