package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebService;

/**
 * Implementation of the Update Person web service
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IUpdatePerson")
public class UpdatePerson implements IUpdatePerson {
    @Override
    public SimulationDataModel updatePerson(int personId, boolean mask, boolean faceshield) {
        // TODO: implementation
        return null;
    }
}
