/*
 * Class: CMSC203 
 * Instructor: Dr. Monshi
 * Description: (Give a brief description for each Class)
 * Due: 10/06/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ankit G
*/
import java.util.Scanner;
//note other imports and maybe also other files

public class PatientDriverApp {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Patient patient1 = new Patient();
		System.out.println("Patient Info:");
		System.out.println("Name:(first, middle, last on separate lines)");
		patient1.setfName(keyboard.nextLine());
		patient1.setmName(keyboard.nextLine());
		patient1.setlName(keyboard.nextLine());
		System.out.println("Address(+ City, State, Zip together):");
		patient1.setAdrs(keyboard.nextLine());
		System.out.println("EmergencyContact(Name, then num on separate lines):");
		patient1.setEmName(keyboard.nextLine());
		patient1.setEmNum(keyboard.nextLine());
		
		Procedure pro1 = new Procedure();
		System.out.println("\nProcedure:");
		pro1.setProName(keyboard.nextLine());
		System.out.println("ProcedureDate:");
		pro1.setProDate(keyboard.nextLine());
		System.out.println("Practitioner:");
		pro1.setPracName(keyboard.nextLine());
		System.out.println("Charge:");
		pro1.setCost(keyboard.nextDouble());
		
		
		Procedure pro2 = new Procedure("checkup", "01/25");//constructor2
		System.out.println("\nProcedure:");
		System.out.println(pro2.getProName());
		System.out.println("ProcedureDate:");
		System.out.println(pro2.getProDate());
		System.out.println("Practitioner:");
		keyboard.nextLine();
		pro2.setPracName(keyboard.nextLine());
		System.out.println("Charge:");
		pro2.setCost(keyboard.nextDouble());
		//prompt for info then input into
	
		
		Procedure pro3 = new Procedure("surgery", "12/43","jack",1000.20 );//constructor3
		System.out.println("\nProcedure:");
		System.out.println(pro3.getProName());
		System.out.println("ProcedureDate:");
		System.out.println(pro3.getProDate());
		System.out.println("Practitioner:");
		System.out.println(pro3.getPracName());
		System.out.println("Charge:");
		System.out.println(pro3.getCost());
		//prompt for info then input into test1.(method)
		//change object name accordingly
		
		//do my variables have to be private/////////////
		System.out.println("\n");
		calculateTotalCharges(pro1, pro2, pro3);
		System.out.println("\n");
		System.out.println("Student Name: Ankit Guliani");
		System.out.println("MC#: M21089734");
		System.out.println("Due Date: 10/04/2024");
		
	}
	public static void displayPatient(Patient a) {
		System.out.println(a.toString());
	}
	//should these be static void, are they returning or just displaying//////
	public static void displayProcedure(Procedure a) {
		System.out.println(a.toString());
	}
	public static void calculateTotalCharges(Procedure a, Procedure b, Procedure c) {
		System.out.println(a.getCost() + b.getCost()+c.getCost());
	}
}
//is this the only one that takes a main method??
//issues with scope and getting/setting variables
//and changing object names
//can call other methods here in main, but not other way around