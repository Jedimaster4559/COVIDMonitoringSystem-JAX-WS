package com.covidmonitoring.data;

import java.util.ArrayList;

/**
 * Describes a full classroom including the spaces within the classroom
 * as well as the current occupants of the classroom.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
public class Classroom {
    private ArrayList<Tile> tiles;
    private ArrayList<Person> occupants;
    private int id;

    /**
     * Constructor
     * @param id The id of the classroom. This value should be unique.
     */
    public Classroom(int id){
        this.id = id;
        tiles = new ArrayList<Tile>();
        occupants = new ArrayList<Person>();
    }

    /**
     * Adds a rectangle to the classroom.
     * @param rect The rectangle to add.
     */
    public void addRectangle(Tile rect){
        tiles.add(rect);
    }

    /**
     * Adds a person to the classroom.
     * @param p The people object to add
     */
    public void addPerson(Person p){
        occupants.add(p);
    }
}