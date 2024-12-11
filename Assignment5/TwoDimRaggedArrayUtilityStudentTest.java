import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityStudentTest {
	private double[][] dataSet2 = {{21,22,23},{24,25},{26,27,28,29}};
	private double[][] dataSet3 = {{31,32,33},{34,35},{36,37,38,39}};
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testGetAverage() {
		assertEquals(225.0,TwoDimRaggedArrayUtility.getAverage(dataSet2,1),.001);
		assertEquals(34.8888,TwoDimRaggedArrayUtility.getAverage(dataSet3,1),.001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(27.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet2,1),.001);
		assertEquals(38.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet3,1),.001);
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(225.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet2,1),.001);
		assertEquals(314.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet3,1),.001);
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(27.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2,1),.001);
		assertEquals(37.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3,1),.001);
	}

	@Test
	void testGetHighestColumnIndex() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestColumnIndex(dataSet2,1),.001);
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestColumnIndex(dataSet3,1),.001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet2,1),.001);
		assertEquals(9.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet3,1),.001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2,1),.001);
		assertEquals(2,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3,1),.001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(1,TwoDimRaggedArrayUtility.getLowestInArray(dataSet2,1));
		assertEquals(1,TwoDimRaggedArrayUtility.getLowestInArray(dataSet3,1));
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(21.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2,1),.001);
		assertEquals(31.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3,1),.001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2,1),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet3,1),.001);
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(21.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet2,1),.001);
		assertEquals(31.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet3,1),.001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2,1),.001);
		assertEquals(0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3,1),.001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(66,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,1),.001);
		assertEquals(96,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,1),.001);
	}

	@Test
	void testGetTotal() {
		assertEquals(225.0,TwoDimRaggedArrayUtility.getTotal(dataSet2,1),.001);
		assertEquals(314.0,TwoDimRaggedArrayUtility.getTotal(dataSet3,1),.001);
	}

	@Test
	void testReadFile() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.readFile(dataSet2,1),.001);
		assertEquals(9.0,TwoDimRaggedArrayUtility.readFile(dataSet3,1),.001);
	}

	@Test
	void testWriteToFile() {
		assertEquals(TwoDimRaggedArrayUtility.writeToFile(dataSet2,1),.001);
		assertEquals(TwoDimRaggedArrayUtility.writeToFile(dataSet3,1),.001);
	}

}
