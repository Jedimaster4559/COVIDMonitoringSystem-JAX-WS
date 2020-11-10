package com.covidmonitoring.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * A physical location inside the classroom.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Tile {
    protected int numPeople;
    private int id;
    public boolean tooManyPeopleAlarm;
    protected LocationType type;

    public Tile(){

    }

    /**
     * Creates a new rectangle with no one in it.
     * @param id The ID of this tile.
     * @param type The type of tile.
     */
    public Tile(int id, LocationType type){
        this.id = id;
        this.type = type;
        this.tooManyPeopleAlarm = false;
        this.numPeople = 0;
    }

    /**
     * Adds a person to this tile.
     */
    public void addPerson(){
        numPeople++;
        checkPeople();
    }

    /**
     * Checks to see if there are too many people on this tile.
     */
    public void checkPeople(){
        if(numPeople > 1) {
            tooManyPeopleAlarm = true;
        } else {
            tooManyPeopleAlarm = false;
        }
    }

    /**
     * Removes one person from the room.
     */
    public void leave(){
        numPeople--;
        checkPeople();
    }

    /**
     * Gets the ID of this tile.
     * @return The ID of this tile.
     */
    public int getId(){
        return id;
    }

    /**
     * Gets the number of people in this tile
     * @return The number of people in this tile
     */
    public int getNumPeople() {
        return numPeople;
    }
}