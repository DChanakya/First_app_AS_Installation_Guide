package com.example.chanakya.androidstudioinstallation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void vid(View v)
    {
        Button but = (Button) findViewById(R.id.button3);
        Intent i = new Intent(this,FullscreenW.class);
        startActivity(i);
    }


    public void down(View v) {
        Uri uri = Uri.parse("https://developer.android.com/studio/index.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
