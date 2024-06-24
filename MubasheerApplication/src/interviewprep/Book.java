package interviewprep;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private int Id;
	private String Name;
	private String Author;
	private String Publication;

	public Book(int id, String name, String author, String publication) {
		super();
		Id = id;
		Name = name;
		Author = author;
		Publication = publication;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublication() {
		return Publication;
	}

	public void setPublication(String publication) {
		Publication = publication;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Name=" + Name + ", Author=" + Author + ", Publication=" + Publication + "]";
	}

	public static void main(String[] args) {

		Book books1 = new Book(1, "Abook", "Aauthor", "Apublication");
		Book books2 = new Book(2, "Bbook", "Bauthor", "Bpublication");
		Book books3 = new Book(3, "Cbook", "Cauthor", "Cpublication");
		Book books4 = new Book(4, "Dbook", "Dauthor", "Dpublication");
		
		List<Book> booksList = new ArrayList<Book>();
		booksList.add(books1);
		booksList.add(books2);
		booksList.add(books3);
		booksList.add(books4);

		for (Book b : booksList) {
			System.out.println("Book_ID: " + b.Id + " Book_Name: " + b.Name + " Book_Author: " + b.Author
					+ " Book_Publication: " + b.Publication);

		}

	}
}
