import Enums.ComputerManufacturer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> searchByManufacturer(ComputerManufacturer manufacturer) {
        return computers.stream()
                .filter(computer -> computer.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Computer> getComputers() {
        return computers;
    }


    public void displayComputers() {
        for (Computer computer : computers) {
            computer.print();
        }
    }
}
