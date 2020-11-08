package com.covidmonitoring.msgs;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * A basic hello world to demonstrate how to make
 * a service endpoint interface
 *
 * @author letzkorn
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface IHelloWorld {

    /**
     * Basic hello world method.
     *
     * @param name The name to use for the hello world.
     * @return An output Hello World message
     */
    @WebMethod String helloWorld(String name);
}
