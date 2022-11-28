
public class Book {


	private String title;
	private String author;
	private Person person;


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}
	public boolean is Available() {
		
	}
	

	public String toString() {
		String available;
	
		if (this.getPerson() == null) {
			available = "Available";
		}
		else {
			available = "Checked out to " + this.getPerson().getName();
		}
		return this.getTitle() + " by " + this.getAuthor() +": " + available;
	}
}