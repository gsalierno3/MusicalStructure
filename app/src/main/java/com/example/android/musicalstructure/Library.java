package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Library extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        setupListeners();
    }

    private void setupListeners()
    {
        //Find the button that shows the library tab
        Button buttonListen = (Button) findViewById(R.id.listen);

        //set a click listener on the button
        buttonListen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent (Library.this, MainActivity.class);

                //start a new activity
                startActivity(intent);
            }
        });

        //Find the button that shows the share tab
        Button buttonShare = (Button) findViewById(R.id.share);

        //set a click listener on the button
        buttonShare.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent (Library.this, Share.class);

                //start a new activity
                startActivity(intent);
            }
        });

        //Find the button that shows the share tab
        Button buttonStore = (Button) findViewById(R.id.store);

        //set a click listener on the button
        buttonStore.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent (Library.this, Store.class);

                //start a new activity
                startActivity(intent);
            }
        });
    }
}
