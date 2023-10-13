package com.epam.mjc.stage0;

public class Dog extends Animal{
    public Dog (){
        super("brown", 4, true);
    }

    @Override
    public String getDescription(){
        String result = super.getDescription() + " Moreover, it barks all the time.";
        return result;
    }
}
