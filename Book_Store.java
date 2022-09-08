import java.util.*;
import java.util.stream.Collectors;
class Book
{
	int id;
	String name;
	String author;
	String category;
	Float price;
	
	public Book(int id,String name,String author, String category,float price)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	void display()
	{
		System.out.println(id +" "+ name +" "+author +" "+ category +" "+ price);
	}
}
public class Book_Store {
	public static void main(String[] args) {
		Book b =new Book(003, "python", "SA", "science", 73);
		Book b1 =new Book(015, "java", "SA", "fiction", 37);
		Book b2 =new Book(055, "c++", "SA", "technology", 70);
		b.display();
		b1.display();
		b2.display();

		//To add a new book object into the collection
		ArrayList<Book> mylist=new ArrayList<Book>();
		mylist.add(b);                            
		mylist.add(b1);
		mylist.add(b2);
		
		//Search a book based on title and if found display the details
		List<String>searchByTitle =mylist.stream().map(p -> p.name).collect(Collectors.toList());
		System.out.println(searchByTitle);
	
		//Search a book based on author and if found display the details
		List<String>searchByAuthor =mylist.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);	
	}
}
