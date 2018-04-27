package com.company;

public class Bird extends Animal{

    public Bird(){
        System.out.println("A ne bird created");
    }
    @Override
    public String eat(){
        return"a bir eats";
    }
    @Override
    public String sleep(){
        return"a bird sleeps";
    }

    public String fly(){
        return"birds flies";
    }
}
