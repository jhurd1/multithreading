package com.example.multithreading;

public class evenCount implements Runnable
{

    @Override
    public void run() throws InterruptedException {
        int evens;
        for(evens = 0; evens < 100; evens++)
        {
            while (evens % 2 == 0)
            {
                System.out.println(evens);
                Thread.sleep(250);
            }
        }
    }
}
