package ru.geekbrains.java.level2.lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        out = new FileOutputStream("1.txt");
        out.write(65);
        out.close();


    }



}
