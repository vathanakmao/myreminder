/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vathanakmao.reminder.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author vathanak
 */
public class Details implements Serializable {
    private String description;
    private Calendar dateTime;
    private Time alertBefore;
    private Time alertInterval;
    private Time numOfAlerts;

    public Time getAlertBefore() {
        return alertBefore;
    }

    public void setAlertBefore(Time alertBefore) {
        this.alertBefore = alertBefore;
    }

    public Time getAlertInterval() {
        return alertInterval;
    }

    public void setAlertInterval(Time alertInterval) {
        this.alertInterval = alertInterval;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getNumOfAlerts() {
        return numOfAlerts;
    }

    public void setNumOfAlerts(Time numOfAlerts) {
        this.numOfAlerts = numOfAlerts;
    }
    
    
}
