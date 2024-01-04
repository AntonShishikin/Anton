import Implements.Namable;
import Implements.Pricable;
import Implements.Printable;

public abstract class Products implements Printable, Pricable, Namable {
    private String name;
    private float price;

    Products(String name, float price){
        this.name = name;
        this.price = price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
