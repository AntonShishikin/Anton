import Implements.Printable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Printable> booksAndMagazines  = new ArrayList<>();
        booksAndMagazines.add(new Book("LittlePrince", "Antoine de Saint-Exupéry", 1943, "FranchBook", 500));
        booksAndMagazines.add(new Magazine("FishingWork", 744, "Mostorg", "Fishing"));
        booksAndMagazines.add(new Book("Turbokit into Priora", "Shishikin Anton", 2022, "Make your car faster then a bullet", 1299));
        booksAndMagazines.add(new Magazine("PrioraDaily", 599, "Vladislav Koshbakoff", "Cars"));
        booksAndMagazines.add(new Book("GAZ 3110", "Gorkovsky Avtomobilny Zavod", 1998, "All about GAZ 3110", 765));

        for(Printable prdct : booksAndMagazines){
            prdct.print();
        }
//
//        Shop shop = new Shop(booksAndMagazines);
//        System.out.print("Введите имя продукта для поиска: ");
//        String searchName = sc.nextLine();
//        System.out.println(shop.findProductByName(searchName));
    }
}