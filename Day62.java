package day62;

public class Day62 {
    public static void main(String[] args) {
        System.out.println("=== TABEL PERKALIAN 5x5 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
