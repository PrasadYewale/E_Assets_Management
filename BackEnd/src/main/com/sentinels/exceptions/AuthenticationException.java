package main.com.sentinels.exceptions;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}
