package com.covidmonitoring.data;

/**
 * Enum to represent each of the different types of tiles that
 * exist within the datamodel. These are used to verify student behaviour
 * on certain types of tiles.
 *
 * DESK - A Desk that either a student or teach can sit in.
 * ENTRANCE - Where students are placed when they first enter the room
 * AISLE - Empty place that someone can be.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
public enum LocationType{
    DESK,
    ENTRANCE,
    AISLE
}