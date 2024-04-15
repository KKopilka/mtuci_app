package com.example.mtuci_app.Onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mtuci_app.Sign_Login.Login;
import com.example.mtuci_app.R;

public class LanguageSelect extends AppCompatActivity {

    private void clearOrangeColor(Button button) {
        button.setSelected(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_select);

        Button russianButton = findViewById(R.id.russian_button);
        russianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));


                russianButton.setSelected(true);
            }
        });

        Button englishButton = findViewById(R.id.english_button);
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                englishButton.setSelected(true);
            }
        });

        Button chineseButton = findViewById(R.id.chinese_button);
        chineseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                chineseButton.setSelected(true);
            }
        });

        Button belarushButton = findViewById(R.id.belarus_button);
        belarushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.english_button));
                clearOrangeColor(findViewById(R.id.kazakh_button));

                belarushButton.setSelected(true);
            }
        });

        Button kazakhButton = findViewById(R.id.kazakh_button);
        kazakhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearOrangeColor(findViewById(R.id.russian_button));
                clearOrangeColor(findViewById(R.id.chinese_button));
                clearOrangeColor(findViewById(R.id.belarus_button));
                clearOrangeColor(findViewById(R.id.english_button));

                kazakhButton.setSelected(true);
            }
        });

        Button chooseButton = findViewById(R.id.choose_button);
        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LanguageSelect.this, Login.class));
            }
        });
    }
}