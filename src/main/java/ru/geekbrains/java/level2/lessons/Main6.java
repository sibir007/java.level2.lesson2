package ru.geekbrains.java.level2.lessons;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(sqrt(-5));


    }

    public static int sqrt(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Не возможно вычислить корень из отрицательного числа");

        }
        return n / 2;
    }

}
