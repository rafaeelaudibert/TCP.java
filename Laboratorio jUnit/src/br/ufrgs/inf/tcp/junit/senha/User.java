/*
 * Created on 20 Jul 2014 19:48:15 
 */
package br.ufrgs.inf.tcp.junit.senha;

/**
 * @author ingrid
 * 
 */
public class User {

	private String password;
	private PasswordValidator passwordValidator;
	private String username;

	public User() {
		this.passwordValidator = new DefaultPasswordValidator();
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) throws InvalidPasswordException {
		if (passwordValidator.isValid(password))
			this.password = password;
		else
			throw new InvalidPasswordException();
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
