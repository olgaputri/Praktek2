package praktek2;

public class BalokAksi {
    public static void main(String[] args) {
        
        Balok r1 = new Balok();
            r1.panjang = 12;
            r1.lebar = 9;
            r1.tinggi = 16;
            
            r1.cetakinfo();
            System.out.println("Luasnya adalah : "+r1.hitungluas());
            r1.cetakluas();
            
        Balok r2 = new Balok();
            r2.cetakinfo();
            
        Balok r3 = new Balok(30,24,33);
            r3.cetakinfo();
    }
}
