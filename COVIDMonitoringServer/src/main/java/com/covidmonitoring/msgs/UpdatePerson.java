package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.SimulationDataModelFactory;

import javax.jws.WebService;

/**
 * Implementation of the Update Person web service
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IUpdatePerson")
public class UpdatePerson implements IUpdatePerson {

    /**
     * Updates the state of a person regarding the PPE that they are wearing.
     * @param personId The ID of the person to update
     * @param mask if they are wearing a facemask
     * @param faceshield if they are wearing a faceshield
     * @return The complete state of the datamodel
     */
    @Override
    public SimulationDataModel updatePerson(int personId, boolean mask, boolean faceshield) {
        System.out.println("Update Person: " + personId + " " + mask + " " + faceshield);
        SimulationDataModel model = SimulationDataModelFactory.getModel();
        model.updatePerson(personId, mask, faceshield);
        return model;
    }
}
