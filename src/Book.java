
public class Book {
	
	private int id;
	private String title;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void printTitle() {
		System.out.println("ini judulnya: " + title);
	}
	
}
