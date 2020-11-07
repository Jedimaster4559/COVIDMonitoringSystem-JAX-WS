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
}
