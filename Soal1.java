package soal.pkg1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long hasil = N * (N + 1) / 2;
        System.out.println(hasil);
        sc.close();
    }
}
