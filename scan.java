import java.util.Scanner;

public class Book{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name of your favorite book: ");
		String nameOfBook = scan.next();
		scan.nextLine();
		
		System.out.println("Enter author of book: ");
		String authorBook = scan.nextLine();
		
		
		System.out.println("Enter number of pages: ");
		int pages = scan.nextInt();
		
		System.out.println("Enter genre of book: ");
		String genre = scan.next();
		
		System.out.println("Enter how longtime did you read: ");
		short time = scan.nextShort();
		
		System.out.printf("Name of your favorite book: %s\nAuthor of book: %s\nNumber of pages: %d\nGenre of book: %s\nDuration of reading: %f",
		nameOfBook,authorBook,pages,genre,time);
		
		
		
}
}	
		
