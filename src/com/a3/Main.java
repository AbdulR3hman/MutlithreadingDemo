package com.a3;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10 ; i++)
            arr[i] = i;

        Reader r1 = new Reader("R1", arr);
        Reader r2 = new Reader("R2", arr);
        Reader r3 = new Reader("R3", arr);
        Reader r4 = new Reader("R4", arr);


        r1.start();
        r2.start();
        r3.start();
        r4.start();

        return;

    }
}
