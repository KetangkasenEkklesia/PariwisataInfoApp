package com.example.pariwisatainfoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        ImageView imageView = findViewById(R.id.imageview);
        TextView location = findViewById(R.id.location);
        TextView subjudul = findViewById(R.id.subjudul);
        TextView descDetail = findViewById(R.id.descdetail);
        ImageView backButton = findViewById(R.id.backbutton);

        // Ambil data dari intent
        int image = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String subtitle = getIntent().getStringExtra("subtitle");
        String desc = getIntent().getStringExtra("desc");

        // Set data ke views
        imageView.setImageResource(image);
        location.setText(title);
        subjudul.setText(subtitle);
        descDetail.setText(desc);

       Toast toast = Toast.makeText(this, "Selamat datang di " + title, Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
       toast.setDuration(Toast.LENGTH_SHORT);
       toast.show();

       backButton.setOnClickListener(v -> {
            // Kembali ke HalamanUtama
            Intent intent = new Intent(Detail.this, HalamanUtama.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish(); // Tutup aktivitas Detail
        });
    }
}
