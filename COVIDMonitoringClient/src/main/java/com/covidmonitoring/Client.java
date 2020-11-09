/**
 * Basic service implementation using JAX-WS
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import com.covidmonitoring.data.Classroom;
import com.covidmonitoring.data.Cleaner;
import com.covidmonitoring.data.SimulationDataModel;
import com.covidmonitoring.data.Tile;
import com.sun.javaws.IconUtil;

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
            Classroom currentClass = null;

            switch (inputSize) {
                case 1:
                    if (userInput == "start") {
                        config.getResetSimulationPort().resetSimulation();
                        System.out.println("Classes have started!");
                    }
                    else if (userInput == "end") {
                        config.getResetSimulationPort().resetSimulation();
                        System.out.println("Your classrooms will be reset!");
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
                            currentClass = model.getClassroombyId(1);
                        }
                        else if (inputArray[1] == "2") {
                            currentClass = model.getClassroombyId(2);
                        }
                        else if (inputArray[1] == "3") {
                            currentClass = model.getClassroombyId(3);
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

            if (simulationRunning == true) {
                Cleaner tile1 = (Cleaner) currentClass.getTileById(1);
                Tile tile2 = currentClass.getTileById(2);
                Cleaner tile3 = (Cleaner) currentClass.getTileById(3);
                Tile tile4 = currentClass.getTileById(4);
                Cleaner tile5 = (Cleaner) currentClass.getTileById(5);
                Cleaner tile6 = (Cleaner) currentClass.getTileById(6);
                Tile tile7 = currentClass.getTileById(7);
                Cleaner tile8 = (Cleaner) currentClass.getTileById(8);
                Tile tile9 = currentClass.getTileById(9);
                Cleaner tile10 = (Cleaner) currentClass.getTileById(10);
                Cleaner tile11 = (Cleaner) currentClass.getTileById(11);
                Tile tile12 = currentClass.getTileById(12);

                int classnum = currentClass.getId();
                char tile1Sanitizer = 'a';
                if (tile1.getCleanCount() == 0) {
                    tile1Sanitizer = 'n';
                }
                else if (tile1.getCleanCount() == 1) {
                    tile1Sanitizer = 'y';
                }
                int tile1people = tile1.getNumPeople();
                int tile2people = tile2.getNumPeople();
                int tile3lysol = tile3.getCleanCount();
                int tile3people = tile3.getNumPeople();
                int tile4people = tile4.getNumPeople();
                int tile5lysol = tile5.getCleanCount();
                int tile5people = tile5.getNumPeople();
                int tile6lysol = tile6.getCleanCount();
                int tile6people = tile6.getNumPeople();
                int tile7people = tile7.getNumPeople();
                int tile8lysol = tile8.getCleanCount();
                int tile8people = tile8.getNumPeople();
                int tile9people = tile9.getNumPeople();
                int tile10lysol = tile10.getCleanCount();
                int tile10people = tile10.getNumPeople();
                int tile11lysol = tile11.getCleanCount();
                int tile11people = tile11.getNumPeople();
                int tile12people = tile12.getNumPeople();

                Output.printRoom(classnum, tile1Sanitizer, tile1people, tile2people, tile3lysol, tile3people,
                        tile4people, tile5lysol, tile5people, tile6lysol, tile6people, tile7people, tile8lysol,
                        tile8people, tile9people, tile10lysol, tile10people, tile11lysol, tile11people, tile12people);

                // Print out all the people in a classroom
                Output.printPerson(1, "student", 'y', 'n');
            }
        }
        System.out.println("See you next time!");
    }
}
