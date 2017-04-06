package com.pluralsight.javafundamentals.javalanguage_jimwilson.classesinheritanceinterfaces.classesmethodsbasics;

public class Flight {
    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public void add1Passenger() {
        if (passengers < seats)
            passengers += 1;
        else
            handleTooMany();
    }

    private void handleTooMany() {
        System.out.println("Too many");
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }


    public static void main(String[] args) {

        Flight nycToSf;
        nycToSf = new Flight();
        Flight slcToDallas = new Flight();

        slcToDallas.add1Passenger();



        // classes are reference types

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.add1Passenger();
        System.out.println(flight2.passengers); // separate objects

        flight2 = flight1;
        System.out.println(flight2.passengers); // refer to same object

        flight1.add1Passenger();
        flight1.add1Passenger();
        System.out.println(flight2.passengers); // refer to same object



        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        //add passengers to both flights

        Flight lax3 = null;
        if (lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);

        if (lax3 != null)
            System.out.println("Flights combined");


    }
}
