package com.covidmonitoring;

import javax.jws.WebMethod;
import javax.jws.WebService;

import javax.xml.ws.soap.Addressing;

@WebService
@Addressing(required = true)
/**
 * Example Hello World for JAX-WS.
 *
 * @author letzkorn
 */
public class HelloWorld {

    /**
     * Returns Hello World to the User and prints it to
     * the console.
     *
     * @param name The name of the user
     * @return A Hello World Message
     */
    @WebMethod
    public String hello(String name) {
        System.out.println(name+ " says hello");
        return "Hello World " + name;
    }
}