import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
	Property propertyTwo, propertyThree;
	@BeforeEach
	void setUp() throws Exception {
		propertyTwo = new Property("AProp", "ACity", 2000.00, "TD Bank");
		propertyThree = new Property(propertyTwo);
	}

	@AfterEach
	void tearDown() throws Exception {
		PropertyTwo=null;
		PropertyThree=null;
	}

	

	@Test
	void testGetCity() {
		assertEquals("ACity", propertyTwo.getCity());
	}

	@Test
	void testGetOwner() {
		assertEquals("TD Bank", propertyTwo.getCity());
	}

	@Test
	void testGetPlot() {
		assertEquals("0,0,0,0", propertyTwo.getPlot());
	}

	@Test
	void testGetPropertyName() {
		assertEquals("AProp", propertyTwo.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(2000.00, propertyTwo.getRentAmount());
	}

	@Test
	void testToString() {
		assertEquals("AProp, ACity, TD Bank, 2000.00",propertyTwo.getCity());
	}

}
