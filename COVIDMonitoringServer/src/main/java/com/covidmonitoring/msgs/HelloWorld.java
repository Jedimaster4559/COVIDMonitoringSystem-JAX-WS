package com.covidmonitoring.msgs;

import javax.jws.WebService;

/**
 * Basic service implementation using JAX-WS
 *
 * @author letzkorn
 */
@WebService(endpointInterface = "com.covidmonitoring.msgs.IHelloWorld")
public class HelloWorld implements IHelloWorld {

    /**
     * Basic hello world method.
     *
     * @param name The name to use for the hello world.
     * @return An output Hello World message
     */
    @Override
    public String helloWorld(String name) {
        System.out.println(name + " says hello");
        return "Hello World " + name;
    }
}
