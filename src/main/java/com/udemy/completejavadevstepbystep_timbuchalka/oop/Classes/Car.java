package com.udemy.completejavadevstepbystep_timbuchalka.oop.Classes;


public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {

        // example adding validation

        String validModel = model.toLowerCase();

        if(validModel.equals("carrera") || validModel.equals("commodore")) {

            this.model = model;

        } else {

            this.model = "Unknown";
        }

//        this.model = model;
    }

    public String getModel() {

        return this.model;
    }
}
