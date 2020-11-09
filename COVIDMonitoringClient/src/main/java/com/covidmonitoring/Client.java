/**
 * Basic service implementation using JAX-WS
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import com.covidmonitoring.data.SimulationDataModel;

import java.net.MalformedURLException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        JaxWsConfig config = new JaxWsConfig();
        System.out.println(config.getHelloPort().helloWorld(args[0]));

        boolean simulationRunning = true;
        System.out.println("Welcome to the COVID-19 Monitoring Simulation: JAX-WS Version!\n");

        while (simulationRunning) {
            Output.printCommands();
            Scanner getInput = new Scanner(System.in);
            String userInput = getInput.nextLine();
            String[] inputArray = userInput.split(" ");
            int inputSize = inputArray.length;
            int currentClass = 0;

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
                        SimulationDataModel model = config.getRequestUpdatePort().requestUpdate();
                        if (inputArray[1] == "1") {
                            model.getClassroombyId(1);
                            currentClass = 1;
                        }
                        else if (inputArray[1] == "2") {
                            model.getClassroombyId(2);
                            currentClass = 2;
                        }
                        else if (inputArray[1] == "3") {
                            model.getClassroombyId(3);
                            currentClass = 3;
                        }
                        else {
                            System.out.println("You didn't enter a valid command. Please try again.");
                        }
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

            /*Output.printRoom(1, 'y', 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0);

            simulationRunning = false;

            Output.printPerson(1, "student", 'y', 'n');
             */

        }
        System.out.println("See you next time!");
    }
}
