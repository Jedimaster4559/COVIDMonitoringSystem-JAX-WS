/**
 * Print commands for the simulation
 *
 * @author jblankenship
 */
package com.covidmonitoring;

/*
Sample Classroom Layout:
|-----------------------------------------------------------Classroom 1-----------------------------------------------------------|
|Room Entrance: Hand Sanitizer      |          |Instructor Rectangle: Desk & Lysol |Student Question Rectangle                    |
|Tile ID: 1                         |          |TileID: 3                          |TileID: 4                                     |
|Hand Sanitizer Used:               |          |# Times Lysol Used:                |People:                                       |
|People:                            |          |People:                            |                                              |
|-----------------------------------|          |-----------------------------------|----------------------------------------------|
|Student Rectangle #1: Desk & Lysol |          |Student Rectangle #2: Desk & Lysol |          |Student Rectangle #3: Desk & Lysol |
|Tile ID: 5                         |Aisle     |TileID: 6                          |          |TileID: 8                          |
|# Times Lysol Used:                |TileID: 2 |# Times Lysol Used:                |          |# Times Lysol Used:                |
|People:                            |People:   |People:                            |          |People:                            |
|-----------------------------------|          |-----------------------------------|Aisle     |-----------------------------------|
|Aisle                              |          |Student Rectangle #4: Desk & Lysol |TileID: 7 |Student Rectangle #5               |
|TileID: 9                          |          |TileID: 10                         |People:   |TileID: 11                         |
|People:                            |          |# Times Lysol Used:                |          |# Times Lysol Used:                |
|                                   |          |People:                            |          |People:                            |
|---------------------------------------------------------------------------------------------------------------------------------|
|Aisle                                                                                                                            |
|TileID: 12                                                                                                                       |
|People:                                                                                                                          |
|---------------------------------------------------------------------------------------------------------------------------------|
*/

/**
 * Prints out different information for the user
 */
public class Output {
    /**
     * Prints out the commands a user can use
     */
    static void printCommands() {
        System.out.println("------------------------------Commands------------------------------");
        System.out.println("Start Classes: start");
        System.out.println("End Classes: end");
        System.out.println("Quit Simulation: quit");
        System.out.println("Switch room: switch [classroom number]");
        System.out.println("Add a person: add [person ID] ['teacher' || 'student']");
        System.out.println("Move a person: move [person ID] [tile ID] ['y' to wipe when leaving " +
                            "|| 'n' to not wipe when leaving || 'n' if N/A]");
        System.out.println("Use lysol: lysol [person ID]");
        System.out.println("Use sanitizer: sanitizer [person ID]");
        System.out.println("Update mask usage: mask ['on' || 'off'] [person ID]");
        System.out.println("Update face shield usage: shield ['on' || 'off'] [person ID]");
        System.out.println("------------------------------Commands------------------------------\n");
        System.out.print("Please enter a command: ");
    }

