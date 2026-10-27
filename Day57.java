package javaapplication24;
import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = s.nextInt();

        System.out.println("Angka ganjil 1-N : ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nAngka genap 1-N : ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
