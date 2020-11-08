/**
 * Basic service implementation using JAX-WS
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.sql.SQLOutput;
import java.util.Scanner;

import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.msgs.IAddPerson;
import com.covidmonitoring.msgs.IHelloWorld;

public class Client {
    static void printCommands() {
        System.out.println("--------------------Commands--------------------");
        System.out.println("Start Classes: start");
        System.out.println("End Classes: end");
        System.out.println("Switch room: switch [classroom number]");
        System.out.println("Please enter a command: ");
    }

    public static void main(String[] args) throws MalformedURLException {
        // Configure Hello World
        URL helloWorldWsdlLocation = new URL("http://localhost:8080/hello?wsdl");
        QName helloWorldServiceName = new QName("http://msgs.covidmonitoring.com/", "HelloWorldService");
        Service helloService = Service.create(helloWorldWsdlLocation, helloWorldServiceName);
        IHelloWorld helloPort = helloService.getPort(IHelloWorld.class);

        // Configure Add Person
        URL addPersonWsdlLocation = new URL("http://localhost:8080/addPerson?wsdl");
        QName addPersonServiceName = new QName("http://msgs.covidmonitoring.com/", "AddPersonService");
        Service addPersonService = Service.create(addPersonWsdlLocation, addPersonServiceName);
        IAddPerson addPersonPort = addPersonService.getPort(IAddPerson.class);

        String response = helloPort.helloWorld(args[0]);
        System.out.println(response);

        //SimulationDataModel model = addPersonPort.addPerson(1, 1, false);

        boolean simulationRunning = true;
        System.out.println("Welcome to the COVID-19 Monitoring Simulation: JAX-WS Version!\n");

        while (simulationRunning == true) {
            printCommands();

        }
    }

}
