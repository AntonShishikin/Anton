import Implements.WomenClothing;
import Implements.MenClothing;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothing) {
                ((WomenClothing) cloth).dressWoman();
                System.out.println(cloth.displayInfo());
                //System.out.println(cloth.getClass().getSimpleName() + " " + cloth.getColor() + " " + cloth.getSize() + " " + cloth.getPrice());
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof MenClothing) {
                ((MenClothing) cloth).dressMan();
                System.out.println(cloth.displayInfo());
                //System.out.println(cloth.getClass().getSimpleName() + " " + cloth.getColor() + " " + cloth.getSize() + " " + cloth.getPrice());
            }
        }
    }
}
