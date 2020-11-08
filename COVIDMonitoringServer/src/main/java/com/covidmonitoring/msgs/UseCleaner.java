package com.covidmonitoring.msgs;

import com.covidmonitoring.data.SimulationDataModel;

import javax.jws.WebService;

/**
 * Implementation of the use cleaner web service.
 *
 * @author Nathan Solomon
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IUseCleaner")
public class UseCleaner implements IUseCleaner {
    @Override
    public SimulationDataModel useCleaner(int personId) {
        // TODO: implementation
        return null;
    }
}
