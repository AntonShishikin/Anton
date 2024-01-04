import java.time.Year;

public class Book {
    private int year;
    private String author;
    private String name;
    private int price;

    private String genre;

    public Book(int year, String author, String name, int price, String genre){
        this.year = year;
        this.author = author;
        this.name = name;
        this.price = price;
        this.genre = genre;
    }
    public Book(String author, String name, int price){
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getYear(){
        return year;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return "Autror:" + author + "\nYear:" + year + "\nName:" + name + "\nPrice:" + price + "\nGenre:" + genre;
    }
}
