package biodata3.java;

import java.util.Scanner;
public class Biodata3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Nama: "); String nama = s.nextLine();
            System.out.print("Nilai: "); int nilai = s.nextInt();
            String status = nilai >= 75 ? "Lulus" : "Tidak Lulus";
            System.out.println("Nama: " + nama + "\nNilai: " + nilai + "\nStatus: " + status);
        }
    }
}
