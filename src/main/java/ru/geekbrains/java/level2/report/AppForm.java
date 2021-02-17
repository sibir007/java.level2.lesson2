package ru.geekbrains.java.level2.report;

import javax.swing.*;
import java.io.IOException;

public class AppForm extends JFrame {
    public AppForm () {
        setBounds(200,200,100,100);
        JButton jButton = new JButton("1");
        jButton.addActionListener((e) -> {
            ReportMaker reportMaker = new ReportMaker();
            try {
                reportMaker.createReport("1.txt", "sldfjkldksjdkslfjldsfjldfskjl");
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(null, "ERROR!!!!!!!!!");
            }

        });
        add(jButton);
        setTitle("Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String[] args) {
        new AppForm();
    }
}
