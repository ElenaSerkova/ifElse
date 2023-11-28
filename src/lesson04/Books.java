package lesson04;

public class Books {
    String author;
    String name;
    int pages;
    int catalogNumber;
    boolean isInStock;

    public Books(String author, String name, int pages, int catalogNumber, boolean isInStock) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.catalogNumber = catalogNumber;
        this.isInStock = isInStock;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", catalogNumber=" + catalogNumber +
                ", isInStock=" + isInStock +
                '}';
    }

    public Books(String author, String name) {
        this.author = author;
        this.name = name;




    }}

