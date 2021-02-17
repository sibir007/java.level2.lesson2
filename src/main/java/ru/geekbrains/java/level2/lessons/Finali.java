package ru.geekbrains.java.level2.lessons;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finali {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("1.txt");
            out.write(65);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /**
         * аналогичное действие
         */
        try (FileOutputStream out2 = new FileOutputStream("2.txt")){
            out2.write(65);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
