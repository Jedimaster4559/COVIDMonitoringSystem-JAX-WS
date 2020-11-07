package com.covidmonitoring.msgs;

import javax.jws.WebService;

/**
 * Basic service implementation using JAX-WS
 *
 * @author letzkorn
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IHelloWorld")
public class HelloWorld implements IHelloWorld {

    @Override
    public String helloWorld(String name) {
        System.out.println(name + " says hello");
        return "Hello World " + name;
    }
}
