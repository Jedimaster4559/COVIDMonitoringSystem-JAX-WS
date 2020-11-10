package com.covidmonitoring.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Describes a person and if they are properly wearing a face mask.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private Tile location;
    private int id;
    private boolean isTeacher;
    private boolean maskErrorAlarm;

    public Person(){

    }

    /**
     * Creates a new Person.
     * @param id The unique ID of the person.
     * @param location The location tile of the person.
     */
    public Person(int id, Tile location, boolean isTeacher){
        this.id = id;
        this.location = location;
        this.isTeacher = isTeacher;
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

    /**
     * Moves the person to a new tile
     * @param destination The tile ID of the tile you want to move to
     */
    public void moveTile(Tile destination) {
        location.leave();
        destination.addPerson();
        location = destination;
    }

    /**
     * Gets the type of this person (Teacher or Student)
     * @return false if the person is a student or true if the person is a teacher
     */
    public boolean getIsTeacher() {
        if (isTeacher == false) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Gets the person's mask status
     * @return 'y' if the person is wearing their mask or 'n' if the person is not wearing their mask
     */
    public char getIsMaskWearing() {
        if (maskErrorAlarm == false) {
            return 'y';
        }
        else {
            return 'n';
        }
    }
}