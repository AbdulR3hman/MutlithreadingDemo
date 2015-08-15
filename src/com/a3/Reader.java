package com.a3;

/**
 * Created by AbdulRehman on 15/08/2015.
 */
public class Reader extends Thread {

    private Thread t;
    private int[] _set;
    private String _tname;

    Reader(String name, int[] set)
    {
        this._tname = name;
        this._set = set;
    }

    public void run()
    {
        System.out.println("Thread; " + _tname + "Got a message ----- ");
        try{
        for (int i = 0; i < _set.length; i++)
        {
            Thread.sleep(1);
            System.out.println("Number: " + _set[i] + " FROM; " + _tname);
            _set[i] = i-i;
        }
        } catch (InterruptedException e)
        {
            System.out.println("Thread: " + _tname + "was interrupted");
        }
        for (int i = 0; i < _set.length; i++)
        {
            System.out.print("F: " + _set[i] + " FROM " + _tname); //final results

        }
        System.out.println();
    }

    public void start()
    {
        System.out.println("Starting Thread; " + _tname);

        if (t == null)
        {
            t = new Thread(this, _tname);
            t.start();
        }
    }
}
