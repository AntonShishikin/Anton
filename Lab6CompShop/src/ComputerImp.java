import Enums.ComputerManufacturer;

public interface ComputerImp {
    void print();
    void enterInfo();

    void enterInfo(String processor, String memory, String monitor, String graphicsCard, ComputerManufacturer manufacturer);

    void enterInfo(Processor processor, Memory memory, String monitor, String graphicsCard, ComputerManufacturer manufacturer);
}
