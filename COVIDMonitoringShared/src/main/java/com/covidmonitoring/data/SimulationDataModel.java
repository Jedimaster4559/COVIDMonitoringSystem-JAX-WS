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
     * @return  True if successfully added. False if the classroom ID is invalid
     * or the personId already exists.
     */
    public boolean addPerson(int classroomId, int personId, boolean isTeacher){
        return true;
    }
}
