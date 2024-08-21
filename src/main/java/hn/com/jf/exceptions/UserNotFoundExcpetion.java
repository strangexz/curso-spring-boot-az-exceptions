package hn.com.jf.exceptions;

public class UserNotFoundExcpetion extends RuntimeException {
	public UserNotFoundExcpetion(String message) {
		super(message);
	}
}
