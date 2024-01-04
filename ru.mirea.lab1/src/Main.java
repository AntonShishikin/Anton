import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option");
        System.out.println("1.Test dog class");
        System.out.println("2.Test book class");
        System.out.println("Other - Exit program");

        int n = scanner.nextInt();
        switch(n){
            case 1:
                testDog();
            case 2:
                testBook();
            default:
                System.exit(0);
        }
    }

    public static void testBook(){
        ArrayList<Book> books = new ArrayList<>();
        int num = randomNumber();
        for (int i = 0; i < num; i++){
            Book book = new Book(yearGenerator(), nameGenerator(), nameGenerator(), randomNumber(), nameGenerator());
            books.add(book);
        }
        for(int i = 0; i <num; i++) {
            System.out.println(books.get(i).toString());
        }
        System.out.println(books.get(1).getName());
        books.get(1).setName("Master and Margarite");
        System.out.println(books.get(1).getName());
        System.out.println(books.get(2).getYear());
        System.out.println(books.get(1));
    }

    public static void testDog() {
         ArrayList<Dog> dogs = new ArrayList<>();
         int num = randomNumber();
        for (int i = 0; i < num; i++){
            Dog dog = new Dog(nameGenerator(), randomNumber());
            dogs.add(dog);
        }
        for(int i = 0; i <num; i++) {
            System.out.println(dogs.get(i).toString());
        }
    }

    public static int yearGenerator() {
        int num = new Random().nextInt(1000, 2023) + 1;
        return num;
    }

   public static int randomNumber() {
       int num = new Random().nextInt(15) + 1;
        return num;
   }

    public static String nameGenerator() {
        int length = randomNumber();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(10);
            char ch = (char) ('a' + index);
            sb.append(ch);
        }
        return sb.toString();
    }
}