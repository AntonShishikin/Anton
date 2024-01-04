package Enums;

public enum ComputerManufacturer {
    HYPERX("Hyper X"),
    HYPERPC("Hyper PC"),
    LENOVO("Lenovo"),
    ASUS("Asus"),
    SAMSUNG("Samsung");

    private String name;

    ComputerManufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
