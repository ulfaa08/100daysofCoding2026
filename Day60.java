package jumlah1n;

import java.util.Scanner;

public class Jumlah1N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i; 
        }

        System.out.println("Jumlah angka 1 sampai " + N + " adalah: " + jumlah);
        input.close();
    }
}
