package com.example.scanner;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class seond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seond);

        TextView scannedDataTextView = findViewById(R.id.scannedDataTextView);
        TextView formatTextView = findViewById(R.id.formatTextView);

        // Retrieve the scanned data and format from the intent
        Intent intent = getIntent();
        if (intent != null) {
            String scannedData = intent.getStringExtra("SCANNED_DATA");
            String scannedFormat = intent.getStringExtra("SCANNED_FORMAT");

            scannedDataTextView.setText("Data: " +scannedData);
            formatTextView.setText("Format: " + scannedFormat);
        }
    }
}
