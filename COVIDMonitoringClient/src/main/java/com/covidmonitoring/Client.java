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
import com.covidmonitoring.msgs.IMovePerson;
import com.covidmonitoring.msgs.IRequestUpdate;
import com.covidmonitoring.msgs.IResetSimulation;
import com.covidmonitoring.msgs.IUpdatePerson;
import com.covidmonitoring.msgs.IUseCleaner;
import com.covidmonitoring.ws.EndpointProperties;
import com.covidmonitoring.Output;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        // Configure Hello World
        URL helloWorldWsdlLocation = new URL(EndpointProperties.helloWorldWsdlLocation);
        QName helloWorldServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.helloWorldLocalPort);
        Service helloService = Service.create(helloWorldWsdlLocation, helloWorldServiceName);
        IHelloWorld helloPort = helloService.getPort(IHelloWorld.class);

        // Configure Add Person
        URL addPersonWsdlLocation = new URL(EndpointProperties.addPersonWsdlLocation);
        QName addPersonServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.addPersonLocalPort);
        Service addPersonService = Service.create(addPersonWsdlLocation, addPersonServiceName);
        IAddPerson addPersonPort = addPersonService.getPort(IAddPerson.class);

        // Configure Move Person
        URL movePersonWsdlLocation = new URL(EndpointProperties.movePersonWsdlLocation);
        QName movePersonServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.movePersonLocalPort);
        Service movePersonService = Service.create(movePersonWsdlLocation, movePersonServiceName);
        IMovePerson movePersonPort = movePersonService.getPort(IMovePerson.class);

        // Configure Request Update
        URL requestUpdateWsdlLocation = new URL(EndpointProperties.requestUpdateWsdlLocation);
        QName requestUpdateServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.requestUpdateLocalPort);
        Service requestUpdateService = Service.create(requestUpdateWsdlLocation, requestUpdateServiceName);
        IRequestUpdate requestUpdatePort = requestUpdateService.getPort(IRequestUpdate.class);

        // Configure Reset Simulation
        URL resetSimulationWsdlLocation = new URL(EndpointProperties.resetSimulationWsdlLocation);
        QName resetSimulationServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.resetSimulationLocalPort);
        Service resetSimulationService = Service.create(resetSimulationWsdlLocation, resetSimulationServiceName);
        IResetSimulation resetSimulaitonPort = resetSimulationService.getPort(IResetSimulation.class);

        // Configure Update Person
        URL updatePersonWsdlLocation = new URL(EndpointProperties.updatePersonWsdlLocation);
        QName updatePersonServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.updatePersonLocalPort);
        Service updatePersonService = Service.create(updatePersonWsdlLocation, updatePersonServiceName);
        IUpdatePerson updatePersonPort = updatePersonService.getPort(IUpdatePerson.class);

        // Configure Use Cleaner
        URL useCleanerWsdlLocation = new URL(EndpointProperties.useCleanerWsdlLocation);
        QName useCleanerServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.useCleanerLocalPort);
        Service useCleanerService = Service.create(useCleanerWsdlLocation, useCleanerServiceName);
        IUseCleaner useCleanerPort = useCleanerService.getPort(IUseCleaner.class);

        String response = helloPort.helloWorld(args[0]);
        System.out.println(response);

        //SimulationDataModel model = addPersonPort.addPerson(1, 1, false);

        boolean simulationRunning = true;
        System.out.println("Welcome to the COVID-19 Monitoring Simulation: JAX-WS Version!\n");

        while (simulationRunning == true) {
            Output.printCommands();

            /*Output.printRoom(1, 'y', 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0);

            simulationRunning = false;
             */

            Output.printPerson(1, "student", 'y', 'n');
            simulationRunning = false;

        }
    }

}
