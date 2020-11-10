package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.SimulationDataModelFactory;

import javax.jws.WebService;

/**
 * Implementation of the use cleaner web service.
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IUseCleaner")
public class UseCleaner implements IUseCleaner {

    /**
     * Uses the cleaner from at a persons current location.
     *
     * @param personId The ID of the person to clean
     * @return the current state of the data model
     */
    @Override
    public SimulationDataModel useCleaner(int personId) {
        System.out.println("Adding Person: " + personId);
        SimulationDataModel model = SimulationDataModelFactory.getModel();
        model.useCleaner(personId);
        return model;
    }
}
