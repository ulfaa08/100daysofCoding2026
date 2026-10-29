package day58;

import java.util.Scanner;

public class GanjilGenapN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Angka ganjil dari N-1:");
        
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap dari N-1:");
        for (int i = N - 1; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
