/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple “substitution cipher” where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		
		for(int i = 0; i < plainText.length(); i++) 
		{
			if(plainText.charAt(i)< LOWER_RANGE || plainText.charAt(i)>UPPER_RANGE) {//are these inclusive
				return false;
			}
		}
		return true;
		
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		//checks bounds
		if(!isStringInBounds(plainText)) {
			return "The selected string is not in bounds, Try again.";
		}
		String encryptedString = "";
		int charCount = 0;
		for(int i = 0; i<plainText.length(); i++) {
			charCount = (int)plainText.charAt(i) + key;	//should add both nums 
			while(charCount>95) {
				charCount -= 64; //keeps nums in bounds
			}
			encryptedString += (char)charCount;	//adds to string
		}
		return encryptedString; 
		
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr)
	{
		
		//sets bellasoStr to length of plaintext for comparison
			
		String bellasoExtend = bellasoStr;//will this copy the string
		while(plainText.length()>bellasoExtend.length()) {
			bellasoExtend += bellasoStr; //should keep adding bellasoStr until condition is broken, making bellasoStr long enough
		}
		//tests if input text is in bounds
		if(!isStringInBounds(plainText)) {
			return "The selected string is not in bounds, Try again.";
		}
		//each character gets replaced by char+newchar - RANGE if greater than 95 
		
		String encryptedString = "";
		int charCount = 0;
		for(int i = 0; i<plainText.length(); i++) {
			
			charCount = (int)plainText.charAt(i) + (int)bellasoExtend.charAt(i); //should add both chars 
			while(charCount>95) { //gets new char
				charCount -= 64;
			}
			encryptedString += (char)charCount; //should add char to string 
		}
		
		return encryptedString.toUpperCase(); 
		
	
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		//checks bounds
				if(!isStringInBounds(encryptedText)) {
					return "The selected string is not in bounds, Try again.";
				}
				String encryptedString = "";
				int charCount = 0;
				for(int i = 0; i<encryptedText.length(); i++) {
					charCount = (int)encryptedText.charAt(i) - key;	//should add both nums 
					while(charCount<32) {
						charCount += 64; //keeps nums in bounds
					}
					encryptedString += (char)charCount;	//adds to string
				}
				return encryptedString; 
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		
		
		//sets bellasoStr to length of plaintext for comparison
			
		String bellasoExtend = bellasoStr;//will this copy the string
		while(encryptedText.length()>bellasoExtend.length()) {
			bellasoExtend += bellasoStr; //should keep adding bellasoStr until condition is broken, making bellasoStr long enough
		}
		//tests if input text is in bounds
		if(!isStringInBounds(encryptedText)) {
			return "The selected string is not in bounds, Try again.";
		}
		//each character gets replaced by char+newchar - RANGE if greater than 95 
		
		String encryptedString = "";
		int charCount = 0;
		for(int i = 0; i<encryptedText.length(); i++) {
			
			charCount = (int)encryptedText.charAt(i) - (int)bellasoExtend.charAt(i); //should add both chars 
			while(charCount<32) { //gets new char
				charCount += 64;
			}
			encryptedString += (char)charCount; //should add char to string 
		}
		
		return encryptedString.toUpperCase(); 
		
	}
}