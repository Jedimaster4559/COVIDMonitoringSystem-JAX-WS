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

public class PrintCommands {
    static void printCommands() {
        System.out.println("--------------------Commands--------------------");
        System.out.println("Start Classes: start");
        System.out.println("End Classes: end");
        System.out.println("Switch room: switch [classroom number]");
        System.out.println("Please enter a command: ");
    }

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
}
