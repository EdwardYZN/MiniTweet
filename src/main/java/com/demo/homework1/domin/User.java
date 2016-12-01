package com.demo.homework1.domin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vagrant on 11/30/16.
 */
@Component
public class User {

    private String name;
    private String greeting;

    public User(){}

    public User(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String sayHi(String name, String greeting){
        return greeting + " - from " + name;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }
}
