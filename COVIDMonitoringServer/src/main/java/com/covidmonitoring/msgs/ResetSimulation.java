package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebService;

/**
 * Implementation of the Reset Simulation web service
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IResetSimulation")
public class ResetSimulation implements IResetSimulation {

    @Override
    public SimulationDataModel resetSimulation() {
        // TODO: Implementation
        return null;
    }
}
