package com.app.iptv;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    EditText username,password;
    Button signin;
    Activity sactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        username =(EditText) findViewById(R.id.username);
        password =(EditText) findViewById(R.id.password);
        signin =(Button) findViewById(R.id.signin);

        sactivity=this;



        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(sactivity, Allchannel.class);
                startActivity(i);


            }
        });







    }
}
