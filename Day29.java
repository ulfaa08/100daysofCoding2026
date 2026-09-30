package com.mycompany.main.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        
        boolean lebihBesar = angka1 > angka2;
        boolean lebihKecil = angka1 < angka2;
        
        System.out.println("Lebih besar: " + lebihBesar);
        System.out.println("Lebih kecil: " + lebihKecil);
    }
}
