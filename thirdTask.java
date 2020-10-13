package ru.geekbrains;
import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        a = in.nextInt();

        if (a <=0)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);

    }
}
