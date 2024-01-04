import Implements.Namable;
import Implements.Pricable;
import Implements.Printable;

public class Magazine extends Products implements Printable, Pricable, Namable {
    private String publisher;
    private String theme;
    Magazine(String name, float price, String publisher, String theme) {
        super(name, price);
        this.theme = theme;
        this.publisher = publisher;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()+
                "\nPublisher: " + getPublisher()+
                "\nTheme: " + getTheme() +
                "\nPrice: " + getPrice());
    }

    public String getTheme(){
        return theme;
    }

    public String getPublisher(){
        return publisher;
    }
}
