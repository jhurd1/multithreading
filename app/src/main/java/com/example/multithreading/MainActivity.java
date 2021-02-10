package com.example.multithreading;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Thread;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args)
    {
       Runnable r = new Runnable() {
           int odds = 0;
           @Override
           public void run() throws InterruptedException {
               for(odds = 0; odds < 100; odds++)
               {
                   while (odds % 2 != 0)
                   {
                       System.out.println(odds);
                       Thread.sleep(250);
                   }
               }
           }
       };
    }
}