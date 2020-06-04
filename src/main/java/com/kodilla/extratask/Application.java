package com.kodilla.extratask;

public class Application {
    public static void main(String[] args) {
        ExtraTask task = new ExtraTask();
        System.out.println(task.textLengthDoubled("kotek"));
        System.out.println(task.evenNumbersUpTo100());
        task.systemNanoTime();
    }

}
