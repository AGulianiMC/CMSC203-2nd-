import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoManagerTestStudent {
	

	
	@Before
	public void setUp() throws Exception {
		 
		
	}

	@After
	public void tearDown() throws Exception {
		
		 
	}

	@Test
	public void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("HELLOTHERE"));
		assertFalse(CryptoManager.isStringInBounds("HELloTheRE"));
		assertTrue(CryptoManager.isStringInBounds("WHATISUPPP"));
		assertFalse(CryptoManager.isStringInBounds("whOiSThiS"));
	}

	@Test
	public void testCaesarEncryption() {
		assertEquals("LIPPSXLIVI",CryptoManager.caesarEncryption("HELLOTHERE",4));
		assertEquals("[LEXWYT",CryptoManager.caesarEncryption("WHATSUP",4));
		assertEquals("&E))(E",CryptoManager.caesarEncryption("!@$$#@",5));
		assertEquals("]NUG,)$F",CryptoManager.caesarEncryption("WHOA&#^@",6));
	}

	@Test
	public void testBellasoEncryption() {
		assertEquals("\"\"(PN%\\V'$\\", CryptoManager.bellasoEncryption("YOTHEREGUYS", "ISTHISWORKING"));
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoEncryption("mynamjeff", "WHATSUPP"));
		assertEquals("KP-S'KNU4", CryptoManager.bellasoEncryption("H!@#THERE", "CompSCI"));
	}

	@Test
	public void testCaesarDecryption() {
		assertEquals("O@NODIB<B<DI", CryptoManager.caesarDecryption("TESTINGAGAIN", 5));
		assertEquals("6L4202/KK", CryptoManager.caesarDecryption("*@(&$&#??", 500));
		assertEquals("ZKYZ0)F[/*", CryptoManager.caesarDecryption("TEST*#@U)$", 250));
		assertEquals("^^^^Y", CryptoManager.caesarDecryption("((((#", 10));
	}

	@Test
	public void testBellasoDecryption() {
		assertEquals("C36.=D1", CryptoManager.bellasoDecryption("EEEEEEE", "BROWHAT"));
		assertEquals(">C5HD06J8", CryptoManager.bellasoDecryption("WHATSGOOD", "YELLOW"));
		assertEquals("'W3SW!]![ 8E52Q@E>P", CryptoManager.bellasoDecryption("*&@#*$&*$#GREETINGS", "COMPSCIII"));
	}

}
