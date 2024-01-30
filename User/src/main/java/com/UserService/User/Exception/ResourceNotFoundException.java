package com.UserService.User.Exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("resourse not found for the specific id");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
