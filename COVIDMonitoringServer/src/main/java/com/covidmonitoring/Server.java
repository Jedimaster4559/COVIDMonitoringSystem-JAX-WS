package com.covidmonitoring;

import javax.xml.ws.Endpoint;

import com.covidmonitoring.msgs.AddPerson;
import com.covidmonitoring.msgs.HelloWorld;

/**
 * The main class for the Server application. Handles
 * the overall setup of endpoints.
 *
 * @author Nathan Solomon
 */
public class Server {
    /** Endpoint Address for the Hello World message */
    public static final String helloWorldEndpointAddress = "http://localhost:8080/hello";

    public static final String addPersonEndpointAddress = "http://localhost:8080/addPerson";

    public static void main(String[] args) {
        publishEndpoints();
    }

    /**
     * Publishes all of the endpoints
     */
    public static void publishEndpoints(){
        Endpoint.publish(helloWorldEndpointAddress, new HelloWorld());
        Endpoint.publish(addPersonEndpointAddress, new AddPerson());
    }
}
