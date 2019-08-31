package com.example.abo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Cam extends AppCompatActivity {
ImageView imageView;
TextView txtA,txtB, txtO, txtAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam);

        imageView = findViewById(R.id.profile);
        txtA = findViewById(R.id.A);
        txtB = findViewById(R.id.B);
        txtAB = findViewById(R.id.AB);
        txtO = findViewById(R.id.O);

        Bundle extras = getIntent().getExtras();
        byte[] byteArray = getIntent().getByteArrayExtra("image");
        Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray,0,byteArray.length);

        imageView.setImageBitmap(bitmap); // 이미지 설정끝끝

    }
}
