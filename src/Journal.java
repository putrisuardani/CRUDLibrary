
public class Journal extends Book {
	
	@Override
	public void printTitle() {
		super.printTitle();
	}
	
	public void printTitle(String title) {
		this.setTitle(title);;
		super.printTitle();
	}
	
	public void printTitle(int id) {
		System.out.println("ini method abstract loh");
	}

}

