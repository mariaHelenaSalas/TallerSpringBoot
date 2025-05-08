package com.electroapp.electro_app.infrastructure.Utils.Exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException() {
        
    }
   

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }



}
