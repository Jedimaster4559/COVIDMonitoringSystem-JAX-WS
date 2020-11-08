package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * A service endpoint interface for reseting the simulation to the initial state.
 *
 * @author Nathan Solomon
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IResetSimulation {

    /**
     * Resets the datamodel being used by the server back to it's
     * initial state.
     *
     * @return The new data model.
     */
    @WebMethod SimulationDataModel resetSimulation();

}
