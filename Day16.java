package kelerengrasya;

import java.util.Scanner;

public class KelerengRasya {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah kelereng Rasya: ");
            int total = sc.nextInt();
            
            int jatahPerTeman = total / 3;
            int sisa = total % 3; // Operator sisa bagi
            
            System.out.println("\nSetiap teman mendapat: " + jatahPerTeman + " kelereng");
            System.out.println("Sisa kelereng Rasya: " + sisa);
        }
    }
}
