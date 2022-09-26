package com.sim.app.restapi.exceptiontest;

import com.sim.app.restapi.CommonResult;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException() {
        super();
    }
}
