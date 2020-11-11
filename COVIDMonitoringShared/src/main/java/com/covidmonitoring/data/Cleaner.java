package com.covidmonitoring.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * A tile that has a property of being able to be cleaned.
 *
 * @author Nathan Solomon
 * @version 16 October 2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Cleaner extends Tile {
    private int cleanCount;
    private boolean noSanitizerUsedAlarm;
    private boolean noLysolUsedAlarm;

    public Cleaner(){
        super();
    }

    /**
     * Overload of normal cleaner.
     * @param id Id of this tile
     * @param type The specific type of tile
     */
    public Cleaner(int id, LocationType type){
        super(id, type);
        this.noLysolUsedAlarm = false;
        this.noSanitizerUsedAlarm = false;
    }

    /**
     * Sets the proper alarm to true if an alarm should go off.
     */
    public void alarm() {
        if(type == LocationType.DESK) {
            noLysolUsedAlarm = true;
        } else if (type == LocationType.ENTRANCE){
            noSanitizerUsedAlarm = true;
        }
    }

    /**
     * Cleans this desk. Increments clean counters and disables
     * alarms.
     */
    public void clean() {
        cleanCount++;
        noSanitizerUsedAlarm = false;
        noLysolUsedAlarm = false;
    }

    /**
     * Processes the state upon leaving the desk.
     */
    public void leave() {
        if(type == LocationType.DESK) {
            if(cleanCount < 2){
                alarm();
            } else {
                noLysolUsedAlarm = false;
                noSanitizerUsedAlarm = false;
                cleanCount = 0;
            }
        } else {
            if(cleanCount < 1){
                alarm();
            } else {
                noLysolUsedAlarm = false;
                noSanitizerUsedAlarm = false;
                cleanCount = 0;
            }
        }
        numPeople--;

        checkPeople();
    }

    /**
     * Gets the number of times the lysol has been used
     * @return The number of times the lysol has been used
     */
    public int getCleanCount() {
        return cleanCount;
    }

    /**
     * Gets the Sanitizer Alarm
     * @return the noSanitizerUsedAlarm
     */
    public boolean getSanitizerAlarm() { return noSanitizerUsedAlarm; }

    /**
     * Gets the Lysol Alarm
     * @return the noLysolAlarm
     */
    public boolean getLysolAlarm() { return noLysolUsedAlarm; }
}
