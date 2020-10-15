package ru.geekbrains;

public class sixthTask {

    public static void main(String args[]) {

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++)
        {
            if(i == 0)
                arr[i] = 2;
            else
                arr[i] = arr[i-1] +3;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
           }

}
