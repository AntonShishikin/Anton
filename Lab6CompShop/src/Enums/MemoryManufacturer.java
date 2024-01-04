package Enums;

public enum MemoryManufacturer {
    HYPERX("Hyper X"),
    SAMSUNG("Samsung"),
    GGIGABYTE("Gigabyte");

    private String name;

    MemoryManufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
