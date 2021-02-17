package ru.geekbrains.java.level2.lessons;

public class Main1 {
    public static void main(String[] args) {
        int a = 0;
        int[] arr = new int[10];
        try {
            int b = arr[11];
            a = 10/0;    
        } catch (ArithmeticException e) {
            e.printStackTrace();
            a = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        System.out.println(arr[0]);
    }

}
