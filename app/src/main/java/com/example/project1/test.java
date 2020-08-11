package com.example.project1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class test extends AppCompatActivity {

    ImageView imgView;
    Button b1,b2,b3,bnext,Btnscore;

    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final AlertDialog.Builder builder=new AlertDialog.Builder(this);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);

        Btnscore = (Button) findViewById(R.id.btnscore);

        bnext = (Button) findViewById(R.id.btnnext);
        imgView = (ImageView) findViewById(R.id.img1);

        imgView.setImageResource(R.drawable.aa22);
        b1.setText("Wa1");
        b2.setText("Kha1");
        b3.setText("La1");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();

                bnext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(getApplicationContext(),test1.class);
                        startActivity(intent);
                        finish();

                    }
                });


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
            }
        });

        Btnscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Wow!!! your score is" + "....."+ 1 );
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(getApplicationContext(),Mainmenu.class);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(getApplicationContext(),Mainmenu.class);
                        startActivity(intent);
                    }
                });

                AlertDialog alert=builder.create();
                alert.setTitle("Your Score");
                alert.show();
               // setContentView(R.layout.activity_main);
            }
        });







    }

}
