package com.app.iptv;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by soumen on 8/12/16.
 */

public class Allchannel extends AppCompatActivity
{

    ImageView left,right,media;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_channels);

        left=(ImageView)findViewById(R.id.left);
        right=(ImageView)findViewById(R.id.right);
        media=(ImageView)findViewById(R.id.media);



        final AlertDialog.Builder ImageDialog = new AlertDialog.Builder(Allchannel.this);
        ImageDialog.setTitle("MENU");
        EditText showImage = new EditText(Allchannel.this);
        ImageDialog.setView(showImage);
        ImageDialog.setNegativeButton("ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                arg0.dismiss();
               // ImageDialog.setView(null);

            }
        }).create();

        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageDialog.show();
            }
        });







}}
