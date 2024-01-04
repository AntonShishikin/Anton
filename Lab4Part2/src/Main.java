public class Main {

    public static void main(String[] args) {
        // Создаем различные виды одежды с разными характеристиками
        TShirt tshirt1 = new TShirt(Size.M, 19.99, "Red", "Nike");
        TShirt tshirt2 = new TShirt(Size.L, 24.99, "Blue", "Adidas");
        Pants pants1 = new Pants(Size.S, 29.99, "Black", "Tissue", "Bloomers");
        Pants pants2 = new Pants(Size.M, 34.99, "Grey", "Skin", "Trouser");
        Skirt skirt1 = new Skirt(Size.XS, 39.99, "Yellow", 12);
        Tie tie1 = new Tie(Size.S, 14.99, "Green", "Short");

        // Создаем массив одежды
        Clothes[] clothesArray = {tshirt1, tshirt2, pants1, pants2, skirt1, tie1};

        // Создаем объект Atelier
        Atelier atelier = new Atelier();

        // Печатаем информацию о женской одежде
        System.out.println("Women's clothing:");
        atelier.dressWomen(clothesArray);

        System.out.println("\nMen's clothing:");
        atelier.dressMan(clothesArray);
    }
}
