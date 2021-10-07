package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import java.lang.reflect.Array;

public class halaman2 extends AppCompatActivity {
ImageView kembali, mj, bruno;
    private static final String[]TITLE = new String[]{
            "When I Was Your Man", "Heal The World", "Aku Yang Tersakiti", "Fana Merah Jambu", "Gorilla", "Monokrom", "Kangen"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        AutoCompleteTextView editText = findViewById(R.id.pilihan);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TITLE);
        editText.setAdapter(adapter);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(halaman2.this, MainActivity.class));
            }
        });

        mj = findViewById(R.id.mj);
        mj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(halaman2.this, halaman3.class));
            }
        });

        bruno = findViewById(R.id.bruno);
        bruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(halaman2.this, halaman4.class));
            }
        });


    }
}