package com.mycompany.main.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        
        System.out.println(angka1 > angka2);
    }
}
