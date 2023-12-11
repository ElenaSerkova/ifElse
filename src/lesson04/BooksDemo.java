package lesson04;

public class BooksDemo {
    public static void main(String[] args) {
        Books book1 = new Books("StivenKing", "Gremleny", 405, 675, true);

        System.out.println(book1);

        System.out.println("============== book2 =====================");

        Books book2 = new Books("LiChild", "PoleSmerty");

        System.out.println(book2);

        System.out.println("=============== util.book1 ====================");

        //класс util; нужен для изменений данных

        BooksUtil util = new BooksUtil();

        util.editBooksCatalogNumber(987, book1);
        util.editBooksPageNumber(280, book1);
        util.editBooksIsInStock(true, book1);

        System.out.println(book1);

        System.out.println("=============== util.book2 ====================");

        util.editBooksCatalogNumber(98, book2);
        util.editBooksPageNumber(20, book2);

        System.out.println(book2);

        System.out.println("============ copy book3 =======================");

        Books book3 = util.copyBooks(book1);

        util.editBooksCatalogNumber(9, book3);
        util.editBooksPageNumber(28, book3);
        util.editBooksIsInStock(true, book3);

        System.out.println(book3);

        System.out.println("============ copy book4 =======================");

        Books book4 = util.copyBooks(book2);

        util.editBooksCatalogNumber(999, book4);
        util.editBooksPageNumber(2899, book4);
        util.editBooksIsInStock(true, book4);

        System.out.println(book4);


}}
