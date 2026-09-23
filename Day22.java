public class TukarNilai {
    public static void main(String[] args) {
        int a = 50;
        int b = 80;

        System.out.println("Sebelum: a = " + a + ", b = " + b);

        b = a + b - (a = b);

        System.out.println("Sesudah: a = " + a + ", b = " + b);
    }
}
