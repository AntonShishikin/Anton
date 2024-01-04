import Enums.ComputerManufacturer;
import Enums.MemoryManufacturer;
import Enums.MemorySize;
import Enums.ProcessorManufacturer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add computer");
            System.out.println("2. Remove computer");
            System.out.println("3. Display computers by manufacturer");
            System.out.println("4. Display all computers");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter manufacturer (e.g. HYPERX, LENOVO):");
                    ComputerManufacturer manufacturer = ComputerManufacturer.valueOf(scanner.nextLine().toUpperCase());

                    System.out.println("Enter processor:");
                    String processorName = scanner.nextLine();
                    System.out.println("Enter processor Manufacturer: ");
                    ProcessorManufacturer processorManufacturer = ProcessorManufacturer.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Enter processor quaint of kernels: ");
                    int kernels = scanner.nextInt();

                    Processor processor = new Processor(processorName,processorManufacturer, kernels);

                    System.out.println("Enter memory name: ");
                    String memoryName = scanner.nextLine();
                    System.out.println("Enter memory Size: ");
                    MemorySize memorySizee = MemorySize.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Enter memory Manufacturer: ");
                    MemoryManufacturer memoryManufacturer = MemoryManufacturer.valueOf(scanner.nextLine().toUpperCase());
                    Memory memory = new Memory(memoryName, memorySizee, memoryManufacturer);

                    System.out.println("Enter monitor:");
                    String monitor = scanner.nextLine();

                    System.out.println("Enter graphics card:");
                    String graphicsCard = scanner.nextLine();

                    Computer computer = new Computer(processor, memory, monitor, graphicsCard, manufacturer);
                    shop.addComputer(computer);
                    break;

                case 2:
                    System.out.println("Enter index of computer to remove:");
                    int index = scanner.nextInt();
                    shop.removeComputer(shop.getComputers().get(index));
                    break;
                case 3:
                    System.out.println("Enter manufacturer to display (e.g. HP, DELL):");
                    manufacturer = ComputerManufacturer.valueOf(scanner.nextLine().toUpperCase());
                    for (Computer comp : shop.searchByManufacturer(manufacturer)) {
                        comp.print();
                    }
                    break;
                case 4:
                    shop.displayComputers();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
