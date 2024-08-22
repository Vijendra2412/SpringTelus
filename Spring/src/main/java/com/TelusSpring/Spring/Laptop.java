package com.TelusSpring.Spring;

import org.springframework.stereotype.Component;

//3.@AutoWiring
@Component
public class Laptop {
    public void compile(){
        System.out.println("Compiling..");
    }
}
