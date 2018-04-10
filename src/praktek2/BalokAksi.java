package praktek2;

public class BalokAksi {
    public static void main(String[] args) {
        
        Balok r1 = new Balok();
            r1.panjang = 9;
            r1.lebar = 3;
            r1.tinggi = 12;
            
            r1.cetakinfo();
            System.out.println("Luasnya adalah : "+r1.hitungluas());
            r1.cetakluas();
            
        Balok r2 = new Balok();
            r2.cetakinfo();
            
        Balok r3 = new Balok(21,16,26);
            r3.cetakinfo();
    }
}
