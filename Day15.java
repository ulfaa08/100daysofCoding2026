package tokobuahpakbudi;

import java.util.Scanner;

public class TokoBuahPakBudi {
    public static void main(String[] args) {
        // 1. Input dari pengguna
        try (Scanner input = new Scanner(System.in)) {
            // 1. Input dari pengguna
            System.out.print("Masukkan jumlah kotak apel: ");
            int jumlahKotak = input.nextInt();
            
            System.out.print("Masukkan jumlah apel per kotak: ");
            int isiPerKotak = input.nextInt();
            
            System.out.print("Masukkan jumlah tetangga: ");
            int jumlahTetangga = input.nextInt();
            
            // 2. Perhitungan
            // Operator Perkalian (*) untuk total apel
            int totalApel = jumlahKotak * isiPerKotak;
            
            // Operator Pembagian (/) untuk pembagian ke tetangga
            int apelPerTetangga = totalApel / jumlahTetangga;
            
            // 3. Output hasil
            System.out.println("\n--- HASIL PERHITUNGAN ---");
            System.out.println("Total seluruh apel Pak Budi : " + totalApel);
            System.out.println("Setiap tetangga mendapatkan : " + apelPerTetangga + " buah");
        }
    }
}
