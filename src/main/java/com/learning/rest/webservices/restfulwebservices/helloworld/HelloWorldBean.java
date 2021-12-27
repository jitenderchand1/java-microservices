package com.learning.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

    private final String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        System.out.println("chand");
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
