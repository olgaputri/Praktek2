package praktek2;

public class RectangleAksi {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
            r1.panjang = 9;
            r1.lebar = 3;
            
            r1.cetakinfo();
            System.out.println("Luasnya adalah : "+r1.hitungluas());
            r1.cetakluas();
            
        Rectangle r2 = new Rectangle();
            r2.cetakinfo();
            
        Rectangle r3 = new Rectangle(50,30);
            r3.cetakinfo();
    }
}
