
public class JumlahAngka {
    public static void main(String[] args) {
        int bilangan = Integer.parseInt(System.console().readLine("Masukkan bilangan: "));
        int jumlahAngka = hitungJumlahAngka(bilangan);
        System.out.println("Jumlah angka dalam bilangan " + bilangan + " adalah " + jumlahAngka);
    }
    
    public static int hitungJumlahAngka(int bilangan) {
        if (bilangan == 0) {
            return 0;
        } else {
            int digitTerakhir = bilangan % 10; // Mengambil digit terakhir
            int sisaBilangan = bilangan / 10; // Mengurangi digit terakhir
            
            return digitTerakhir + hitungJumlahAngka(sisaBilangan);
        }
    }
}

