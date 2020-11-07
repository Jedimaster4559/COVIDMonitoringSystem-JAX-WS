# Message API Documentation
This document outlines the overall implementation of messages and how they can be accessed.

# API Usage
Implementing calls to these events can be done with the following code blocks (reference documentation for inidividual events for things in {brackets}:

```java
// Initial Setup (only has to be done once)
URL wsdlLocationURL = new URL("{wsdlLocation}");
QName serviceName = new QName("{namespaceURI}", "{localPort}");
Service service = Service.create(wsdleLocationURL, serviceName);
{Interface} servicePort = service.getPort({Interface}.class);

// Call to event (can be called as often as you want)
servicePort.methodName(args);
```

Example (Hello World):
```java
// Configure Hello World
URL helloWorldWsdlLocation = new URL("http://localhost:8080/hello?wsdl");
QName helloWorldServiceName = new QName("http://msgs.covidmonitoring.com/", "HelloWorldService");
Service helloService = Service.create(helloWorldWsdlLocation, helloWorldServiceName);
IHelloWorld helloPort = helloService.getPort(IHelloWorld.class);

// Call procedure and print the response
String response = helloPort.helloWorld(args[0]);
System.out.println(response);
```

# Event types
[Add Person](#add-person)
[Hello World](#hello-world)
[Move Person](#move-person)
[Request Data Update (Request Update)](#request-data-update-request-update)
[Reset Simulation](#reset-simulation)
[Update Person State (Update Person)](#update-person-state-update-person)
[Use Cleaner](#use-cleaner)

## Add Person
This event adds a new person to the data model. They are by default added to the entrance tile (Tile 1).

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/addPerson?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: AddPersonService
Interface: com.covidmonitoring.msgs.IAddPerson
```

Declaration:
```java
@WebMethod SimulationDataModel addPerson(int classroomId, int personId, boolean isTeacher);
```

## Hello World
This responds with a basic hello world. This can be used as a helpful sanity check.

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/hello?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: HelloWorldService
Interface: com.covidmonitoring.msgs.IHelloWorld
```

Declaration:
```java
@WebMethod String helloWorld(String name);
```

## Move Person
This event moves a person from one location to another. The `personId` should move the person with that id from their current location to the tile of the `destinationId`

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/movePerson?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: MovePersonService
Interface: com.covidmonitoring.msgs.IMovePerson
```

Declaration:
```java
@WebMethod SimulationDataModel movePerson(int personId, int destinationId, boolean wipe);
```

## Request Data Update (Request Update)
This event is designed to request and update of the data model.

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/requestUpdate?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: RequestUpdateService
Interface: com.covidmonitoring.msgs.IRequestUpdate
```

Declaration:
```java
@WebMethod SimulationDataModel requestUpdate();
```

## Reset Simulation
The simulation will begin as soon as the server is launched. If you would like to reset the entire datamodel to it's initial state, use this event.

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/resetSimulation?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: ResetSimulationService
Interface: com.covidmonitoring.msgs.IResetSimulation
```

Declaration:
```java
@WebMethod SimulationDataModel resetSimulation();
```

## Update Person State (Update Person)
This event is designed to update the state of a person. This can be used to control if a person is wearing a face mask or face shield. The `personId` should update the person to be wearing or not wearing the `mask` and `faceshield`.

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/updatePerson?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: UpdatePersonService
Interface: com.covidmonitoring.msgs.IUpdatePerson
```

Declaration:
```java
@WebMethod SimulationDataModel updatePerson(int personId, boolean mask, boolean faceshield);
```

## Use Cleaner
This event is designed to indicate that a person of a specific `personId` has used the cleaner at their current location. This applies to both lysol and hand sanitizer.

Endpoint Configuration:
```
wsdlLocation: http://localhost:8080/useCleaner?wsdl
namespaceURI: http://msgs.covidmonitoring.com/
localPort: UpdatePersonService
Interface: com.covidmonitoring.msgs.IUseCleaner
```

Declaration:
```java
@WebMethod SimulationDataModel useCleaner(int personId);
```