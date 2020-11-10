package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.SimulationDataModelFactory;

import javax.jws.WebService;

/**
 * Implementation of the Reset Simulation web service
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IResetSimulation")
public class ResetSimulation implements IResetSimulation {

    /**
     * Resets the datamodel being used by the server back to it's
     * initial state.
     *
     * @return The new data model.
     */
    @Override
    public SimulationDataModel resetSimulation() {
        System.out.println("Resetting Simulation");
        return SimulationDataModelFactory.reset();
    }
}
