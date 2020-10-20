package org.pixel.exception;


import java.util.List;

public class AppException extends RuntimeException{
    private List<String> errors;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

}
