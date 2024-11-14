import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {
	ManagementCompany newComp;
	ManagementCompany newComp2;
	ManagementCompany newComp3;
	ManagementCompany newComp4;
	Property newProp1;
	@BeforeEach
	void setUp() throws Exception {
		newComp = new ManagementCompany();
		newComp2 = new ManagementCompany("comp2","002",11);
		newComp3 = new ManagementCompany("comp3","003", 12, 1,1,1,1);
		newComp4 = new ManagementCompany(newComp3);
		newProp1 = new Property("Person", "Somewhere",1000, "OtherPerson");
		newComp.addProperty(newProp1);
		newComp2.addProperty(newProp1);
		newComp3.addProperty(newProp1);
		newComp4.addProperty(newProp1);
	}

	@AfterEach
	void tearDown() throws Exception {
		newComp = newComp2 = newComp3 = null;
	}

	
	

	
	@Test
	void testGetHighestRentProperty() {
		//all are null if programm still returning -3, else would be 1000
		assertEquals(null,newComp.getHighestRentProperty().getRentAmount());
		assertEquals(null,newComp2.getHighestRentProperty().getRentAmount());
		assertEquals(null,newComp3.getHighestRentProperty().getRentAmount());
		assertEquals(null,newComp4.getHighestRentProperty().getRentAmount());
	}

	@Test
	void testGetMgmFeePer() {
		assertEquals(newComp.getMgmFeePer(),0,0);
		assertEquals(newComp2.getMgmFeePer(),11,11);
		assertEquals(newComp3.getMgmFeePer(),12,12);
		assertEquals(newComp4.getMgmFeePer(),12,12);
	}

	@Test
	void testGetName() {
		assertEquals("",newComp.getName());
		assertEquals("comp2",newComp2.getName());
		assertEquals("comp3",newComp3.getName());
		assertEquals("comp3",newComp4.getName());
	}

	


	@Test
	void testGetPropertiesCount() {
		assertEquals(newComp.getPropertiesCount(),1,1);
		assertEquals(newComp2.getPropertiesCount(),1,1);
		assertEquals(newComp3.getPropertiesCount(),1,1);
		assertEquals(newComp4.getPropertiesCount(),1,1);
		
	}

	@Test
	void testGetTaxID() {
		assertEquals(newComp.getTaxID(),"","");
		assertEquals(newComp2.getTaxID(),"002","002");
		assertEquals(newComp3.getTaxID(),"003","003");
		assertEquals(newComp4.getTaxID(),"003","003");
	}

	@Test
	void testGetTotalRent() {
		assertEquals(newComp.getTotalRent(),0);
		assertEquals(newComp2.getTotalRent(),0);
		assertEquals(newComp3.getTotalRent(),0);
		assertEquals(newComp4.getTotalRent(),0);
	}

	@Test
	void testIsManagementFeeValid() {
		assertFalse(newComp.isManagementFeeValid());
		assertTrue(newComp2.isManagementFeeValid());
		assertTrue(newComp3.isManagementFeeValid());
		assertTrue(newComp4.isManagementFeeValid());
	}

	@Test
	void testIsPropertiesFull() {
		assertFalse(newComp.isPropertiesFull());
		assertFalse(newComp2.isPropertiesFull());
		assertFalse(newComp3.isPropertiesFull());
		assertFalse(newComp4.isPropertiesFull());
	}

	
	

}
