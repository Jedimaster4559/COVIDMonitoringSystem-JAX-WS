package com.covidmonitoring;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.covidmonitoring.msgs.IHelloWorld;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        URL helloWorldWsdlLocation = new URL("http://localhost:8080/hello?wsdl");
        QName helloWorldServiceName = new QName("http://msgs.covidmonitoring.com/", "HelloWorldService");
        Service service = Service.create(helloWorldWsdlLocation, helloWorldServiceName);
        IHelloWorld hello = service.getPort(IHelloWorld.class);

        String response = hello.helloWorld(args[0]);
        System.out.println(response);
    }

}
