public class TukarNilai {
    public static void main(String[] args) {
        int a = 50;
        int b = 80;

        System.out.println("Sebelum tukar: a = " + a + ", b = " + b);

        // tukar nilai
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sesudah tukar: a = " + a + ", b = " + b);
    }
}
