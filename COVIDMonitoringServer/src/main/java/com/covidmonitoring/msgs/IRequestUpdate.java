package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * An endpoint interface for requesting an update to the data model
 *
 * @author Nathan Solomon
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IRequestUpdate {

    /**
     * Gets the latest version of the data model.
     *
     * @return The current state of the data model
     */
    @WebMethod SimulationDataModel requestUpdate();
}
