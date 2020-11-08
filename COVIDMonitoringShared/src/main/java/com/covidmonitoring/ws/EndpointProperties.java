package com.covidmonitoring.ws;

/**
 * A container for the properties of
 */
public class EndpointProperties {
    public static final String addPersonEndpointAddress = "http://localhost:8080/addPerson";
    public static final String addPersonWsdlLocation = addPersonEndpointAddress + "?wsdl";
    public static final String addPersonLocalPort = "AddPersonService";
    public static final String helloWorldEndpointAddress = "http://localhost:8080/hello";
    public static final String helloWorldWsdlLocation = helloWorldEndpointAddress + "?wsdl";
    public static final String helloWorldLocalPort = "HelloWorldService";
    public static final String movePersonEndpointAddress = "http://localhost:8080/movePerson";
    public static final String movePersonWsdlLocation = movePersonEndpointAddress + "?wsdl";
    public static final String movePersonLocalPort = "MovePersonService";
    public static final String requestUpdateEndpointAddress = "http://localhost:8080/requestUpdate";
    public static final String requestUpdateWsdlLocation = requestUpdateEndpointAddress + "?wsdl";
    public static final String requestUpdateLocalPort = "RequestUpdateService";
    public static final String resetSimulationEndpointAddress = "http://localhost:8080/resetSimulation";
    public static final String resetSimulationWsdlLocation = resetSimulationEndpointAddress + "?wsdl";
    public static final String resetSimulationLocalPort = "ResetSimulationService";
    public static final String updatePersonEndpointAddress = "http://localhost:8080/updatePerson";
    public static final String updatePersonWsdlLocation = updatePersonEndpointAddress + "?wsdl";
    public static final String updatePersonLocalPort = "UpdatePersonService";
    public static final String useCleanerEndpointAddress = "http://localhost:8080/useCleaner";
    public static final String useCleanerWsdlLocation = useCleanerEndpointAddress + "?wsdl";
    public static final String useCleanerLocalPort = "UseCleanerService";

    public static final String namespaceURI = "http://msgs.covidmonitoring.com/";
}
