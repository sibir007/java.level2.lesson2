package ru.geekbrains.java.level2.task;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException () {
        super("Массив должен быть 4х4");
    }
}
