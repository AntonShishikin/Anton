public abstract class Clothes {
    private Size size;
    private double price;
    private String color;

    Clothes(Size size, double price, String color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public abstract String displayInfo();

    public Size getSize(){
        return size;
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
