package main.com.sentinels.exceptions;


public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}
