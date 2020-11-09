/**
 * Basic service implementation using JAX-WS
 *
 * @author jblankenship
 */
package com.covidmonitoring;

import com.covidmonitoring.data.*;
import com.covidmonitoring.msgs.IUseCleaner;
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

                    else if (inputArray[0] == "lysol" || inputArray[0] == "sanitizer") {
                        int personId = Integer.parseInt(inputArray[1]);
                        config.getUseCleanerPort().useCleaner(personId);
                    }

                    else {
                        System.out.println("You didn't enter a valid command. Please try again.");
                    }

                    break;

                case 3:
                    if (inputArray[0] == "add") {
                        int classroomId = currentClass.getId();
                        int personId = Integer.parseInt(inputArray[1]);
                        boolean isTeacher;
                        if (inputArray[2] == "teacher") {
                            isTeacher = true;
                        }
                        else {
                            isTeacher = false;
                        }
                        config.getAddPersonPort().addPerson(classroomId, personId, isTeacher);
                    }

                    else if (inputArray[0] == "mask") {
                        int personId = Integer.parseInt(inputArray[2]);
                        boolean shield;
                        Person person = currentClass.getPersonById(personId);
                        if (person.getPersonStatus() == "Student") {
                            shield = false;
                        }
                        else {
                            Instructor instructor = (Instructor) currentClass.getPersonById(personId);
                            char shieldChar = instructor.getIsShieldWearing();
                            if (shieldChar == 'y') {
                                shield = true;
                            }
                            else {
                                shield = false;
                            }
                        }
                        if (inputArray[1] == "on") {
                            config.getUpdatePersonPort().updatePerson(personId, true, shield);
                        }
                        else if (inputArray[1] == "off") {
                            config.getUpdatePersonPort().updatePerson(personId, false, shield);
                        }
                        else {
                            System.out.println("You didn't enter a valid command. Please try again.");
                            break;
                        }
                    }

                    else if (inputArray[0] == "shield") {
                        int personId = Integer.parseInt(inputArray[2]);
                        Person person = currentClass.getPersonById(personId);
                        boolean mask;
                        if (person.getIsMaskWearing() == 'y') {
                            mask = true;
                        }
                        else {
                            mask = false;
                        }
                        if (inputArray[1] == "on") {
                            config.getUpdatePersonPort().updatePerson(personId, mask, true);
                        }
                        else if (inputArray[1] == "off") {
                            config.getUpdatePersonPort().updatePerson(personId, mask, false);
                        }
                        else {
                            System.out.println("You didn't enter a valid command. Please try again.");
                            break;
                        }
                    }

                    else {
                        System.out.println("You didn't enter a valid command. Please try again.");
                    }

                    break;

                case 4:
                    if (inputArray[0] == "move") {
                        int personId = Integer.parseInt(inputArray[1]);
                        int tileId = Integer.parseInt(inputArray[2]);
                        boolean wipe;
                        if (inputArray[3] == "y") {
                            wipe = true;
                        }
                        else if (inputArray[3] == "n") {
                            wipe = false;
                        }
                        else {
                            System.out.println("You didn't enter a valid command. Please try again.");
                            break;
                        }
                        config.getMovePersonPort().movePerson(personId, tileId, wipe);
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

                int[] people = currentClass.getOccupantIds();
                for(int i = 0; i < people.length; i++) {
                    int personId = people[i];
                    Person person = currentClass.getPersonById(personId);
                    String personType = person.getPersonStatus();
                    char mask = person.getIsMaskWearing();
                    char shield = 'a';
                    if (personType == "Teacher") {
                        Instructor instructor = (Instructor) currentClass.getPersonById(personId);
                        shield = instructor.getIsShieldWearing();
                    }

                    Output.printPerson(personId, personType, mask, shield);
                }
            }
        }
        System.out.println("See you next time!");
    }
}
