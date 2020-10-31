import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ques3 {
	
	public static void main(String[] args) {
		
		Book book = new Book(1, "Think Like a Monk", "Jay Shetty");
		Book book1 = new Book(2, "The Dharma Forest", "Keerthik Sasidharan");
		Book book2 = new Book(3, "How the Onion Got Its Layers", "Sudha Murthy");
		Book book3 = new Book(4, "The Thin Mind Map", "Dharmendra Rai");
		BookCollection bookCol = new BookCollection();
		bookCol.bookList.add(book);
		bookCol.bookList.add(book1);
		bookCol.bookList.add(book2);
		bookCol.bookList.add(book3);
		System.out.println("---------------before sorting---------------");
		printBooks(bookCol.bookList);
		Book bookUpdate = new Book("ikigai", "george");
		bookCol.hasBook(bookUpdate);
		System.out.println("---------------after sorting by book title---------------");
		bookCol.sortByBookName();
		System.out.println("---------------after sorting by author ---------------");
		bookCol.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}