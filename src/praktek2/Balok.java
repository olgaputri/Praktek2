package praktek2;

public class Balok {
    double tinggi;
    double panjang;
    double lebar;

    public Balok() {
        panjang=9;
        lebar=6;
        tinggi=12;
    }

    public Balok(double tinggi, double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    void cetakinfo(){
        System.out.println("====================");
        System.out.println("Tinggi   : "+tinggi);
        System.out.println("Panjang : "+panjang);
        System.out.println("lebar   : "+lebar);
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
