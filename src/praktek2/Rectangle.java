package praktek2;

public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=5;
        lebar=3;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void cetakinfo(){
        System.out.println("====================");
        System.out.println("Panjang : "+panjang);
        System.out.println("lebar   : "+lebar);
        System.out.println("====================");
    }
    
    double hitungluas(){
        double luas;
        luas = panjang*lebar;
        return luas;
    }
    
    void cetakluas(){
        System.out.println("Luasnya yaitu : "+hitungluas());
    }
}
