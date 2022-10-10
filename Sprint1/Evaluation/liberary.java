package Week1_Evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class liberary {
    List<Book> ls=new ArrayList<>();
    void addBook(Book book)throws BookException{
        if(ls.size()==0){
            ls.add(book);
        }
        else {
            ls.forEach(l -> {
                if (l.getBookName().equals(book.getBookName()) && l.getAuthor().equals(book.getAuthor()) && l.getIsbn() == book.getIsbn()) {
                    try {
                        throw new BookException("Book already Exists");
                    } catch (BookException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }
    List viewAllBooks()throws BookException{
            if(ls.size()==0){
                throw new BookException("no Book In LIst");
            }
            ls.sort((Book b1,Book b2)->{
                return b1.getBookName().compareTo(b2.getBookName());
            });
            return ls;
    };
    List viewBooksByAuthor(String author)throws BookException{
        List<Book>ansls=new ArrayList<>();
        ls.forEach(l->{
            if(l.getAuthor().equals(author)){
                ansls.add(l);
            }
        });
        if(ansls.size()==0){
            throw new BookException("No Book of this Author");
        }
        else {
            return ansls;
        }
    }
    Book getBookByISBN(int isbn)throws BookException{
        List<Book>ans=new ArrayList<>();
        ls.forEach(l->{
            if(l.getIsbn()==isbn){
                ans.add(l);
            }
        });
        if(ans.size()==0){
            throw new BookException("No Book of this isbn");
        }
        else {
            return ans.get(0);
        }
    }



    public class BookException extends Exception {
        public BookException(String message) {
            super(message);
        }
    }
}
