package ru.geekbrains;

public class seventhTask {

    public static void main(String[] args) {
        int[] arr = new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.print("массив A: \n");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] <6)
                arr[i] *= 2;
        }

        System.out.print("массив B: \n");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+"\t");
    }
}
