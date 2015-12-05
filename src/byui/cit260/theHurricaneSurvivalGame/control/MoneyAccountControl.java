/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.MoneyAccountException;

/**
 *
 * @author Renee
 */
public class MoneyAccountControl {

    public double subtractMoney(double totalCash, double cashDeducted, double cashRemaining)
            throws MoneyAccountException {
        if (totalCash < 0) {

            throw new MoneyAccountException("Player cannot buy item.");

        }
        return 0;
    }

}
