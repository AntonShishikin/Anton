package Enums;

public enum ProcessorManufacturer {
    INTEL("Intel"),
    SAMSUNG("Samsung"),
    APPLE("Apple"),
    AMD("AMD");

    private String name;

    ProcessorManufacturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

