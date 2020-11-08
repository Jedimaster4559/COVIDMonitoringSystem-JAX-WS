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
        System.out.println("--------------------Commands--------------------");
        System.out.println("Start Classes: start");
        System.out.println("End Classes: end");
        System.out.println("Switch room: switch [classroom number]");
        System.out.println("Please enter a command: ");
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
        System.out.println("|People:" + tile5people + "                           |People:" + tile2people + "  |People:" + tile6people + "                           |          |People:" + tile8people + "                           |");
        System.out.println("|-----------------------------------|          |-----------------------------------|Aisle     |-----------------------------------|");
        System.out.println("|Aisle                              |          |Student Rectangle #4: Desk & Lysol |TileID: 7 |Student Rectangle #5               |");
        System.out.println("|TileID: 9                          |          |TileID: 10                         |People:" + tile7people + "  |TileID: 11                         |");
        System.out.println("|People:" + tile9people + "                           |          |# Times Lysol Used:" + tile10lysol + "               |          |# Times Lysol Used:" + tile11lysol + "               |");
        System.out.println("|                                   |          |People:" + tile10people + "                           |          |People:" + tile11people + "                           |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|Aisle                                                                                                                            |");
        System.out.println("|TileID: 12                                                                                                                       |");
        System.out.println("|People:" + tile12people + "                                                                                                                         |");
        System.out.println("|---------------------------------------------------------------------------------------------------------------------------------|");
    }

    /**
     * Prints out a person and their information
     * @param personID The person's ID number
     * @param personType Whether the person is a "student" or a "teacher"
     * @param mask 'y' if the person is wearing a mask; 'n' if the person isn't wearing a mask
     * @param faceshield 'y' if the teacher is wearing a face shield; 'n' if the teacher isn't; 'a' if the person is a student
     */
    static void printPerson(int personID, String personType, char mask, char faceshield) {
        System.out.println("--------------------");
        System.out.println("PersonID: " + personID);
        System.out.println("Type: " + personType);
        System.out.println("Wearing a mask: " + mask);
        if (faceshield == 'y' || faceshield == 'n') {
            System.out.println("Wearing a face shield: " + faceshield);
        }
    }
}
