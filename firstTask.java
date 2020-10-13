package ru.geekbrains;
import java.util.Scanner;

public class firstTask {
    public static void main(String[] args) {
        int a, b, result;
        boolean isTrue = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number");
        a = in.nextInt();

        System.out.println("Input second number");
        b = in.nextInt();
        result = a+b;

        if (result >=10 & result <=20)
        {
            isTrue = true;
        }
        else
            isTrue = false;

        System.out.println(isTrue);

    }
}
