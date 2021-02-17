package ru.geekbrains.java.level2.lessons;

import java.io.IOException;

public class Main7 {
    public static void main(String[] args) {
        try {
            doSomethingValuable();
        }catch (ArithmeticException e) {

        }

    }

    public static void doSomethingValuable() {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
