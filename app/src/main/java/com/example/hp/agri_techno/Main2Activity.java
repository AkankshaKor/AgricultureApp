package com.example.hp.agri_techno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();

        Button bt2=(Button)findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in1=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(in1);
            }
        });

        Button bt11=(Button)findViewById(R.id.button11);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in2=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(in2);
            }
        });

        Button bt10=(Button)findViewById(R.id.button10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(Main2Activity.this,Main6Activity.class);
                startActivity(in3);
            }
        });

        Button bt9=(Button) findViewById(R.id.button9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(in3);
            }
        });

        Button bt12=(Button) findViewById(R.id.button12);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4=new Intent(Main2Activity.this,Main7Activity.class);
                startActivity(in4);
            }
        });
    }
}
