package ru.geekbrains.java.level2.myexeption;

public class App {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                try {
                    throw new MyException(i, arr[i]);
                }catch (MyException e) {
                    e.printStackTrace();
                    arr[e.getIndex()] = 0 - e.getValue();
                }

            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
