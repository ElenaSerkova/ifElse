package lesson04;

public class BooksUtil {

    public void editBooksCatalogNumber (int catalogNumber, Books book2) {
        book2.catalogNumber = catalogNumber;}
    public void editBooksPageNumber (
            int pages, Books book2) {book2.pages = pages;}
    public void editBooksIsInStock (int isInStock, Books book2) {
        book2.isInStock = true;}

    public Books copyBooks(Books books){
        Books copyBooks = new Books(books.author, books.name, books.pages, books.catalogNumber, books.isInStock );
        return copyBooks;
    }
}
