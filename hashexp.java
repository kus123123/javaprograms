import java.util.*;
class book{

    int id;
    String name , author,publisher;
    int quantity;


public  book (int id ,String name , String author , String publisher , int quanitiy){
    this.id=id;
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.quantity=quanitiy;


}
    
}
public class hashexp{
    public static void main(String[] args) {
        HashSet<book> set =new HashSet<>();
        book b1 =new book(101,  "let us C", "yashwant", "bnn3", 32);
        book b2 =new book(102,  "let us Java", "yashwant1", "bnn34", 32);
        book b3 =new book(103,  "let us python", "yashwan2", "bnn44", 32);
       
        set.add(b1);
        set.add(b2);
        set.add(b3);

        for (book b:set)
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
        
    }
}
