package soal.pkg2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            if (N == 0) {
                System.out.println("Program selesai.");
                break;
            }
            
            String ganjilGenap = (N % 2 == 0) ? "Genap" : "Ganjil";
            String posNeg = (N > 0) ? "Positif" : "Negatif";
            
            System.out.println(ganjilGenap + " " + posNeg);
        }
        sc.close();
    }
}
