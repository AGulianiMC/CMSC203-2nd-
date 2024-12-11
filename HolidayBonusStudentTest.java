import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusStudentTest {

	private double[][] dataSet2 = { { 3, 4, 5 }, {6, 7 }, { 8, 9, 10 } };
	private double[][] dataSet3 = { { 11, 12, 13 }, { 14, 15 }, { 16, 17, 18 } };
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}



	@Test
	void testCalculateHolidayBonus() {
		double[] result = HolidayBonus.calculateHolidayBonus(dataSet2);
		assertEquals(3000.0, result[0], .001);
		assertEquals(4000.0, result[1], .001);
		assertEquals(15000.0, result[2], .001);
		
		double[] result1 = HolidayBonus.calculateHolidayBonus(dataSet3);
		assertEquals(3000.0, result[0], .001);
		assertEquals(4000.0, result[1], .001);
		assertEquals(15000.0, result[2], .001);
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		fail("Not yet implemented");
	}

}
