package com.squadro.touricity.message.types.data.enumeration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum StatusCode {
    SIGNIN_SUCCESSFUL(100, "Signin successfull!"),
    SIGNIN_REJECT(101, "Username/password did not match!"),
    SIGNUP_SUCCESSFUL(102, "Signup successfull!"),
    SIGNUP_REJECT(103, "Signup could not be done!"),
    SIGNUP_REJECT_USERNAME(104, "Username allready exists!"),
    SIGNUP_REJECT_PASSWORD(105, "Password should be in the format!"),
    SIGNOUT_SUCCESSFULL(106, "User successfully signed out!"),
    REJECT_COOKIE_NOTSET(107, "Cookie could not be set!");

    StatusCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return status + " " + message;
    }
}