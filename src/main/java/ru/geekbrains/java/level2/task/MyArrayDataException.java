package ru.geekbrains.java.level2.task;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int index1, int index2, String value) {
        super("элемент ["+index1+"]"+"["+index1+"] = " + "\"" + value + "\"" + " не возможно преобразовать в число");
    }
}
