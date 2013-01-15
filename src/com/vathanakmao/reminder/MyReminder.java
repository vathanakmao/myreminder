/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vathanakmao.reminder;

import com.vathanakmao.reminder.controller.SetReminderController;
import com.vathanakmao.reminder.view.SetReminderGUI;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.UIManager;

/**
 *
 * @author vathanak
 */
public class MyReminder {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //TODO: remove this lines
        Calendar cal = new GregorianCalendar(2012, 0, 1);
        System.out.println("---------------- maximum day of months = " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal = new GregorianCalendar(2012, 1, 1);
        System.out.println("---------------- maximum day of months = " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetReminderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetReminderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetReminderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetReminderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                initLookAndFeel();
                
                new SetReminderController();
            }
        });
    }
    
    private static void initLookAndFeel() {
        try {
//            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            throw new Exception();
        } 
        catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            }    
            catch (Exception ex) {
                // do nothing to take default look and feel
            }
        }
    }
    
    
}
