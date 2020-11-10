package com.covidmonitoring;

import javax.xml.ws.Endpoint;

import com.covidmonitoring.msgs.*;
import com.covidmonitoring.ws.Debug;
import com.covidmonitoring.ws.EndpointProperties;

/**
 * The main class for the Server application. Handles
 * the overall setup of endpoints.
 *
 * @author Nathan Solomon
 */
public class Server {

    public static void main(String[] args) {
//        Debug.enableAll(true);
        publishEndpoints();
    }

    /**
     * Publishes all of the endpoints for our web services
     */
    public static void publishEndpoints(){
        Endpoint.publish(EndpointProperties.addPersonEndpointAddress, new AddPerson());
        Endpoint.publish(EndpointProperties.helloWorldEndpointAddress, new HelloWorld());
        Endpoint.publish(EndpointProperties.movePersonEndpointAddress, new MovePerson());
        Endpoint.publish(EndpointProperties.requestUpdateEndpointAddress, new RequestUpdate());
        Endpoint.publish(EndpointProperties.resetSimulationEndpointAddress, new ResetSimulation());
        Endpoint.publish(EndpointProperties.updatePersonEndpointAddress, new UpdatePerson());
        Endpoint.publish(EndpointProperties.useCleanerEndpointAddress, new UseCleaner());
    }
}
