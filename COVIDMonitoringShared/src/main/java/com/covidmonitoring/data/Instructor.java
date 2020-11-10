package com.covidmonitoring.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * An instructor person. The instructor is the same as a person
 * except for the requirement of also wearing a Face Shield.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Instructor extends Person {
    private boolean shieldErrorAlarm;

    public Instructor(){
        super();
    }

    /**
     * Overloads main constructor and defaults alarms to off.
     * @param id The ID of this person
     * @param location The location tile of this person.
     */
    public Instructor(int id, Tile location, boolean isTeacher) {
        super(id, location, isTeacher);
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

    /**
     * Gets the person's shield status
     * @return 'y' if the person is wearing their shield correctly or 'n' if the person is wearing their shield incorrectly
     */
    public char getIsShieldWearing() {
        if (shieldErrorAlarm == false) {
            return 'y';
        }
        else {
            return 'n';
        }
    }
}