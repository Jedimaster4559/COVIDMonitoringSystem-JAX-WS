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

    /**
     * Updates the state of a person regarding the PPE that they are wearing.
     * @param personId The ID of the person to update
     * @param mask if they are wearing a facemask
     * @param faceshield if they are wearing a faceshield
     * @return The complete state of the datamodel
     */
    @WebMethod SimulationDataModel updatePerson(int personId, boolean mask, boolean faceshield);

}
