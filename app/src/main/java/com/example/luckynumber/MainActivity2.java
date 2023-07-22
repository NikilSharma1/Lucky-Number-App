package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.shareButton);
        number=findViewById(R.id.numberTextView);
        int randomNumber=(int)(Math.random()*((1001)));
        number.setText(String.valueOf(randomNumber));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getIntent();
                String name=i.getStringExtra("name");
                Intent share=new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_SUBJECT,name);
                share.putExtra(Intent.EXTRA_TEXT,String.valueOf("Lucky Number is : "+randomNumber));

                startActivity(Intent.createChooser(share,"Choose A Platform"));
            }
        });
    }
}