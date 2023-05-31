import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<Book> books = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String goBack = "y";
		initBooks();
		
		while (goBack.equals("y")) {
			showMenu();
			int pil = chooseMenu();
			
			switch(pil) {
				case 1: 
					showBook();
					break;
				case 2: 
					addBook();
					break;
				case 3: 
					editBook();
					break;
				case 4: 
					deleteBook();
					break;
				default: 
					System.out.println("Menu tidak ada");
			}
			
			System.out.println("Lanjut? (y/n)");
			goBack = scan.next();
		}
	}
	
	public static void initBooks() {
		
		Book book1 = new Book();
		book1.setId(1);
		book1.setTitle("Pemrograman Java");
		
		Book book2 = new Book();
		book2.setId(2);
		book2.setTitle("Pemrograman Web");
		
		Book book3 = new Book();
		book3.setId(3);
		book3.setTitle("Pemrograman Mobile");
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
	}
	
	public static void showBook() {
		
		for (int i = 1; i <= books.size(); i++ ) {
			System.out.println(i + " " + books.get(i-1).getTitle());
		}
		
	}
	
	public static void addBook() {
		System.out.println("Masukkan id buku: ");
		int id = scan.nextInt();
		
		System.out.println("Masukkan judul buku: ");
		scan.nextLine();
		String title = scan.nextLine();
		
		Book bookAdd = new Book();
		bookAdd.setId(id);
		bookAdd.setTitle(title);
		
		books.add(bookAdd);
	}
	
	public static void editBook() {
		System.out.println("Masukkan index buku yang ingin di edit: ");
		int id = scan.nextInt();
		
		System.out.println("Masukkan id baru: ");
		int idNew = scan.nextInt();
		
		System.out.println("Masukkan judul baru: ");
		scan.nextLine();
		String titleNew = scan.nextLine();
		
		Book bookEdit = books.get(id-1);
		bookEdit.setId(idNew);
		bookEdit.setTitle(titleNew);
		books.set(id-1, bookEdit);
		
	}
	
	public static void deleteBook() {
		try {
			System.out.println("Masukkan index buku yang ingin di hapus: ");
			int id = scan.nextInt();
			books.remove(id-1);
		} catch (Exception e) {
			System.out.println("Inputan index salah");
			
		}
	}
	
	public static void showMenu() {
		System.out.println("CRUD Buku");
		System.out.println("1. Melihat Buku yang Ada");
		System.out.println("2. Menambah Buku");
		System.out.println("3. Mengupdate Buku");
		System.out.println("4. Menghapus Buku");
	}
	
	public static int chooseMenu() {
		int pilihan = scan.nextInt();
		return pilihan;
	}
	
}
