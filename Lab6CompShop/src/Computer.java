import Enums.ComputerManufacturer;

public class Computer implements ComputerImp{
    private Processor processor;
    private Memory memory;
    private String monitor;
    private String graphicsCard;
    private ComputerManufacturer manufacturer;

    Computer(Processor processor, Memory memory, String monitor, String graphicsCard, ComputerManufacturer manufacturer){
        this.graphicsCard = graphicsCard;
        this.processor = processor;
        this.memory = memory;
        this.manufacturer = manufacturer;
        this.monitor = monitor;
    }


    @Override
    public void print() {
        System.out.println("Name: " + manufacturer.getName() +
                "\nProcessor: " + processor.getName() +
                "\nMemory: " + memory.getName() +
                "\nManufacturer: " + manufacturer +
                "\nGraphics: " + graphicsCard +
                "\nMonitor: " + monitor);
    }

    @Override
    public void enterInfo() {

    }

    @Override
    public void enterInfo(String processor, String memory, String monitor, String graphicsCard, ComputerManufacturer manufacturer) {

    }

    public ComputerManufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public void enterInfo(Processor processor, Memory memory, String monitor, String graphicsCard, ComputerManufacturer manufacturer) {
        this.graphicsCard = graphicsCard;
        this.processor = processor;
        this.memory = memory;
        this.manufacturer = manufacturer;
        this.monitor = monitor;
    }
}
