package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.SimulationDataModelFactory;

import javax.jws.WebService;

/**
 * Implementation of the add person web service.
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IAddPerson")
public class AddPerson implements IAddPerson {

    /**
     * Adds a new person to the data model
     * @param classroomId The classroom to add the person to
     * @param personId The id of the person to add.
     * @param isTeacher If the person should be a teacher or not.
     * @return The state of the data model
     */
    @Override
    public SimulationDataModel addPerson(int classroomId, int personId, boolean isTeacher){
        SimulationDataModel model = SimulationDataModelFactory.getModel();
        model.addPerson(classroomId, personId, isTeacher);
        return model;
    }
}
