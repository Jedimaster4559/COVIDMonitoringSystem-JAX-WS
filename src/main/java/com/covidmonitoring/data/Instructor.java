package com.covidmonitoring.data;

/**
 * An instructor person. The instructor is the same as a person
 * except for the requirement of also wearing a Face Shield.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
public class Instructor extends Person {
    private boolean shieldErrorAlarm;

    /**
     * Overloads main constructor and defaults alarms to off.
     * @param id The ID of this person
     * @param location The location tile of this person.
     */
    public Instructor(int id, Tile location) {
        super(id, location);
        shieldErrorAlarm = false;
    }

    /**
     * Sets the instructor to be incorrectly wearing their face mask.
     */
    public void wearShieldIncorrectly(){
        this.shieldErrorAlarm = true;
    }

    /**
     * Sets the instructor to be correctly wearing their face mask.
     */
    public void wearShieldCorrectly() {
        this.shieldErrorAlarm = false;
    }
}