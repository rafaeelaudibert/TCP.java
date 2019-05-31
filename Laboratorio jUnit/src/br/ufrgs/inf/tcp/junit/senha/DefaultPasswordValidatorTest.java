/*
 * Created on 20 Jul 2014 20:14:22 
 */
package br.ufrgs.inf.tcp.junit.senha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ingrid
 *
 */
public class DefaultPasswordValidatorTest {
	
	DefaultPasswordValidator passwordValidator;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		passwordValidator = new DefaultPasswordValidator();
	}
	
	/* TESTS WHICH DETECT ERRORS */
	
	// Assert passwords with the minimum characters are VALIDATED
	@Test
	public void testIsValidMinChar() {
		assertTrue(passwordValidator.isValid("abcdef")); // Length in the minimum password length size
	}
	
	// Assert passwords with the maximum characters are VALIDATED
	@Test
	public void testIsValidMaxChar() {
		assertTrue(passwordValidator.isValid("abcdefghij")); // Length in the maximum password length size
	}
	
	// Assert passwords which are in the dictionary (with a different case) are NOT VALIDATED
	@Test
	public void testIsValidInDictionaryDifferentCase() {
		assertFalse(passwordValidator.isValid("Laranja"));
		assertFalse(passwordValidator.isValid("CaBeLo"));
	}
	
	// Assert that null passwords are NOT VALIDATED and do not throw an error
	@Test
	public void testIsValidNullPassword() {
		assertFalse(passwordValidator.isValid(null));
	}
	
	
		
	// TESTS WHICH RUN CORRECTLY
	
	// Test valid passwords
	@Test
	public void testIsValidGeneral() {
		assertTrue(passwordValidator.isValid("?as8kdP"));
		assertTrue(passwordValidator.isValid("Jx5_dP92"));
	}
	
	// Assert passwords with less than the minimum characters are NOT VALIDATED
	@Test
	public void testIsValidLessChar() {
		assertFalse(passwordValidator.isValid("abcde")); // Length less than 6
	}
	
	// Assert passwords with more than the maximum characters are NOT VALIDATED
	@Test
	public void testIsValidMoreChar() {
		assertFalse(passwordValidator.isValid("abcdefghijk")); // Length more than 10
	}
	
	// Assert passwords which start with an alphabetic character are VALIDATED
	@Test
	public void testIsValidStartsWithAlphabetic() {
		assertTrue(passwordValidator.isValid("abcdefg"));
	}
	
	// Assert passwords which start with a numeric character are VALIDATED
	@Test
	public void testIsValidNumeric() {
		assertTrue(passwordValidator.isValid("1bcdefg"));
	}
	
	// Assert passwords which start with a question mark character are VALIDATED
	@Test
	public void testIsValidInterrogation() {
		assertTrue(passwordValidator.isValid("?bcdefg"));
	}
	
	// Assert passwords which start with some other character other than alphanumeric or question mark are NOT VALIDATED
	@Test
	public void testIsValidNotAllowedSymbols() {
		assertFalse(passwordValidator.isValid("[bcdefg"));
	}
	
	// Assert passwords without control symbols are VALIDATED
	@Test
	public void testIsValidWithoutControlSymbols() {
		assertTrue(passwordValidator.isValid("abcdefg"));
	}
	
	// Assert passwords with control symbols are NOT VALIDATED
	@Test
	public void testIsValidWithControlSymbols() {
		assertFalse(passwordValidator.isValid("abc\rdefg"));
		assertFalse(passwordValidator.isValid("\nbcdefg"));
		assertFalse(passwordValidator.isValid("abc\u0000dgh"));
	}
	
	// Assert passwords which are not in the dictionary are VALIDATED
	@Test
	public void testIsValidNotInDictionary() {
		assertTrue(passwordValidator.isValid("abcdefg"));
		assertTrue(passwordValidator.isValid("dictionary"));
	}
	
	// Assert passwords which are in the dictionary are NOT VALIDATED
	@Test
	public void testIsValidInDictionary() {
		assertFalse(passwordValidator.isValid("laranja"));
		assertFalse(passwordValidator.isValid("cabelo"));
	}
	
}
