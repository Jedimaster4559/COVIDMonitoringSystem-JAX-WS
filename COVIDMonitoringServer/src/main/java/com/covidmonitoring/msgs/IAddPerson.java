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
    @WebMethod SimulationDataModel addPerson(int classroomId, int personId, boolean isTeacher);
}
