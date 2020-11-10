package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.SimulationDataModelFactory;

import javax.jws.WebService;

/**
 * Implementation of the move person web service
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IMovePerson")
public class MovePerson implements IMovePerson {

    /**
     * Moves a person to a new tile.
     *
     * @param personId The person to move
     * @param destinationId The location to move them to
     * @param wipe Whether or not to wipe the current tile as they leave.
     * @return The complete state of the data model.
     */
    @Override
    public SimulationDataModel movePerson(int personId, int destinationId, boolean wipe){
        System.out.println("Adding Person: " + personId + " " + destinationId + " " + wipe);
        SimulationDataModel model = SimulationDataModelFactory.getModel();
        model.movePerson(personId, destinationId, wipe);
        return model;
    }
}
