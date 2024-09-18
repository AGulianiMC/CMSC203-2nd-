/*
 * Class: CMSC203 
 * Instructor: Dr. Monshi
 * Description: Generates random number for a color and compares with user's guess
 * Due: 09/18/2024
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ankit Guliani
 */

//set up class and main method
//import statements ahead of class
//make sure needed files are in 
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ESPGame {
	public static void main(String[] args) throws FileNotFoundException {

		// Intro statements
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		// get file name
		System.out.println("Enter a filename:");
		Scanner keyboard = new Scanner(System.in);
		String userFileName = keyboard.nextLine();
		// Intro statements
		System.out.println(
				"There are sixteen colors from a file: \n1 black\n2 white\n3 gray \n4 silver\n5 maroon\n6 red \n7 purple \n8 fuschia\n9 green\n"
						+ "10 lime\n11 olive\n12 yellow\n13 navy\n14 blue\n15 teal\n16 aqua\n");
		// set up limiter and points for 3 rounds
		int gameCounter = 1;
		int points = 0;
		while (gameCounter <= 3) {
			System.out.println("Round " + gameCounter + "\n");
			// set up random number
			Random rand = new Random();
			final int randNum = rand.nextInt(1, 17);
			// prepare file to be read
			File fileName = new File(userFileName);
			Scanner fileReader = new Scanner(fileName);
			// get color associated with generated random number
			String colorHolder = "";
			for (int i = 0; i < randNum; i++) {
				if (fileReader.hasNext()) {
					fileReader.next(); // skip number in list
					colorHolder = fileReader.next();
				}
			}
			// compare guess with generated color
			System.out.println("I am thinking of a color.\nIs it one of the colors above?\nEnter your guess:");
			String guess = keyboard.next();
			if (guess.equals(colorHolder)) {
				System.out.println("\nI was thinking of " + colorHolder + "\n");
				gameCounter += 1;
				points += 1;
			} else {
				System.out.println("\nI was thinking of " + colorHolder + "\n");
				gameCounter += 1;
			}
		}
		// ending statements
		System.out.println("Game Over\n\nYou guessed " + points + " out of 3 correctly");
		keyboard.nextLine();// consume enter
		System.out.println("Enter your name:");
		String name = keyboard.nextLine();
		System.out.println("Describe yourself:");
		String describe = keyboard.nextLine();
		System.out.println("Due Date:");
		String dueDate = keyboard.nextLine();
		System.out.println("User name:");
		String userName = keyboard.nextLine();
		System.out.println("UserDescription");
		String userDesc = keyboard.nextLine();
		System.out.println("Date:");
		String date = keyboard.nextLine();
	}
}