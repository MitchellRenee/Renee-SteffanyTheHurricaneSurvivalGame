/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;
import byui.cit260.theHurricaneSurvivalGame.Exception.StoreException;
import byui.cit260.theHurricaneSurvivalGame.model.Item;

/**
 *
 * @author Steffany
 */
public class StoreControl {

    /**
     * <h2>purchase:</h2>
     * <p>
     * This allows the player to maneuver through the store to select and
     * purchase items using the player's money account.
     *
     * @param SelectItems lets the player select a particular item from a
     * particular aisle or shelf within the store.
     * @param BuyItems lets the player purchase items with their money account.
     * @param MoneyAccount subtracts the total cost of purchased items from
     * player's money account.
     * @return correct items if money is in the money account.
     */
    public static boolean purchase(Item i, ItemAmount a, MoneyAccountControl m)
            throws StoreException {
        boolean returnValue = false;
        if (Item.located() && ItemAmount() >= 1 && MoneyAccount() >= 4.50) {
             throw new StoreException("Cannot move west.");
            
        }

        return returnValue;
    }

    public static void main(boolean[] args) {

        int[][] aryNumbers = new int[2][2];
        //Create a multidemnsional array

        boolean[][] items = new boolean[0][0];
        boolean[][] itemAmount = new boolean[0][1];
        boolean[][] moneyAccount = new boolean[0][2];

        aryNumbers[0][0] = 4;
        aryNumbers[01][1] = 15;
        aryNumbers[0][2] = 28;

        int row = 2;
        int column = 2;
        int i, j;
    }
    //Use the for-each style loop pg 13, 17 ref

    public long getStoreControl(int[][] tableOfElements) {

        long total = 0;

        for (int[] row : tableOfElements) {
            for (int elements : row) {
                total += elements;
                System.out.println(elements + " ");
            }
        }
        return total;
    }

    public static int ItemAmount() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    public static double MoneyAccount() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    public static class ItemAmount {

        public ItemAmount() {
        }
    }
}
