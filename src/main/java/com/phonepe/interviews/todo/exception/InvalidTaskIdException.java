package com.phonepe.interviews.todo.exception;

public class InvalidTaskIdException extends RuntimeException {

    public InvalidTaskIdException(String message) {
        super(message);
    }
}
