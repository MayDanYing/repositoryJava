package ru.geekbrains;

import java.util.Random;

public class fifthTask {
    public static void main(String[] args) {
        int []arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(2);
        System.out.print("Массив A:");
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");

        System.out.println();

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
                arr[i] = 1;
            else if(arr[i] == 1)
                arr[i] = 0;
        }

        System.out.print("Массив B: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");





    }
}
