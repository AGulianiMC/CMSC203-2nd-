import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	//public TwoDimRaggedArrayUtility(){}
	public static double getAverage(double[][] data) {
		double count = 0;
		for(int i = 0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				count += data[i][j];
			}
		}//fix average
		return count;
	}
	public static double getColumnTotal(double[][] data, int col) {
		double count = 0;
			for(int i=0;i<data.length;i++) {
				count += data[i][col];
			}
		
		return count;
	}
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for(int i = 0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				if(data[i][j]>highest) {
					highest = data[i][j];
				}
			}
		}
		return highest;
	}
	public static double getHighestInColumn(double[][] data, int col) {
		double highest = data[0][0];
		for(int i=0;i<data.length;i++) {
			if(data[i][col]>highest) {
				highest = data[i][col];
			}
		}
	
	return highest;
	}
	public static int getHighestColumnIndex(double[][] data, int col) {
		double highest = data[0][0];
		int index = 0;
		for(int i=0;i<data.length;i++) {
			if(data[i][col]>highest) {
				highest = data[i][col];
				index = i;
			}
		}
	
	return index;
	}
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[0][0];
		for(int i=0;i<data[row].length;i++) {
			if(data[row][i]>highest) {
				highest = data[row][i];
			}
		}
	
	return highest;
	}
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highest = data[0][0];
		int index = 0;
		for(int i=0;i<data[row].length;i++) {
			if(data[row][i]>highest) {
				highest = data[row][i];
				index = i;
			}
		}
	
	return index;
	}
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for(int i = 0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				if(data[i][j]<lowest) {
					lowest = data[i][j];
				}
			}
		}
		return lowest;
	}
	public static double getLowestInColumn(double[][] data, int col) {
		double lowest = data[0][0];
		for(int i=0;i<data.length;i++) {
			if(data[i][col]<lowest) {
				lowest = data[i][col];
			}
		}
	
	return lowest;
	}
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = data[0][0];
		int index = 0;
		for(int i=0;i<data.length;i++) {
			if(data[i][col]<lowest) {
				lowest = data[i][col];
				index = i;
			}
		}
	
	return index;
	}
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[0][0];
		for(int i=0;i<data[row].length;i++) {
			if(data[row][i]<lowest) {
				lowest = data[row][i];
			}
		}
	
	return lowest;
	}
	public static int getLowestInRowIndex(double[][] data, int row) { 
	double lowest = data[0][0];
	int index = 0;
	for(int i=0;i<data[row].length;i++) {
		if(data[row][i]<lowest) {
			lowest = data[row][i];
			index = i;
		}
	}

return index;
}
	public static double getRowTotal(double[][] data, int row) {
		double count = 0;
		for(int i=0;i<data[row].length;i++) {
			count += data[row][i];
		}
	
	return count;
	}
	public static double getTotal(double[][] data) {
		double count = 0;
		for(int i = 0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				count += data[i][j];
			}
		}
		return count;
	}
	public static double[][] readFile(File inputfile) throws FileNotFoundException{
		double[][] newArray = new double[10][10];
		Scanner reader = new Scanner(inputfile);
	
		for(int i = 0; i<reader.nextLine().length();i++) {
			for(int j = 0; j<reader.nextLine().length();j++) {
				newArray[i][j]= reader.nextDouble();
			}
		}
		reader.close();
		return newArray;
	}
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
		try(PrintWriter writer = new PrintWriter(outputFile);){
		for(int i = 0; i<data.length;i++) {
			for(int j = 0; j<data[i].length;j++) {
				writer.print(data[i][j]);
			}
			writer.println();
		}
		}
	}
	
}
