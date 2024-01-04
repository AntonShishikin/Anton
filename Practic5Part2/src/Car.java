import Implements.Namable;
import Implements.Pricable;

public class Car implements Namable, Pricable {
    private String name;
    private int hp;
    private String options;
    private String country;
    private float price;

    Car(String name, int hp, String options, String country, int price){
        this.price = price;
        this.name = name;
        this.hp = hp;
        this.options = options;
        this.country = country;
    }

    public int getHp() {
        return hp;
    }

    public String getOptions() {
        return options;
    }

    public String getCountry(){
        return country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
