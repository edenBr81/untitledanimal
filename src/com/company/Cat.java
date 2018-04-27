package com.company;

public class Cat extends Animal {

    public Cat(){
        System.out.println("cats are beautiful");
    }
@Override
    public String eat(){
        return"A cats eats";
}
@Override
    public String sleep(){
        return"A cat sleeps";
}
public String purr()
    {
        return" A cat purr";
    }


}
