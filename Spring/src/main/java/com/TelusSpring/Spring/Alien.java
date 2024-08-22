package com.TelusSpring.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
//1. Application.java
public class Alien {
    public  void code(){
        System.out.println("its vj class");
    }
    }
 */


/*
//2.
@Component
public class Alien {
    public  void code(){
        System.out.println("its vj class");
    }
    }
 */

//3.@AutoWiring
@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}















