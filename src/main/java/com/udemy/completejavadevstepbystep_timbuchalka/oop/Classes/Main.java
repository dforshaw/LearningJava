package com.udemy.completejavadevstepbystep_timbuchalka.oop.Classes;

// Example to demonstrate encapsulation
// Fields within Car class are private
// Methods to access fields (getters/setters) are public

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
//        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }
}
