package com.mycompany.predikat;

import java.util.Scanner;

public class Predikat {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("--- PROGRAM PREDIKAT NILAI ---");
            System.out.print("Masukkan Nilai (0-100): ");
            int nilai = sc.nextInt();
            
            String predikat;
            
            if (nilai >= 90 && nilai <= 100) {
                predikat = "A (Sangat Baik)";
            } else if (nilai >= 80) {
                predikat = "B (Baik)";
            } else if (nilai >= 70) {
                predikat = "C (Cukup)";
            } else if (nilai >= 60) {
                predikat = "D (Kurang)";
            } else if (nilai >= 0) {
                predikat = "E (Sangat Kurang)";
            } else {
                predikat = "Nilai tidak valid!";
            }
            
            System.out.println("Nilai " + nilai + " -> Predikat " + predikat);
        }
    }
}
