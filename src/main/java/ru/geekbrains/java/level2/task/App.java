package ru.geekbrains.java.level2.task;

public class App {
    public static void main(String[] args) {
//        String[][] arr1 = {
//                {"1", "2", "3", "4"},
//                {"5", "6", "7", "8"},
//                {"9", "10", "11", "12"},
//                {"13", "14", "15", "16"}
//        };
//        String[][] arr1 = {
//                {"1", "2", "3", "4"},
//                {"5", "6", "7", "8"},
//                {"9", "10", "11", "12"},
//        };
//        String[][] arr1 = {
//                {"1", "2", "3", "4"},
//                {"5", "6", "7", "8"},
//                {"9", "10", "11", "12"},
//                {"13", "14", "15"}
//        };
        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "A", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int sumArray = 0;
        try {
            sumArray = myArrayMethod(arr1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        System.out.println(sumArray);

    }
    private static int myArrayMethod(String[][] arr) {
        myArraySizeMethod(arr);
        return  myArrayDataMethod(arr);

    }
    private static void myArraySizeMethod(String[][] arr) {
        if (arr.length !=4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4 ) {
                throw new MyArraySizeException();
            }

        }
    }
    private static int myArrayDataMethod(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j,arr[i][j]);
                }
            }
        }
        return sum;
    }
}
