package com.mycompany.gajibersih;

import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--- PROGRAM GAJI BERSIH ---");
            System.out.print("Masukkan Nama Karyawan: ");
            String nama = sc.nextLine();
            
            System.out.print("Masukkan Gaji Pokok: ");
            double gapok = sc.nextDouble();
            
            System.out.print("Masukkan Tunjangan: ");
            double tunjangan = sc.nextDouble();
            
            double pajak;
            double gajiKotor = gapok + tunjangan;
            
            // Menentukan pajak 
            if (gajiKotor >= 10000000) {
                pajak = gajiKotor * 0.10; // pajak 10% jika >= 10jt
            } else if (gajiKotor >= 5000000) {
                pajak = gajiKotor * 0.05; // pajak 5% jika >= 5jt
            } else {
                pajak = 0; // tidak kena pajak jika di bawah 5jt
            }
            
            double gajiBersih = gajiKotor - pajak;
            
            System.out.println("\n--- RINCIAN GAJI ---");
            System.out.println("Nama: " + nama);
            System.out.println("Gaji Pokok: Rp " + gapok);
            System.out.println("Tunjangan: Rp " + tunjangan);
            System.out.println("Gaji Kotor: Rp " + gajiKotor);
            System.out.println("Pajak: Rp " + pajak);
            System.out.println("Gaji Bersih Diterima: Rp " + gajiBersih);
        }
    }
}
