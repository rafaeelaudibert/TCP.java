/*
 * Created on 20 Jul 2014 19:49:42 
 */
package br.ufrgs.inf.tcp.junit.senha;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ingrid
 * 
 */
public class DefaultPasswordValidator implements PasswordValidator {

	private static final int MIN_SIZE = 6;
	private static final int MAX_SIZE = 10;
	private static final char QUESTION_MARK = '?';
	private static final Set<String> DICTIONARY;

	static {
		DICTIONARY = new HashSet<>();
		DICTIONARY.add("cabelo");
		DICTIONARY.add("amerelo");
		DICTIONARY.add("laranja");
		DICTIONARY.add("trabalho");
	}

	@Override
	public boolean isValid(String password) {
		
		if (password == null || password.length() == 0)
			return false;
		
		if (!isValidSize(password)) {
			return false;
		}
		if (!isValidFirstChar(password.charAt(0))) {
			return false;
		}
		if (!isValidRemainingChar(password.substring(1))) {
			return false;
		}
		if (isDictionaryWord(password)) {
			return false;
		}
		return true;
	}

	private boolean isValidSize(String password) {
		return password.length() >= MIN_SIZE && password.length() <= MAX_SIZE;
	}

	private boolean isValidFirstChar(char firstChar) {
		return Character.isLetterOrDigit(firstChar)
				|| QUESTION_MARK == firstChar;
	}

	private boolean isValidRemainingChar(String remainingChars) {
		for (int i = 0; i < remainingChars.length(); i++) {
			if (Character.isISOControl(remainingChars.charAt(i)))
				return false;
		}
		return true;
	}

	private boolean isDictionaryWord(String password) {
		return DefaultPasswordValidator.DICTIONARY.contains(password.toLowerCase());
	}

}
