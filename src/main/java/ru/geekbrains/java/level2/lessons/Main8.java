package ru.geekbrains.java.level2.lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main8 {
    public static void main(String[] args) {

        try {
            doSomethingValuable();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void doSomethingValuable() throws IOException {
        FileOutputStream out = new FileOutputStream("2.txt");
        out.write(1);
        out.close();
    }

}
