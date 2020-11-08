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

    @Override
    public SimulationDataModel addPerson(int classroomId, int personId, boolean isTeacher){
        SimulationDataModel model = SimulationDataModelFactory.getModel();
        model.addPerson(classroomId, personId, isTeacher);
        return model;
    }
}
