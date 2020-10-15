package ru.geekbrains;
import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        a = in.nextInt();

              if (a >=0)
        {
            System.out.println("Вы ввели положительное число");
        }
        else
           System.out.println("Вы ввели отрицательное число");

            }
}
