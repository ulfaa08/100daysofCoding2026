package day59;

import java.util.Scanner;

public class KelipatanM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("Kelipatan " + M + " dari 1-" + N + ":");
        // Versi efisien: langsung loncat per M
        for (int i = M; i <= N; i += M) {
            System.out.print(i + " ");
        }
        System.out.println();
        input.close();
    }
}
