package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                Intent intent = new Intent (MainActivity.this, Library.class);

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
                Intent intent = new Intent (MainActivity.this, Share.class);

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
                Intent intent = new Intent (MainActivity.this, Store.class);

                //start a new activity
                startActivity(intent);
            }
        });

        //Use the layout as a temporary touch area
        LinearLayout scrollableLayout = (LinearLayout) findViewById(R.id.listen_scroll);

        // set click listener on the Layout
        scrollableLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent(MainActivity.this, SugestedSongActivity.class);

                //start activity
                startActivity(intent);

            }
        });

        //Use the layout as a temporary touch area
        TextView fromLibrary = (TextView) findViewById(R.id.toPhoneLibrary);

        // set click listener on the Layout
        fromLibrary.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent
                Intent intent = new Intent(MainActivity.this, SugestedSongActivity.class);

                //start activity
                startActivity(intent);
            }
        });

        //Use the layout as a temporary touch area
        TextView fromPlaylist = (TextView) findViewById(R.id.fromPlaylist);

        // set click listener on the Layout
        fromPlaylist.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //create a new intent - this is an implicit intent
                Intent intent = new Intent(MainActivity.this, PlayFromPlaylistActivity.class);

                //start activity
                startActivity(intent);
            }

        });


    }
}
