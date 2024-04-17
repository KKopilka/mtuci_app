package com.example.mtuci_app.Practice;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mtuci_app.R;

public class WordPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_practice);
    }

    public void onBackButtonClicked(View view) {
        onBackPressed();
    }
}