package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Web Service for adding a person
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface IAddPerson {

    /**
     * Adds a new person to the data model
     * @param classroomId The classroom to add the person to
     * @param personId The id of the person to add.
     * @param isTeacher If the person should be a teacher or not.
     * @return The state of the data model
     */
    @WebMethod SimulationDataModel addPerson(int classroomId, int personId, boolean isTeacher);
}
