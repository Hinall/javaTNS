package TNSjava.List.ArrayList;

import java.util.ArrayList;

public class Book {
    int id;
    int quantity;
    String name,author,publisher;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        ArrayList<Book> al=new ArrayList<>();
        Book b1=new Book(1,"hinal","nnk","dgr",3);
        Book b2=new Book(2,"hinahtrhl","nnhtk","dgrgerr",3);
        Book b3=new Book(3,"hitgtfnal","nnhttrdek","dhthtgr",3);

        al.add(b1);
        al.add(b2);
        al.add(b3);

        for (Book b:al) {
            System.out.println(b.id+""+b.author+""+b.quantity);
            
        }


    }
}
