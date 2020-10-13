package ru.geekbrains;

import java.util.Random;

public class eighthTask {
    public static void main(String[] args) {
        final int n = 5;
        int f = 0;
        int[][] arr = new int[n][n];
        Random rnd = new Random();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(10);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nМассив 2");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
             if (j==0)
             {
                 arr[i][j + f] = 1;
                 f++;
             }
            System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
    }
}



