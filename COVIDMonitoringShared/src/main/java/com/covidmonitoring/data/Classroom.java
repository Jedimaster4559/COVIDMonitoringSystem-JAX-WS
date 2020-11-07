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
    public void addTile(Tile rect){
        tiles.add(rect);
    }

    /**
     * Adds a person to the classroom.
     * @param p The people object to add
     */
    public void addPerson(Person p){
        occupants.add(p);
    }

    /**
     * Generates a new classroom using the default configuration
     * of space.
     *
     * @param id  The id to start the classroom with.
     * @return  A fully configured (but empty) classroom.
     */
    public static Classroom generate(int id) {
        Classroom newClass = new Classroom(id);
        newClass.addTile(new Tile(1, LocationType.ENTRANCE));
        newClass.addTile(new Tile(2, LocationType.AISLE));
        newClass.addTile(new Tile(3, LocationType.DESK));
        newClass.addTile(new Tile(4, LocationType.AISLE));
        newClass.addTile(new Tile(5, LocationType.DESK));
        newClass.addTile(new Tile(6, LocationType.DESK));
        newClass.addTile(new Tile(7, LocationType.AISLE));
        newClass.addTile(new Tile(8, LocationType.DESK));
        newClass.addTile(new Tile(9, LocationType.AISLE));
        newClass.addTile(new Tile(10, LocationType.DESK));
        newClass.addTile(new Tile(11, LocationType.DESK));
        newClass.addTile(new Tile(12, LocationType.AISLE));
        return newClass;
    }
}