/**
 * JAX-WS configuration statements
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import com.covidmonitoring.msgs.*;
import com.covidmonitoring.ws.EndpointProperties;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Contains all the JAX-WS service configurations
 */
public class JaxWsConfig {
    // Private variables
    private IHelloWorld helloPort = null;
    private IAddPerson addPersonPort = null;
    private IMovePerson movePersonPort = null;
    private IRequestUpdate requestUpdatePort = null;
    private IResetSimulation resetSimulationPort = null;
    private IUpdatePerson updatePersonPort = null;
    private IUseCleaner useCleanerPort = null;

    /**
     * Defines the configurations
     * @throws MalformedURLException
     */
    public JaxWsConfig() throws MalformedURLException {
        // Configure Hello World
        URL helloWorldWsdlLocation = new URL(EndpointProperties.helloWorldWsdlLocation);
        QName helloWorldServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.helloWorldLocalPort);
        Service helloService = Service.create(helloWorldWsdlLocation, helloWorldServiceName);
        helloPort = helloService.getPort(IHelloWorld.class);

        // Configure Add Person
        URL addPersonWsdlLocation = new URL(EndpointProperties.addPersonWsdlLocation);
        QName addPersonServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.addPersonLocalPort);
        Service addPersonService = Service.create(addPersonWsdlLocation, addPersonServiceName);
        addPersonPort = addPersonService.getPort(IAddPerson.class);

        // Configure Move Person
        URL movePersonWsdlLocation = new URL(EndpointProperties.movePersonWsdlLocation);
        QName movePersonServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.movePersonLocalPort);
        Service movePersonService = Service.create(movePersonWsdlLocation, movePersonServiceName);
        movePersonPort = movePersonService.getPort(IMovePerson.class);

        // Configure Request Update
        URL requestUpdateWsdlLocation = new URL(EndpointProperties.requestUpdateWsdlLocation);
        QName requestUpdateServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.requestUpdateLocalPort);
        Service requestUpdateService = Service.create(requestUpdateWsdlLocation, requestUpdateServiceName);
        requestUpdatePort = requestUpdateService.getPort(IRequestUpdate.class);

        // Configure Reset Simulation
        URL resetSimulationWsdlLocation = new URL(EndpointProperties.resetSimulationWsdlLocation);
        QName resetSimulationServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.resetSimulationLocalPort);
        Service resetSimulationService = Service.create(resetSimulationWsdlLocation, resetSimulationServiceName);
        resetSimulationPort = resetSimulationService.getPort(IResetSimulation.class);

        // Configure Update Person
        URL updatePersonWsdlLocation = new URL(EndpointProperties.updatePersonWsdlLocation);
        QName updatePersonServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.updatePersonLocalPort);
        Service updatePersonService = Service.create(updatePersonWsdlLocation, updatePersonServiceName);
        updatePersonPort = updatePersonService.getPort(IUpdatePerson.class);

        // Configure Use Cleaner
        URL useCleanerWsdlLocation = new URL(EndpointProperties.useCleanerWsdlLocation);
        QName useCleanerServiceName = new QName(EndpointProperties.namespaceURI, EndpointProperties.useCleanerLocalPort);
        Service useCleanerService = Service.create(useCleanerWsdlLocation, useCleanerServiceName);
        useCleanerPort = useCleanerService.getPort(IUseCleaner.class);
    }

    /**
     * Returns helloPort
     * @return The helloWorld web service variable
     */
    public IHelloWorld getHelloPort() {
        return helloPort;
    }

    /**
     * Returns addPersonPort
     * @return The addPerson web service variable
     */
    public IAddPerson getAddPersonPort() {
        return addPersonPort;
    }

    /**
     * Returns movePersonPort
     * @return The movePerson web service variable
     */
    public IMovePerson getMovePersonPort() {
        return movePersonPort;
    }

    /**
     * Returns requestUpdatePort
     * @return The requestUpdate web service variable
     */
    public IRequestUpdate getRequestUpdatePort() {
        return requestUpdatePort;
    }

    /**
     * Returns resetSimulationPort
     * @return The resetSimulation web service variable
     */
    public IResetSimulation getResetSimulationPort() {
        return resetSimulationPort;
    }

    /**
     * Returns updatePersonPort
     * @return The updatePerson web service variable
     */
    public IUpdatePerson getUpdatePersonPort() {
        return updatePersonPort;
    }

    /**
     * Returns useCleanerPort
     * @return The useCleaner web service variable
     */
    public IUseCleaner getUseCleanerPort() {
        return useCleanerPort;
    }
}
