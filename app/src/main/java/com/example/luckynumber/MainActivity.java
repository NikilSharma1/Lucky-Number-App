package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.signButton);
        name=findViewById(R.id.nameText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= String.valueOf(name.getText());
                if(s.equals("")){
                    Toast.makeText(getApplicationContext(),"Please Enter Name",Toast.LENGTH_SHORT);
                }else{
                    Intent i=new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("name",s);
                    startActivity(i);
                }
            }
        });
    }
}