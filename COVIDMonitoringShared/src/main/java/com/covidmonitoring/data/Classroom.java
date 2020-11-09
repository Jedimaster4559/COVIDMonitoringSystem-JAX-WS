package com.covidmonitoring.data;

import java.lang.reflect.Array;
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
        newClass.addTile(new Cleaner(1, LocationType.ENTRANCE));
        newClass.addTile(new Tile(2, LocationType.AISLE));
        newClass.addTile(new Cleaner(3, LocationType.DESK));
        newClass.addTile(new Tile(4, LocationType.AISLE));
        newClass.addTile(new Cleaner(5, LocationType.DESK));
        newClass.addTile(new Cleaner(6, LocationType.DESK));
        newClass.addTile(new Tile(7, LocationType.AISLE));
        newClass.addTile(new Cleaner(8, LocationType.DESK));
        newClass.addTile(new Tile(9, LocationType.AISLE));
        newClass.addTile(new Cleaner(10, LocationType.DESK));
        newClass.addTile(new Cleaner(11, LocationType.DESK));
        newClass.addTile(new Tile(12, LocationType.AISLE));
        return newClass;
    }

    /**
     * Gets the tile with the given ID
     * @param tileId The ID of the tile to get
     * @return The Tile Object itself
     */
    public Tile getTileById(int tileId){
        Tile found = null;

        for(Tile tile : tiles) {
            if(tile.getId() == tileId){
                found = tile;
                break;
            }
        }

        return found;
    }

    /**
     * Gets the person with the given ID
     * @param personId the ID of the person to get
     * @return The Person Object itself
     */
    public Person getPersonById(int personId){
        Person found = null;

        for(Person person : occupants) {
            if(person.getId() == personId){
                found = person;
                break;
            }
        }

        return found;
    }

    /**
     * Gets the classroom ID
     * @return The classroom's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets an array with the list of the people's IDs who are in the classroom
     * @return The array with the list of people's IDs who are in the classroom
     */
    public int[] getOccupantIds() {
        int peopleInTile[] = new int[occupants.size()];
        int count = 0;
        for(Person person : occupants) {
            peopleInTile[count] = (person.getId());
        }

        return peopleInTile;

    }
}