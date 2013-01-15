/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vathanakmao.reminder.event;

import com.vathanakmao.reminder.model.Details;


/**
 *
 * @author vathanak
 */
public class SetReminderEvent {
    private Details details;
    
    public SetReminderEvent() {
    }
    
    public SetReminderEvent(Details details) {
        this.details = details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Details getDetails() {
        return details;
    }
    
}
