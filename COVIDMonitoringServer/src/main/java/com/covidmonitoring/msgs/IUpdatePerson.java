package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * A Service endpoint for updating a person's state regarding masks and shields.
 *
 * @author Nathan Solomon
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IUpdatePerson {
    @WebMethod SimulationDataModel updatePerson(int personId, boolean mask, boolean faceshield);

}
