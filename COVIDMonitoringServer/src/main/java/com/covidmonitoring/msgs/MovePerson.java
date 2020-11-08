package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebService;

/**
 * Implementation of the move person web service
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IMovePerson")
public class MovePerson implements IMovePerson {

    @Override
    public SimulationDataModel movePerson(int personId, int destinationId, boolean wipe){
        // TODO: Implementation
        return null;
    }
}
