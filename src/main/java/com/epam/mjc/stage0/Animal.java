package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String fur = "no";
        if (hasFur) {
            fur = "a";
        }

        String paw = "paw";
        if (numberOfPaws > 1) {
            paw = "paws";
        }

        String result = String.format("This animal is mostly %s. It has %s paws and %s fur.", color, paw, fur);
        return result;
    }

}
