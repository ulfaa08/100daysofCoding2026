package com.mycompany.operatorperbandingan;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 5;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a == b : " + (a == b)); // true karena 10 sama dengan 10
        System.out.println("a == c : " + (a == c)); // false karena 10 tidak sama dengan 5
        System.out.println("a != c : " + (a != c)); // true karena 10 tidak sama dengan 5
        System.out.println("a != b : " + (a != b)); // false karena 10 sama dengan 10
    }
}
