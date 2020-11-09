/**
 * Basic service implementation using JAX-WS
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import java.net.MalformedURLException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        JaxWsConfig config = new JaxWsConfig();
        System.out.println(config.getHelloPort().helloWorld(args[0]));

        //SimulationDataModel model = addPersonPort.addPerson(1, 1, false);

        boolean simulationRunning = true;
        System.out.println("Welcome to the COVID-19 Monitoring Simulation: JAX-WS Version!\n");

        while (simulationRunning == true) {
            Output.printCommands();

            /*Output.printRoom(1, 'y', 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0);

            simulationRunning = false;

            Output.printPerson(1, "student", 'y', 'n');
             */
            simulationRunning = false;

        }
    }

}
