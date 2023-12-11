package lesson04;

//для сервисных операций

public class BooksUtil {

    public void editBooksCatalogNumber (int catalogNumber, Books book1) {

        book1.catalogNumber = catalogNumber;
    }
    public void editBooksPageNumber (int pages, Books book1) {

        book1.pages = pages;
    }
    public void editBooksIsInStock (boolean isInStock, Books book1) {

        book1.isInStock = true;
    }

    //=================================================================

    public void editBooksCatalogNumber1 (int catalogNumber, Books book2) {

        book2.catalogNumber = catalogNumber;
    }
    public void editBooksPageNumber1 (int pages, Books book2) {

        book2.pages = pages;
    }
    //========================== copy ========================================

    public Books copyBooks(Books books){
        Books copyBooks = new Books(books.author, books.name, books.pages, books.catalogNumber, books.isInStock );
        return copyBooks;
    }
}
