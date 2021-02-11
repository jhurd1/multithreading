package com.example.multithreading;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Thread;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void oddsButton(View oddsButton)
    {
        oddCount oc = new oddCount(this);
        Thread t = new Thread(oc, "oddThread");
        t.start();
    }

    public void evensButton(View evensButton)
    {
        evenCount ec = new evenCount(this);
        Thread t = new Thread(ec, "evenThread");
        t.start();
    }
}