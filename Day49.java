package com.mycompany.ganjilgenapternary;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Ganjil Genap (Ternary) ===");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // Operator Ternary: kondisi ? benar : salah
        String hasil = (angka % 2 == 0) ? "GENAP" : "GANJIL";

        System.out.println("---------------------------");
        System.out.println("Angka " + angka + " adalah bilangan " + hasil);
        System.out.println("---------------------------");
    }
}
