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

public class poem extends AppCompatActivity {
    ImageView Img1,Img2,Img3,Img4,Img5,Img6,Img7,Img8,Img9,Img10;
    Button Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        final MediaPlayer sound1=MediaPlayer.create(this,R.raw.ww1);
        final MediaPlayer sound2=MediaPlayer.create(this,R.raw.ww2);
        final MediaPlayer sound3=MediaPlayer.create(this,R.raw.ww3);
        final MediaPlayer sound4=MediaPlayer.create(this,R.raw.ww4);
        final MediaPlayer sound5=MediaPlayer.create(this,R.raw.ww5);

        Btn2=(Button)findViewById(R.id.btn2) ;

        Img1=(ImageView)findViewById(R.id.img1);
        Img2=(ImageView)findViewById(R.id.img2);
        Img3=(ImageView)findViewById(R.id.img3);
        Img4=(ImageView)findViewById(R.id.img4);
        Img5=(ImageView)findViewById(R.id.img5);


        Img6=(ImageView)findViewById(R.id.img6);
        Img7=(ImageView)findViewById(R.id.img7);
        Img8=(ImageView)findViewById(R.id.img8);
        Img9=(ImageView)findViewById(R.id.img9);
        Img10=(ImageView)findViewById(R.id.img10);

        Img1.setImageResource(R.drawable.w1);
        Img2.setImageResource(R.drawable.w2);
        Img3.setImageResource(R.drawable.w3);
        Img4.setImageResource(R.drawable.w4);
        Img5.setImageResource(R.drawable.w5);

        Img6.setImageResource(R.drawable.a1);
        Img7.setImageResource(R.drawable.a2);
        Img8.setImageResource(R.drawable.a3);
        Img9.setImageResource(R.drawable.a4);
        Img10.setImageResource(R.drawable.a5);

        Img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound1.start();
            }
        });
        Img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound2.start();
            }
        });
        Img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound3.start();
            }
        });
        Img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound4.start();
            }
        });
        Img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound5.start();
            }
        });




        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),poem1.class);
                startActivity(intent);
                finish();

            }
        });
    }

}
