package com.mycompany.predikatswitch;

import java.util.Scanner;

public class PredikatHuruf {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("--- PROGRAM PREDIKAT NILAI (A,B,C,D,E) ---");
            System.out.print("Masukkan Predikat (A/B/C/D/E): ");
            String grade = sc.next().toUpperCase(); // biar kecil jadi besar otomatis
            
            String keterangan;
            
            switch (grade) {
                case "A":
                    keterangan = "Sangat Baik (90-100)";
                    break;
                case "B":
                    keterangan = "Baik (80-89)";
                    break;
                case "C":
                    keterangan = "Cukup (70-79)";
                    break;
                case "D":
                    keterangan = "Kurang (60-69)";
                    break;
                case "E":
                    keterangan = "Sangat Kurang (0-59)";
                    break;
                default:
                    keterangan = "Predikat tidak valid! Masukkan A-E saja.";
                    break;
            }
            
            System.out.println("Predikat " + grade + " -> " + keterangan);
        }
    }
}
