import java.util.Scanner;

public class TukarNilai {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai a: ");
            int a = input.nextInt();
            
            System.out.print("Masukkan nilai b: ");
            int b = input.nextInt();
            
            System.out.println("\nSebelum ditukar:");
            System.out.println("a = " + a + " , b = " + b);
            
            // Proses tukar nilai
            int temp = a;
            a = b;
            b = temp;
            
            System.out.println("\nSesudah ditukar:");
            System.out.println("a = " + a + " , b = " + b);
        }
    }
}
