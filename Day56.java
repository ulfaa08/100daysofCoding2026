package javaapplication24;
import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = s.nextInt();
        
        System.out.println("Cetak 1-N : ");
        int i = 1;
        while(i <= N){
            System.out.print(i+" ");
            i++;
        }
        
        System.out.println("\n\nCetak N-1 : ");
        int j = N;
        while(j >= 1){
            System.out.print(j+" ");
            j--;
        }
    }
}
