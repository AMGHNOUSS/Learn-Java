
/*
 * Create a class called "Book" with attributes for title, author, and ISBN
 * Create methods to add and remove books from a collection.
 */

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    static ArrayList < Book > books = new ArrayList < Book > ();

    public Book(String t, String a, String n){
        title = t;
        author = a;
        ISBN = n;
    }
    public void add(Book b) {
        books.add(b);
    }
    public void remove(Book b) {
        books.remove(b);
    }
    public void setTitle(String t){
        title = t;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setISBN(String n){
        ISBN = n;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }    
    public String getISBN(){
        return ISBN;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", "15423");
        Book b2 = new Book("The power of habits", "Charles Duhigg", "12436");
        b1.add(b1);
        b2.add(b2);
        for (int i = 0; i < books.size(); i++) {
            System.out.println( books.get(i).title + " " + books.get(i).author + " " +  books.get(i).ISBN);
        }
        b2.remove(b2);
        for (int i = 0; i < books.size(); i++) {
            System.out.println( books.get(i).title + " " + books.get(i).author + " " +  books.get(i).ISBN);
        }
    }
}
