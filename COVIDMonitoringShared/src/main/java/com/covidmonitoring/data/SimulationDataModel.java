package com.covidmonitoring.data;

import java.util.ArrayList;

/**
 * An overall container for the datamodel for the
 * entire simulation.
 *
 * @author Nathan Solomon
 */
public class SimulationDataModel {
    private ArrayList<Classroom> classes;

    /**
     * Creates a default datamodel with 3 initially empty
     * classrooms.
     */
    public SimulationDataModel(){
        classes = new ArrayList<Classroom>();
        classes.add(Classroom.generate(1));
        classes.add(Classroom.generate(2));
        classes.add(Classroom.generate(3));
    }

    /**
     * Adds a person to the data model.
     *
     * @param classroomId  The classroom to add the person to.
     * @param personId  The id to use for the new person
     * @param isTeacher  If the person is a teacher or not.
     * @return  True if successfully added. False if the personId already exists.
     */
    public boolean addPerson(int classroomId, int personId, boolean isTeacher){
        if(getPerson(personId) != null) {
            return false;
        }

        Tile entranceTile = classes.get(classroomId - 1).getTileById(1);
        if(isTeacher) {
            classes.get(classroomId - 1).addPerson(new Instructor(personId, entranceTile, isTeacher));
        } else {
            classes.get(classroomId - 1).addPerson(new Person(personId, entranceTile, isTeacher));
        }
        return true;
    }

    /**
     * Moves a person from their current location to the destination tile. Also allows them
     * to wipe the tile as they leave it.
     *
     * @param personId The ID of the person to move
     * @param tileId The ID of the tile to move the person to
     * @param wipe If the person should wipe their current tile before leaving it
     * @return Returns if the person was successfully moved or not. Returns null if the person
     * does not exist.
     */
    public boolean movePerson(int personId, int tileId, boolean wipe){
        if(getPerson(personId) == null) {
            return false;
        }

        if(wipe) {
            useCleaner(personId);
        }

        Classroom c = getClassroomByPersonId(personId);
        Person p = getPerson(personId);
        p.moveTile(c.getTileById(tileId));

        return true;
    }

    /**
     * Updates a person's state (regarding if they are wearing the proper PPE).
     *
     * @param personId The person to update
     * @param mask If the new state is wearing a facemask or not
     * @param faceshield if the new state is wearing a faceshield or not
     * @return True the person was updated. False if the person doesn't exist.
     */
    public boolean updatePerson(int personId, boolean mask, boolean faceshield){
        Person p = getPerson(personId);

        // Ensure person exists
        if(p == null){
            return false;
        }

        // Handle Face Mask
        if(mask){
            p.wearMaskCorrectly();
        } else {
            p.wearMaskIncorrectly();
        }

        // Handle Face Shield
        if(p instanceof Instructor){
            Instructor i = (Instructor)p;
            if(faceshield){
                i.wearShieldCorrectly();
            } else {
                i.wearShieldIncorrectly();
            }
        }

        return true;
    }

    /**
     * Use the cleaner that is on a persons tile.
     *
     * @param personId The person who is cleaning.
     * @return If the cleaner was used or not. Returns false if the person does
     * not exist.
     */
    public boolean useCleaner(int personId){
        Person p = getPerson(personId);

        if(p == null){
            return false;
        }

        if(p.getTile() instanceof Cleaner){
            Cleaner c = (Cleaner)p.getTile();
            c.clean();
        }
        return true;
    }

    /**
     * Gets a person by ID from all of the classes.
     *
     * @param personId The ID of the person to get
     * @return The person object that if it was found and null if not
     */
    private Person getPerson(int personId) {
        Person found = null;

        for(Classroom c : classes) {
            if(c.getPersonById(personId) != null) {
                found = c.getPersonById(personId);
            }
        }

        return found;
    }

    /**
     * Gets the classroom that a person is by their person ID
     * @param personId The ID of the person to find.
     * @return The classroom object that the person is in. Null if the person does not exist.
     */
    private Classroom getClassroomByPersonId(int personId) {
        Classroom found = null;

        for(Classroom c : classes) {
            if(c.getPersonById(personId) != null) {
                found = c;
                break;
            }
        }

        return found;
    }

    /**
     * Gets the classroom by the classroom ID
     * @param id The ID of the classroom to find
     * @return The classroom object that the person is in. Null if the classroom does not exist
     */
    public Classroom getClassroombyId(int id) {
        Classroom found = null;

        for(Classroom c : classes) {
            if(c.getId() == id) {
                found = c;
                break;
            }
        }

        return found;

    }
}
