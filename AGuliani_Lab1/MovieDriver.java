import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Movie m1 = new Movie();
		char continueM = 'y';
		while(continueM=='y'){
		System.out.println("Enter a movie title:");
		m1.setTitle(keyboard.nextLine());
		System.out.println("Enter the movie rating:");
		m1.setRating(keyboard.nextLine());
		System.out.println("Enter the tickets sold:");
		m1.setSoldTickets(keyboard.nextInt());
	
		System.out.println(m1.toString());
		
		
		System.out.println("Would you like to add another movie? (y/n)");
		continueM = keyboard.next().charAt(0);
		keyboard.nextLine();
		}
		System.out.println("Goodbye");
	}
}
