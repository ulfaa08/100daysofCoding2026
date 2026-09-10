public class ConstantaGame {
    public static void main(String[] args) {
        // CONSTANTA GAME
        final int MAX_HP = 100;
        final int DAMAGE_MUSUH = 25;
        final String NAMA_GAME = "Free fire ";
        
        int hpSekarang = MAX_HP;
        
        System.out.println("Game: " + NAMA_GAME);
        System.out.println("HP Awal: " + hpSekarang);
        
        hpSekarang = hpSekarang - DAMAGE_MUSUH; // kena serang
        
        System.out.println("Kena serangan! -" + DAMAGE_MUSUH);
        System.out.println("HP Sekarang: " + hpSekarang);
        System.out.println("HP Maksimal: " + MAX_HP);
        
        // MAX_HP = 200; // ERROR! gabisa diubah
    }
}
