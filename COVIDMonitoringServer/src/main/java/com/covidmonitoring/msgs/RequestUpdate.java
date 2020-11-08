package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebService;

/**
 * Implementation of the move person web service.
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IRequestUpdate")
public class RequestUpdate implements IRequestUpdate {

    @Override
    public SimulationDataModel requestUpdate() {
        // TODO: Implementation
        return null;
    }
}
