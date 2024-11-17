package com.example.pariwisatainfoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Membuat status bar transparan
        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        setContentView(R.layout.activity_main);

        // Menghubungkan Button dengan id get_started_button
        Button getStartedButton = findViewById(R.id.get_started_button);

        // Menetapkan aksi ketika tombol ditekan
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat Intent untuk berpindah ke halaman utama (HalamanUtama)
                Intent intent = new Intent(MainActivity.this, HalamanUtama.class);
                startActivity(intent); // Memulai activity baru
            }
        });
    }
}
