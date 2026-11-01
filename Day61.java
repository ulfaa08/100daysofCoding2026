package day61;

import java.util.Scanner;

public class MengalikanangkaN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int N = input.nextInt();
        
        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
            System.out.print(i);
            if (i < N) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + hasil);
        input.close();
    }
}
