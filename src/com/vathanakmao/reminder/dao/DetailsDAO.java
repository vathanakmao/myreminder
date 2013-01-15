/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vathanakmao.reminder.dao;

import com.vathanakmao.reminder.model.Details;
import java.util.List;

/**
 *
 * @author vathanak
 */
public interface DetailsDAO {
    void save(Details details);
    List<Details> getDetails();
}
