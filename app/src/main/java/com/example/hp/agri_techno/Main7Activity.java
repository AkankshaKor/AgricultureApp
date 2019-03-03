package com.example.hp.agri_techno;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent in4 = getIntent();
    }

    public void news(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://economictimes.indiatimes.com/news/economy/agriculture"));
        startActivity(browserIntent);

    }

    public void market_price(View view) {
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.agriwatch.com/"));
        startActivity(browserIntent1);
    }
}
