import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan poin awal: ");
        int poin = sc.nextInt();
        System.out.println("Poin awal: " + poin);

        poin += 10; 
        System.out.println("Setelah menang (+= 10), poin jadi: " + poin);

        poin -= 5; 
        System.out.println("Setelah kalah (-= 5), poin jadi: " + poin);

        poin *= 2; 
        System.out.println("Dapat bonus double (*= 2), poin jadi: " + poin);

        poin /= 3; 
        System.out.println("Poin dibagi 3 (/= 3), poin jadi: " + poin);

        poin %= 4; 
        System.out.println("Sisa bagi 4 (%= 4), poin akhir: " + poin);

        sc.close();
    }
}
