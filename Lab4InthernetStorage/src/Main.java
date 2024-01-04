import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Products> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Laptops macbook = new Laptops(249999.00,"MacbookPro M1", "USA",Types.COMPUTER, "grey", "M1Pro");
        Laptops xiaomi = new Laptops(130000.00, "mi notebook air", "China", Types.COMPUTER, "grey", "Intel Core I5");
        Teapot polaris = new Teapot(10000, "Polaris X1", "China", Types.TEAPOT, 10);
        Teapot redmond = new Teapot(12000, "Redmond Ultra", "China", Types.TEAPOT, 12);
        Phone iphone14 = new Phone(150000.00, "Iphone14", "USA", Types.PHONE, 12);
        Phone samsungGS22 = new Phone(80000, "Samsung Galaxy S 22 +", "Korea", Types.PHONE, 50);
        Plate bosh = new Plate(100000, "Bosh Hot", "Germany", Types.COOKTOP, 1200);
        User user = new User("Anton", "123456");

        Products[] products = {macbook, xiaomi, polaris, redmond, iphone14, samsungGS22, bosh};

        System.out.println("Enter your login:");
        String login = sc.next();
        if (Objects.equals(login, user.getLogin())){
            System.out.println("Enter your password:");
            String password = sc.next();
            if (Objects.equals(password, user.getPassword())){
                while(true) {
                    System.out.println("Enter an option:\n 1. All Products\n 2. By Category\n 3. Show cart");
                    int category = sc.nextInt();
                    switch (category) {
                        case 1:
                            for (Products product : products) {
                                System.out.println(product.displayInfo());
                                addToCart(products, Types.COMPUTER, cart, sc);
                            }
                            break;
                        case 2:
                            System.out.println("Choose category:\n 1. COMPUTER\n 2. TEAPOT\n 3. PHONE\n 4. COOKTOP");
                            int type = sc.nextInt();
                            switch (type) {
                                case 1:
                                    for (Products product : products) {
                                        if (product.getType() == Types.COMPUTER) {
                                            System.out.println(product.displayInfo());
                                            addToCart(products, Types.COMPUTER, cart, sc);
                                        }
                                    }
                                    break;
                                case 2:
                                    for (Products product : products) {
                                        if (product.getType() == Types.TEAPOT) {
                                            System.out.println(product.displayInfo());
                                            addToCart(products, Types.COMPUTER, cart, sc);
                                        }
                                    }
                                    break;
                                case 3:
                                    for (Products product : products) {
                                        if (product.getType() == Types.PHONE) {
                                            System.out.println(product.displayInfo());
                                            addToCart(products, Types.COMPUTER, cart, sc);
                                        }
                                    }
                                    break;
                                case 4:
                                    for (Products product : products) {
                                        if (product.getType() == Types.COOKTOP) {
                                            System.out.println(product.displayInfo());
                                            addToCart(products, Types.COMPUTER, cart, sc);
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid choice. Exiting.");
                                    break;
                            }
                            break;
                        case 3:
                            for (Products product : cart){
                                System.out.println(product.displayInfo());
                            }
                            break;
                        default:
                            System.out.println("Invalid choice. Exiting.");
                            break;
                    }
                }
            }
        }
    }
    private static void addToCart(Products[] products, Types type, List<Products> cart, Scanner sc) {
        System.out.println("Would you like to add any of these to your cart? Enter the product name or type 'no' to skip.");
        String choice = sc.nextLine();

        if (!choice.equalsIgnoreCase("no")) {
            boolean added = false;
            for (Products product : products) {
                if (product.getName().equalsIgnoreCase(choice)) {
                    cart.add(product);
                    added = true;
                    System.out.println("Product added to cart!");
                    break;
                }
            }

            if (!added) {
                System.out.println("Product not found. Nothing added to cart.");
            }
        }
    }
}
