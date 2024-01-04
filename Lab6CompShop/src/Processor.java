import Enums.ProcessorManufacturer;

public class Processor {
    private String name;
    private ProcessorManufacturer manufacturer;
    private int quantityOfKernels;

    Processor(String name, ProcessorManufacturer manufacturer, int quantityOfKernels){
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantityOfKernels = quantityOfKernels;
    }

    public void setManufacturer(ProcessorManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityOfKernels(int quantityOfKernels) {
        this.quantityOfKernels = quantityOfKernels;
    }

    public int getQuantityOfKernels() {
        return quantityOfKernels;
    }

    public String getName() {
        return name;
    }

    public ProcessorManufacturer getManufacturer() {
        return manufacturer;
    }
}
