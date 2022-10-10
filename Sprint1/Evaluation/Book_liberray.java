package Week1_Evaluation;

import java.util.ArrayList;
import java.util.List;

public class Book_liberray {
    public static void main(String[] args) throws liberary.BookException {
        liberary lib=new liberary();

        Book bk1=new Book();
        bk1.setIsbn(1);
        bk1.setBookName("HarryPoter");
        bk1.setAuthor("JK rowling");
        lib.addBook(bk1);
        Book bk2=new Book();
        bk2.setIsbn(2);
        bk2.setBookName("HarryPoter2");
        bk2.setAuthor("JK rowling");
        lib.addBook(bk2);
        Book bk3=new Book();
        bk3.setIsbn(3);
        bk3.setBookName("persy jakson");
        bk3.setAuthor("phillip");
        lib.addBook(bk3);
        lib.viewAllBooks();
        lib.viewBooksByAuthor("JK rowling");
        lib.getBookByISBN(3);




    }
}
