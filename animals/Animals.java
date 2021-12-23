package com.company.animals;

import com.company.animals.AnimalThread.*;

public class Animals {
    public static void main(String[] args){
        rabbit rabbit = new rabbit("Кролик");
        turtle turtle = new turtle("Черепаха");
        rabbit.start();
        turtle.start();
    }
}
