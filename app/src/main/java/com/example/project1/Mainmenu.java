package com.example.project1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Mainmenu extends AppCompatActivity {

    Button Btn1,Btn2,Btn3;
    ImageView Img1,Img2,Img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        Btn1=(Button)findViewById(R.id.btn1);
        Btn2=(Button)findViewById(R.id.btn2);
        Btn3=(Button)findViewById(R.id.btn3);

        Img1=(ImageView)findViewById(R.id.img1);
        Img2=(ImageView)findViewById(R.id.img2);
        Img3=(ImageView)findViewById(R.id.img3);


        Img1.setImageResource(R.drawable.lesson);
        Img2.setImageResource(R.drawable.poem);
        Img3.setImageResource(R.drawable.test);


        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Learn.class);
                startActivity(intent);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),poem.class);
                startActivity(intent);
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),test.class);
                startActivity(intent);

            }
        });
    }

}
