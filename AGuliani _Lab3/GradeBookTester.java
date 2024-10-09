import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook book1;
	GradeBook book2;
	
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		book1.addScore(85);
		book1.addScore(78);
		book1.addScore(92);
		
		book2.addScore(87);
		book2.addScore(67);
		book2.addScore(48);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(true, book1.toString());
		assertTrue(true, book2.toString());
		assertEquals(book1.toString(),"85.0 78.0 92.0 0.0 0.0 ");
		assertEquals(book2.toString(),"87.0 67.0 48.0 0.0 0.0 ");

	}

	@Test
	void testSum() {
		assertEquals(book1.sum(), 255);
		assertEquals(book2.sum(), 202);
	}

	@Test
	void testMinimum() {
		assertEquals(book1.minimum(),48);
		assertEquals(book2.minimum(),78);
	}

	@Test
	void testFinalScore() {
		assertEquals(book1.finalScore(), 177.0);
		assertEquals(book2.finalScore(), 154.0);
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		assertEquals(book1.toString(),"85.0 78.0 92.0 0.0 0.0 ");
		assertEquals(book2.toString(),"87.0 67.0 48.0 0.0 0.0 ");
		//compare with addScore
	}

}
