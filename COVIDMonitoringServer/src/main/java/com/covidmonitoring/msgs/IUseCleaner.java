package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * An endpoint interface for a person using a cleaner at their current location
 *
 * @author Nathan Solomon
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IUseCleaner {

    /**
     * Uses the cleaner from at a persons current location.
     *
     * @param personId The ID of the person to clean
     * @return the current state of the data model
     */
    @WebMethod SimulationDataModel useCleaner(int personId);
}
