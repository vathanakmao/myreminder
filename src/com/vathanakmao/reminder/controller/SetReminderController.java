/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vathanakmao.reminder.controller;

import com.vathanakmao.reminder.dao.DetailsDAO;
import com.vathanakmao.reminder.event.SetReminderEvent;
import com.vathanakmao.reminder.event.SetReminderListener;
import com.vathanakmao.reminder.view.SetReminderGUI;

/**
 *
 * @author vathanak
 */
public class SetReminderController implements SetReminderListener {
    private SetReminderGUI view;
    private DetailsDAO detailsDao;
    
    public SetReminderController() {
        view = new SetReminderGUI();        
        view.addSetReminderListener(this);
        view.setVisible(true);
    }

    @Override
    public void reminderSet(SetReminderEvent event) {
        detailsDao.save(event.getDetails());
    }
    
}
