package com.example.multithreading;

import android.app.Activity;
import android.widget.Toast;

public class evenCount implements Runnable
{
    private final Activity ma;

    public evenCount(MainActivity ma) {
        this.ma = ma;
    }

    @Override
    public void run() {
        int evens;
        for(evens = 0; evens < 100; evens++)
        {
            if (evens % 2 == 0)
            {
                System.out.println(evens);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ma.runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                Toast toast = Toast.makeText(ma, "Counting evens complete", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
