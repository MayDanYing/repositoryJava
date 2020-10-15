package ru.geekbrains;

import java.util.Scanner;

public class tenthTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year;
        year = in.nextInt();
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " - високосный год");

            }
            else
                System.out.println(year + " - не високосный год");
        }
        else
                System.out.println(year + " - не високосный год");

    }
}
