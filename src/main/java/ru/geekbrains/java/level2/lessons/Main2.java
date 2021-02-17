package ru.geekbrains.java.level2.lessons;

public class Main2 {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] arr = new int[5];
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }

}
