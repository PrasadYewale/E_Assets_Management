package main.com.sentinels.exceptions;

public class AssetNotFoundException extends Exception{
    public AssetNotFoundException(String message){
        super(message);
    }
}
