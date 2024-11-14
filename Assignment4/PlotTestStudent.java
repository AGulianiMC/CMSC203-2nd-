import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
	private Plot plot2, plot3,plot4;
	@BeforeEach
	void setUp() throws Exception {
		plot2 = new Plot(1, 1, 1, 1);
		plot3 = new Plot(2, 2 ,2, 2);
		plot4= new Plot(plot3);
	}

	@AfterEach
	void tearDown() throws Exception {
		plot2=plot3=null;
	}


	@Test
	void testEncompasses() {
		
		assertTrue(plot3.encompasses(plot2));
	}

	@Test
	void testGetDepth() {
		plot2.setDepth(2);
		assertEquals(2,plot2.getDepth(3));	
		plot3.setDepth(3);
		assertEquals(3,plot3.getDepth(3));
	}

	@Test
	void testGetWidth() {
		plot2.setWidth(2);
		assertEquals(2,plot2.getWidth(2));	
		plot3.setWidth(3);
		assertEquals(3,plot3.getWidth(3));
	}

	@Test
	void testGetX() {
		plot2.setX(2);
		assertEquals(2,plot2.getX(2));	
		plot3.setX(3);
		assertEquals(3,plot3.getX(3));
	}

	@Test
	void testGetY() {
		plot2.setY(2);
		assertEquals(2,plot2.getY(2));	
		plot3.setY(3);
		assertEquals(3,plot3.getY(3));
	}

	@Test
	void testOverlaps() {
		assertTrue(plot2.overlaps(plot3));
	}

	@Test
	void testSetDepth() {
		plot2.setDepth(2);
		assertEquals(2,plot2.getDepth(3));	
		plot3.setDepth(3);
		assertEquals(3,plot3.getDepth(3));
		
		}

	@Test
	void testSetWidth() {
		plot2.setWidth(2);
		assertEquals(2,plot2.getWidth(2));	
		plot3.setWidth(3);
		assertEquals(3,plot3.getWidth(3));
	}

	@Test
	void testSetX() {
		plot2.setX(2);
		assertEquals(2,plot2.getX(2));	
		plot3.setX(3);
		assertEquals(3,plot3.getX(3));
	}

	@Test
	void testSetY() {
		plot2.setY(2);
		assertEquals(2,plot2.getY(2));	
		plot3.setY(3);
		assertEquals(3,plot3.getY(3));
	}

	@Test
	void testToString() {
		assertEquals("1,1,1,1",plot2.toString());	
		assertEquals("2,2,2,2",plot3.toString());	
	}

}
