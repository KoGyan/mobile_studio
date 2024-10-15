package com.example.mobileproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button buttonShowImage;
    private Button buttonHideImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        buttonShowImage = findViewById(R.id.buttonShowImage);
        buttonHideImage = findViewById(R.id.buttonHideImage);

        // 버튼 클릭 리스너 설정
        buttonShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이미지 보이기
                imageView.setVisibility(View.VISIBLE);
            }
        });
        buttonHideImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이미지 보이기
                imageView.setVisibility(View.INVISIBLE);
            }
        });

    }
}