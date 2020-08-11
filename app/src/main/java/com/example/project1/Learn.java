package com.example.project1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

public class Learn extends AppCompatActivity {
    ImageView  Img1,Img2,Img3,Img4,Img5,Img6,Img7,Img8,Img9,Img10,Img11,Img12,Img13,Img14,Img15,Img16,
            Img17,Img18,Img19,Img20,Img21,Img22,Img23,Img24,Img25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

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
        Img11=(ImageView)findViewById(R.id.img11);
        Img12=(ImageView)findViewById(R.id.img12);
        Img13=(ImageView)findViewById(R.id.img13);
        Img14=(ImageView)findViewById(R.id.img14);
        Img15=(ImageView)findViewById(R.id.img15);
        Img16=(ImageView)findViewById(R.id.img16);
        Img17=(ImageView)findViewById(R.id.img17);
        Img18=(ImageView)findViewById(R.id.img18);
        Img19=(ImageView)findViewById(R.id.img19);
        Img20=(ImageView)findViewById(R.id.img20);
        Img21=(ImageView)findViewById(R.id.img21);
        Img22=(ImageView)findViewById(R.id.img22);
        Img23=(ImageView)findViewById(R.id.img23);
        Img24=(ImageView)findViewById(R.id.img24);
        Img25=(ImageView)findViewById(R.id.img25);



        Img1.setImageResource(R.drawable.aa1);
        Img2.setImageResource(R.drawable.aa2);
        Img3.setImageResource(R.drawable.aa3);
        Img4.setImageResource(R.drawable.aa4);
        Img5.setImageResource(R.drawable.aa5);
        Img6.setImageResource(R.drawable.aa6);
        Img7.setImageResource(R.drawable.aa7);
        Img8.setImageResource(R.drawable.aa8);
        Img9.setImageResource(R.drawable.aa9);
        Img10.setImageResource(R.drawable.aa10);
        Img11.setImageResource(R.drawable.aa11);
        Img12.setImageResource(R.drawable.aa12);

        Img13.setImageResource(R.drawable.aa13);
        Img14.setImageResource(R.drawable.aa14);
        Img15.setImageResource(R.drawable.aa15);
        Img16.setImageResource(R.drawable.aa16);
        Img17.setImageResource(R.drawable.aa17);
        Img18.setImageResource(R.drawable.aa18);
        Img19.setImageResource(R.drawable.aa19);
        Img20.setImageResource(R.drawable.aa20);
        Img21.setImageResource(R.drawable.aa21);
        Img22.setImageResource(R.drawable.aa22);
        Img23.setImageResource(R.drawable.aa23);
        Img24.setImageResource(R.drawable.aa24);
        Img25.setImageResource(R.drawable.aa25);


        Img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a1.class);
                startActivity(intent);
            }
        });
        Img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a2.class);
                startActivity(intent);
            }
        });
        Img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a3.class);
                startActivity(intent);
            }
        });
        Img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a4.class);
                startActivity(intent);
            }
        });
        Img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a5.class);
                startActivity(intent);
            }
        });
        Img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a6.class);
                startActivity(intent);
            }
        });
        Img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a7.class);
                startActivity(intent);
            }
        });
        Img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a8.class);
                startActivity(intent);
            }
        });
        Img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a9.class);
                startActivity(intent);
            }
        });
        Img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a10.class);
                startActivity(intent);
            }
        });
        Img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a11.class);
                startActivity(intent);
            }
        });
        Img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a12.class);
                startActivity(intent);
            }
        });

        Img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a13.class);
                startActivity(intent);
            }
        });
        Img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a14.class);
                startActivity(intent);
            }
        });
        Img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a15.class);
                startActivity(intent);
            }
        });
        Img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a16.class);
                startActivity(intent);
            }
        });
        Img17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a17.class);
                startActivity(intent);
            }
        });
        Img18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a18.class);
                startActivity(intent);
            }
        });
        Img19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a19.class);
                startActivity(intent);
            }
        });
        Img20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a20.class);
                startActivity(intent);
            }
        });
        Img21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a21.class);
                startActivity(intent);
            }
        });
        Img22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a22.class);
                startActivity(intent);
            }
        });
        Img23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a23.class);
                startActivity(intent);
            }
        });
        Img24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a24.class);
                startActivity(intent);
            }
        });
        Img25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),a25.class);
                startActivity(intent);
            }
        });


    }

}
