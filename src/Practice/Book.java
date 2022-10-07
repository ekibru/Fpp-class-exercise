package Practice;

import java.util.List;

public class Book {
    private String little;
    double price;
    List<String> authors;

    public String getLittle() {
        return little;
    }

    private void setLittle(String little) {
        this.little = little;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Book() {
    }

    public Book(String little, double price, List<String> authors) {
        this.little = little;
        this.price = price;
        this.authors = authors;
    }
     @Override
    public String toString(){
        return "Name of the book: "+little+" "+
                "Price of the book: "+price+" "+
                "Authors: "+getAuthors();
    }
}
