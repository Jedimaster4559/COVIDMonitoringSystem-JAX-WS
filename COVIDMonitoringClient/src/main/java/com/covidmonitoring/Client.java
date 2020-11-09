/**
 * Basic service implementation using JAX-WS
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import com.covidmonitoring.msgs.*;

import java.net.MalformedURLException;
import java.util.Scanner;



public class Client {
    public static void main(String[] args) throws MalformedURLException {
        JaxWsConfig config = new JaxWsConfig();
        System.out.println(config.getHelloPort().helloWorld(args[0]));

        boolean simulationRunning = true;
        System.out.println("Welcome to the COVID-19 Monitoring Simulation: JAX-WS Version!\n");

        while (simulationRunning == true) {
            Output.printCommands();
            Scanner getInput = new Scanner(System.in);
            String userInput = getInput.nextLine();
            String[] inputArray = userInput.split(" ");
            int inputSize = inputArray.length;

            switch (inputSize) {
                case 1:
                    if (userInput == "start") {
                        config.getResetSimulationPort().resetSimulation();
                    }

                    else if (userInput == "end") {
                        config.getResetSimulationPort().resetSimulation();
                    }

                    else if (userInput == "quit"){
                        simulationRunning = false;
                    }

                    else {
                        System.out.println("You didn't enter a valid command. Please try again.");
                    }
                    break;
                case 2:
                    if (inputArray[0] == "switch") {

                    }

                    else if (inputArray[0] == "lysol") {

                    }

                    else if (inputArray[0] == "shield") {

                    }

                    else {
                        System.out.println("You didn't enter a valid command. Please try again.");
                    }
                    break;
                case 3:
                    if (inputArray[0] == "add") {

                    }

                    else if (inputArray[0] == "move") {

                    }

                    else if (inputArray[0] == "mask") {

                    }

                    else if (inputArray[0] == "shield") {

                    }

                    else {
                        System.out.println("You didn't enter a valid command. Please try again.");
                    }
                    break;
                default:
                    System.out.println("You didn't enter a valid correctly. Please try again.");
            }

//            System.out.println("Switch room: switch [classroom number]");
              // 2
//            System.out.println("Add a person: add [person ID] ['teacher' || 'student']");
              // 3
//            System.out.println("Move a person: move [person ID] [tile ID]");
              // 3
//            System.out.println("Use lysol: lysol [person ID]");
              // 2
//            System.out.println("Use sanitizer: sanitizer [person ID]");
              // 2
//            System.out.println("Update mask usage: mask ['on' || 'off'] [person ID]");
              // 3
//            System.out.println("Update face shield usage: shield ['on' || 'off'] [person ID]");
              // 3

            /*Output.printRoom(1, 'y', 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0);

            simulationRunning = false;

            Output.printPerson(1, "student", 'y', 'n');
             */

            //simulationRunning = false;

        }

        System.out.println("See you next time!");
    }
}
