package com.example.multithreading;
import android.app.Activity;
import android.widget.Toast;

public class oddCount implements Runnable
{
    private final Activity a;

    public oddCount(MainActivity mainActivity) {

        this.a = mainActivity;
    }

    @Override
    public void run() {
        for(int odds = 0; odds < 100; odds++)
        {
            if (odds % 2 != 0)
            {
                System.out.println(odds);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        a.runOnUiThread(new Runnable()
        {
            @Override
            public void run()
            {
                Toast toast = Toast.makeText(a, "Counting odds complete", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
