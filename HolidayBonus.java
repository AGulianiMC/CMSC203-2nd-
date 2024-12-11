
public class HolidayBonus {
	static final double storeMax= 5000;
	static final double storeMin= 1000;
	static final double storeReg= 2000;
	//TwoDimRaggedArrayUtility newUtility = new TwoDimRaggedArrayUtility();
	
	//public HolidayBonus() {}
	public static double[] calculateHolidayBonus(double[][] data) {
		int rows = data.length;
		int columns = 0;
		double tempHolder = 0;
		double[] newArray = new double[rows];
		
		for(int i =0; i< data.length;i++) {
			if(data[i].length>columns) {
				columns =data[i].length; 
			}
		}
		for(int i = 0;i<columns;i++) {
			double max = TwoDimRaggedArrayUtility.getHighestInColumn(data, columns);
			double min = TwoDimRaggedArrayUtility.getLowestInColumn(data, columns);
			for(int j= 0; j<rows;j++) {
				if(i<data[j].length) {
					tempHolder = data[i][j];
					if(tempHolder == max) {
						newArray[j] += storeMax;
					}
					else if(tempHolder == min){
						newArray[j] += storeMin;
					}
					else {
						newArray[j] += storeReg;
					}
				}
			}
		}
		return newArray;
	}
	public static double calculateTotalHolidayBonus(double[][] data) {
		double total=0;
		double[] fullTotal = calculateHolidayBonus(data);
		for(int i = 0; i<data.length;i++) {
		total+=fullTotal[i];
		}
		return total;
	}
}
