package ru.geekbrains;

import java.util.Random;

public class ninthTask{
    public static void main(String[] args)
    {
        int []arr = new int[10];
        int MIN = 1;
        int MAX = arr[0];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt( 10);

        for (int j : arr)
            System.out.print(j + "\t");

        System.out.println();

        for (int j : arr) {
            if (MAX <= j)
                MAX = j;
            if (MIN >= j)
                MIN = j;
        }
        System.out.println("MAX = " + MAX);
        System.out.println("MIN = " + MIN);
    }
}
