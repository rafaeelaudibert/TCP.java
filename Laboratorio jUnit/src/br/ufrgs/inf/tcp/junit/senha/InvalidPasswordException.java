/*
 * Created on 20 Jul 2014 19:50:26 
 */
package br.ufrgs.inf.tcp.junit.senha;

/**
 * @author ingrid
 *
 */
public class InvalidPasswordException extends Exception {

	private static final long serialVersionUID = 7751958046412769725L;
	
	public InvalidPasswordException() {
		
	}
	
	public InvalidPasswordException(String message) {
		super(message);		
	}

}
