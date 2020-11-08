package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * An endpoint interface for moving a person.
 *
 * @author Nathan Solomon
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IMovePerson {

    /**
     * Moves a person to a new tile.
     *
     * @param personId The person to move
     * @param destinationId The location to move them to
     * @param wipe Whether or not to wipe the current tile as they leave.
     * @return The complete state of the data model.
     */
    @WebMethod SimulationDataModel movePerson(int personId, int destinationId, boolean wipe);

}
