package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.SimulationDataModelFactory;

import javax.jws.WebService;

/**
 * Implementation of the move person web service.
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IRequestUpdate")
public class RequestUpdate implements IRequestUpdate {

    /**
     * Gets the latest version of the data model.
     *
     * @return The current state of the data model
     */
    @Override
    public SimulationDataModel requestUpdate() {
        return SimulationDataModelFactory.getModel();
    }
}