    /**
     * Prints out the classroom and its contents
     * @param classnum The classroom number
     * @param tile1Sanitizer 'y' if the sanitizer has been used; 'n' if not
     * @param tile1people Number of people in tile 1
     * @param tile2people Number of people in tile 2
     * @param tile3lysol Number of times tile 3's lysol has been used
     * @param tile3people Number of people in tile 3
     * @param tile4people Number of people in tile 4
     * @param tile5lysol Number of times tile 5's lysol has been used
     * @param tile5people Number of people in tile 5
     * @param tile6lysol Number of times tile 6's lysol has been used
     * @param tile6people Number of people in tile 6
     * @param tile7people Number of people in tile 7
     * @param tile8lysol Number of times tile 8's lysol has been used
     * @param tile8people Number of people in tile 8
     * @param tile9people Number of people in tile 9
     * @param tile10lysol Number of times tile 10's lysol has been used
     * @param tile10people Number of people in tile 10
     * @param tile11lysol Number of times tile 11's lysol has been usd
     * @param tile11people Number of people in tile 11
     * @param tile12people Number of people in tile 12
     */
    static void printRoom(int classnum, char tile1Sanitizer, int tile1people, int tile2people, int tile3lysol,
                          int tile3people, int tile4people, int tile5lysol, int tile5people, int tile6lysol,
                          int tile6people, int tile7people, int tile8lysol, int tile8people, int tile9people,
                          int tile10lysol, int tile10people, int tile11lysol, int tile11people, int tile12people) {
        System.out.println("|-----------------------------------------------------------Classroom " + classnum + "-----------------------------------------------------------|");
        System.out.println("|Room Entrance: Hand Sanitizer      |          |Instructor Rectangle: Desk & Lysol |Student Question Rectangle                    |");
        System.out.println("|Tile ID: 1                         |          |TileID: 3                          |TileID: 4                                     |");
        System.out.println("|Hand Sanitizer Used:" + tile1Sanitizer + "              |          |# Times Lysol Used:" + tile3lysol + "               |People:" + tile4people + "                                      |");
        System.out.println("|People:" + tile1people + "                           |          |People:" + tile3people + "                           |                                              |");
        System.out.println("|-----------------------------------|          |-----------------------------------|----------------------------------------------|");
        System.out.println("|Student Rectangle #1: Desk & Lysol |          |Student Rectangle #2: Desk & Lysol |          |Student Rectangle #3: Desk & Lysol |");
        System.out.println("|Tile ID: 5                         |Aisle     |TileID: 6                          |          |TileID: 8                          |");
        System.out.println("|# Times Lysol Used:" + tile5lysol + "               |TileID: 2 |# Times Lysol Used:" + tile6lysol + "               |          |# Times Lysol Used:" + tile8lysol + "               |");
        System.out.println("|People:" + tile5people + "                           |People:" + tile2people + "  |People:" + tile6people + "                           |Aisle     |People:" + tile8people + "                           |");
        System.out.println("|-----------------------------------|          |-----------------------------------|TileID: 7 |-----------------------------------|");
        System.out.println("|Aisle                              |          |Student Rectangle #4: Desk & Lysol |People:" + tile7people + "  |Student Rectangle #5               |");
        System.out.println("|TileID: 9                          |          |TileID: 10                         |          |TileID: 11                         |");
        System.out.println("|People:" + tile9people + "                           |          |# Times Lysol Used:" + tile10lysol + "               |          |# Times Lysol Used:" + tile11lysol + "               |");
        System.out.println("|                                   |          |People:" + tile10people + "                           |          |People:" + tile11people + "                           |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|Aisle                                                                                                                            |");
        System.out.println("|TileID: 12                                                                                                                       |");
        System.out.println("|People:" + tile12people + "                                                                                                                         |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
    }

    static void printClassroomErrors(boolean tile1Sanitizer, int tile1People, int tile2People, boolean tile3Lysol,
                                     int tile3People, int tile4People, boolean tile5Lysol, int tile5People,
                                     boolean tile6Lysol, int tile6People, int tile7People, boolean tile8Lysol,
                                     int tile8People, int tile9People, boolean tile10Lysol, int tile10People,
                                     boolean tile11Lysol, int tile11People, int tile12People) {
        System.out.print("\u001B[31m");

        if (tile1Sanitizer == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 1 WITHOUT USING SANITIZER.");
        }
        if (tile1People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 1.");
        }
        if (tile2People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 2.");
        }
        if (tile3Lysol == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 3 WITHOUT USING LYSOL TWICE.");
        }
        if (tile3People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 3.");
        }
        if (tile4People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 4.");
        }
        if (tile5Lysol == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 5 WITHOUT USING LYSOL TWICE.");
        }
        if (tile5People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 5.");
        }
        if (tile6Lysol == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 6 WITHOUT USING LYSOL TWICE.");
        }
        if (tile6People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 6.");
        }
        if (tile7People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 7.");
        }
        if (tile8Lysol == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 8 WITHOUT USING LYSOL TWICE.");
        }
        if (tile8People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 8.");
        }
        if (tile9People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 9.");
        }
        if (tile10Lysol == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 10 WITHOUT USING LYSOL TWICE.");
        }
        if (tile10People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 10.");
        }
        if (tile11Lysol == true) {
            System.out.println("ERROR: SOMEONE LEFT TILE 11 WITHOUT USING LYSOL TWICE.");
        }
        if (tile11People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 11.");
        }
        if (tile12People > 1) {
            System.out.println("ERROR: THERE ARE TOO MANY PEOPLE IN TILE 12.");
        }

        System.out.println("\u001B[0m");
    }

    /**
     * Prints out a person and their information
     * @param personId The person's ID number
     * @param personType Whether the person is a "student" or a "teacher"
     * @param mask 'y' if the person is wearing a mask; 'n' if the person isn't wearing a mask
     * @param shield 'y' if the teacher is wearing a face shield; 'n' if the teacher isn't; 'a' if the person is a student
     */
    static void printPerson(int personId, String personType, int tileID, char mask, char shield) {
        System.out.println("------------------------------Person------------------------------");
        System.out.println("Person ID: " + personId);
        System.out.println("Type: " + personType);
        System.out.println("Tile ID: " + tileID);

        if (mask == 'n' ) {
            System.out.println("ERROR: PERSON " + personId + " IS NOT CORRECTLY WEARING THEIR MASK.");
        }

        System.out.println("Wearing a mask: " + mask);

        if (shield == 'y') {
            System.out.println("Wearing a face shield: " + shield);
        }

        else if (shield == 'n') {
            System.out.println("ERROR: PERSON " + personId + " IS NOT CORRECTLY WEARING THEIR SHIELD.");
            System.out.println("Wearing a face shield: " + shield);
        }
    }
}
