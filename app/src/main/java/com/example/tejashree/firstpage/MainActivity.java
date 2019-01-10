package com.example.tejashree.firstpage;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView logo;
    ImageView img1,img2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (TextView) findViewById(R.id.logo);
        Typeface t = Typeface.createFromAsset(getAssets(), "fa-solid-900.ttf");
        logo.setTypeface(t);
    }
        public void emgNum(View view)
        {
            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_LONG).show();
            intent =new Intent(getApplicationContext(),list_of_emergency.class);
            startActivity(intent);
        }

    }

