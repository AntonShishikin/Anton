import Implements.Printable;

public class Book extends Products implements Printable {
    private String author;
    private int year;
    private String description;
    private float price;

    Book(String name, String author, int year, String description, float price){
        super(name, price);
        this.author = author;
        this.year = year;
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Author: " + author + "\nYear: " +  year + "\nDescription: " + description + "\nPrice: " + price + "\n");
    }

}

