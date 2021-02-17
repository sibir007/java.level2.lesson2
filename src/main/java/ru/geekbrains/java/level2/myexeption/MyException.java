package ru.geekbrains.java.level2.myexeption;

public class MyException extends RuntimeException{
    private int index;
    private int value;

    public MyException(int index, int value) {
        super("Был найден отрицательный элемент " + value + " на позиции: " + index);
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }
}
