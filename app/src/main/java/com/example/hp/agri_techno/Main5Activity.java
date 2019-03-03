package com.example.hp.agri_techno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);ed1=(EditText)findViewById(R.id.pno);
        ed2=(EditText)findViewById(R.id.n);
        ed3=(EditText)findViewById(R.id.ad);
        ed4=(EditText)findViewById(R.id.editText3);
        ed5=(EditText)findViewById(R.id.editText4);
        TextView textView=(TextView)findViewById(R.id.textView21);
        textView.setText("Phno    \tLocation    \t  Name    \t  Type    \t  Qty(in kg)");
    }
    public void Entry(View view)
    {
        EditText e=(EditText)findViewById(R.id.pno);
        int pn=Integer.parseInt(ed1.getText().toString());
        String nme=ed2.getText().toString();
        String ads=ed3.getText().toString();
        String ty=ed4.getText().toString();
        String qu=ed5.getText().toString();
        BuySell st=new BuySell();
        //student object is created
        st.setPhno(pn);
        st.setAddress(ads);
        st.setName(nme);
        st.setType(ty);
        st.setQty(qu);
        Toast.makeText(this,"Data is inserted",Toast.LENGTH_LONG).show();

        DBhelper sdb=new DBhelper(this,null,null,1);   //class that extends SQlite open handler
        int f=sdb.Insert_v(st);

        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");

        if(f>=1)
        {
            Toast.makeText(this,"Success",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Failed "+f,Toast.LENGTH_LONG).show();
        }
    }
    public void dis(View c)
    {
        DBhelper sdb=new DBhelper(this,null,null,1);
        String ans=sdb.Display();
        Toast.makeText(this,ans,Toast.LENGTH_LONG).show();
        TextView d=(TextView)findViewById(R.id.textView4);
        d.setText(sdb.Display());
        //d.setText("");
        //Intent e=new Intent(this,Main2Activity.class);
        //e.putExtra("result",ans);
        //e.putExtra("result",sdb.Display());
        //startActivity(e);
    }

}

