package lesson04;

public class BooksDemo {
    public static void main(String[] args) {
        Books book1 = new Books("StivenKing", "Gremleny", 405, 675, true);

        System.out.println(book1);
    Books book2 = new Books("LiChild", "PoleSmerty");

        System.out.println(book2);

        BooksUtil util = new BooksUtil();

        util.editBooksCatalogNumber(987, book2);
        util.editBooksPageNumber(280, book2);

        System.out.println(book2);

        Books book3 = util.copyBooks(book1);

        util.editBooksCatalogNumber(9, book3);
        util.editBooksPageNumber(28, book3);

        System.out.println(book3);


}}
