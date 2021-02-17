package ru.geekbrains.java.level2.lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            out.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            try {
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }



}
