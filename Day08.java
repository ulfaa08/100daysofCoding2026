public class VariabelDemo {
    public static void main(String[] args) {
        
        // 1. DEKLARASI = ngumumin "aku mau bikin variabel"
        int umur;
        String nama;
        double ipk;
        
        // 2. INISIALISASI = ngasih nilai pertama kali
        umur = 20;
        nama = "Budi";
        ipk = 3.75;
        
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        
        // 3. UPDATE = ganti nilai variabel
        umur = 21; // umur nambah 1 tahun
        ipk = 3.90; // ipk naik
        
        System.out.println("\n--- Setelah di Update ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
    }
}
