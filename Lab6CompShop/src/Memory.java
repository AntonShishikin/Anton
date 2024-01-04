import Enums.MemoryManufacturer;
import Enums.MemorySize;

public class Memory {
    private String name;
    private MemoryManufacturer manufacturer;
    private MemorySize size;

    Memory(String name, MemorySize size, MemoryManufacturer manufacturer){
        this.name = name;
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setManufacturer(MemoryManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(MemorySize size) {
        this.size = size;
    }

    public MemoryManufacturer getManufacturer() {
        return manufacturer;
    }

    public MemorySize getSize() {
        return size;
    }

    public void printInfo(){
        System.out.println("Name: " + name+
                "\nMemory size: " + size.getSize() +
                "\nManufacturer: " + manufacturer.getName());
    }
}
