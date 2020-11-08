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
    @WebMethod SimulationDataModel useCleaner(int personId);
}
