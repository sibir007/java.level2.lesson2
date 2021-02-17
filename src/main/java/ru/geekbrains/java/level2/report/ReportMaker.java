package ru.geekbrains.java.level2.report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReportMaker {
    public void createReport(String fileName, String data) throws IOException {
        FileOutputStream out = null;
        if (fileName.length() < 10) {
            throw new IOException("file not found");
        }
        out = new FileOutputStream(fileName);
        out.write(data.getBytes(StandardCharsets.UTF_8));
        out.close();


    }
}
