package com.kodilla.extratask;

public class ExtraTask {
    int textLengthDoubled(String text) {
       return text.length() * 2;
    }

    String evenNumbersUpTo100() {
        String text = "";
        for(int n = 0; n <= 100; n+=2) {
            text += n + ",";
        }
        return text;
    }

    public void systemNanoTime() {
        System.out.println("Acctual time is: " + System.nanoTime() + " nanoseconds");
    }

}
