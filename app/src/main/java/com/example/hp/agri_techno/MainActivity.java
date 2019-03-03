package com.example.hp.agri_techno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ed1=(EditText) findViewById(R.id.editText);
                EditText ed2=(EditText) findViewById(R.id.editText2);

                String a=ed1.getText().toString();
                String b=ed2.getText().toString();

                if( b.length()==10)
                {
                    Intent in=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(in);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Enter valid phone no", Toast.LENGTH_SHORT).show();
                }

                Spinner sp=(Spinner) findViewById(R.id.spinner);
                String c=String.valueOf(sp.getSelectedItem());


            }
        });
    }

}
