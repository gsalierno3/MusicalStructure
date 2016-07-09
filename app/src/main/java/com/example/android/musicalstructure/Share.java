package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Share extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        setupListeners();
    }

    private void setupListeners()
    {
        //Find the button that shows the library tab
        Button buttonLibrary = (Button) findViewById(R.id.library);

        //set a click listener on the button
        buttonLibrary.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent (Share.this, Library.class);

                //start a new activity
                startActivity(intent);
            }
        });

        //Find the button that shows the share tab
        Button buttonListen = (Button) findViewById(R.id.listen);

        //set a click listener on the button
        buttonListen.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent (Share.this, MainActivity.class);

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
                Intent intent = new Intent (Share.this, Store.class);

                //start a new activity
                startActivity(intent);
            }
        });
    }
}
