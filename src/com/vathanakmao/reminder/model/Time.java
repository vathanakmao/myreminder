/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vathanakmao.reminder.model;

import java.io.Serializable;

/**
 *
 * @author vathanak
 */
public class Time implements Serializable {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    
}
