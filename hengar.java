package com.company;

public class Hangar {

    public static void main(String[] args) {

        Car cooper = new Car("Mini Cooper", 12345);
        System.out.println(cooper.doStuff());

        Boat titanic = new Boat("Titanic", 54321);
        System.out.println(titanic.doStuff());
    }
}
