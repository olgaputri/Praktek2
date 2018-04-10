package praktek2;

public class Balok {
    double panjang;
    double lebar;
    double tinggi;

    public Balok() {
        panjang=5;
        lebar=3;
        tinggi=7;
    }

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    void cetakinfo(){
        System.out.println("====================");
        System.out.println("Panjang : "+panjang);
        System.out.println("lebar   : "+lebar);
        System.out.println("Tinggi   : "+tinggi);
        System.out.println("====================");
    }
    
    double hitungluas(){
        double luas;
        luas = 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
        return luas;
    }
    
    void cetakluas(){
        System.out.println("Luasnya yaitu : "+hitungluas());
    }
}
