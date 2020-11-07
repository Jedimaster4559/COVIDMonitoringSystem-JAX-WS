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
    @WebMethod String helloWorld(String name);
}
