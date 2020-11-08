package com.covidmonitoring.data;

/**
 * A singleton/factory for the data model that allows for getting
 * the ongoing copy of the data model.
 *
 * NOTE: calling this from the client and server will create
 * separate instances for each. Instead, objects (or serialized
 * objects) should be passed.
 *
 * @author Nathan Solomon
 */
public class SimulationDataModelFactory {
    /** The instance of the DataModel */
    private static SimulationDataModel instance = null;

    /**
     * Private constructor to prevent initialization
     * of static factory class
     */
    private SimulationDataModelFactory(){

    }

    /**
     * Gets and instance of the data model
     *
     * @return the instance of the data model
     */
    public static SimulationDataModel getModel(){
        if(instance == null){
            instance = new SimulationDataModel();
        }

        return instance;
    }

    /**
     * Resets the data model to a new empty data model
     *
     * @return the new data model.
     */
    public static SimulationDataModel reset(){
        instance = new SimulationDataModel();
        return instance;
    }
}
