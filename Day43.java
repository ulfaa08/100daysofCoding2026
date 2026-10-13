package com.mycompany.kelipatan;

import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--- CEK KELIPATAN 3 & 5 ---");
            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();
            
            if (angka % 3 == 0 && angka % 5 == 0) {
                System.out.println(angka + " -> Kelipatan 3 dan 5");
            } else if (angka % 3 == 0) {
                System.out.println(angka + " -> Kelipatan 3");
            } else if (angka % 5 == 0) {
                System.out.println(angka + " -> Kelipatan 5");
            } else {
                System.out.println(angka + " -> Bukan kelipatan 3 atau 5");
            }
        }
    }
}
