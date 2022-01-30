package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                a = a + i;
            }
        }
        System.out.println("Summasy:" + a);
    }
}
