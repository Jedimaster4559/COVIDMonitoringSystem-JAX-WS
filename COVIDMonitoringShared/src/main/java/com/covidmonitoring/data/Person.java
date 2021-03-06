package com.covidmonitoring.data;

/**
 * Describes a person and if they are properly wearing a face mask.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
public class Person {
    private Tile location;
    private int id;
    private boolean maskErrorAlarm;

    /**
     * Creates a new Person.
     * @param id The unique ID of the person.
     * @param location The location tile of the person.
     */
    public Person(int id, Tile location){
        this.id = id;
        this.location = location;
        this.maskErrorAlarm = false;
        location.addPerson();
    }

    /**
     * Sets this person to be wearing their face mask incorrectly
     */
    public void wearMaskIncorrectly() {
        this.maskErrorAlarm = true;
    }

    /**
     * Sets this person to be wearing their face mask correctly.
     */
    public void wearMaskCorrectly() {
        this.maskErrorAlarm = false;
    }

    /**
     * Gets the ID of this person
     * @return The ID of this person
     */
    public int getId(){
        return id;
    }

    /**
     * Gets the tile this person is on
     * @return The Tile object this person is on.
     */
    public Tile getTile() {
        return location;
    }

    public void moveTile(Tile destination) {
        location.leave();
        destination.addPerson();
        location = destination;
    }
}