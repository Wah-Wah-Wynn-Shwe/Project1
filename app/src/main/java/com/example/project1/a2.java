package com.example.project1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class a2 extends AppCompatActivity {
    ImageView Img1,Img2;
    Button Btn1,Btn2,Btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        final MediaPlayer sound1=MediaPlayer.create(this,R.raw.aa2);

        Btn1=(Button)findViewById(R.id.btn1);
        Btn2=(Button)findViewById(R.id.btn2);
        Btn3=(Button)findViewById(R.id.btn3);

        Img1=(ImageView)findViewById(R.id.img1);
        Img2=(ImageView)findViewById(R.id.img2);

        Img1.setImageResource(R.drawable.aa2);
        Img2.setImageResource(R.drawable.p2);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound1.start();
            }
        });

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a1.class);
                startActivity(intent);
                finish();
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a3.class);
                startActivity(intent);
                finish();
            }
        });


    }

}
