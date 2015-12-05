/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.CityMap;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.LocationType;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author Steffany
 */
public class GameControl {

    private static final double STARTING_CASH = 500;

    public static Item[] createInventoryList() {
        //Created an array list of supply items
        Item[] inventory = new Item[26];

        Item protein = new Item();
        protein.setName("Protein");
        protein.setWeight(5);
        protein.setQuantityInStock(11);
        protein.setRequiredAmount(2);
        protein.setSurvivalPoints(10);
        inventory[2] = protein;

        Item snack = new Item();
        snack.setName("Snack");
        snack.setWeight(2);
        snack.setQuantityInStock(12);
        snack.setRequiredAmount(4);
        snack.setSurvivalPoints(7);
        inventory[1] = snack;

        Item sweets = new Item();
        sweets.setName("Sweets");
        sweets.setWeight(4);
        sweets.setQuantityInStock(10);
        sweets.setRequiredAmount(5);
        sweets.setSurvivalPoints(5);
        inventory[1] = sweets;

        Item carbs = new Item();
        carbs.setName("Carbs");
        carbs.setWeight(15);
        carbs.setQuantityInStock(8);
        carbs.setRequiredAmount(12);
        carbs.setSurvivalPoints(25);
        inventory[1] = carbs;

        Item toiletries = new Item();
        toiletries.setName("Toiletries");
        toiletries.setWeight(15);
        toiletries.setQuantityInStock(8);
        toiletries.setRequiredAmount(12);
        toiletries.setSurvivalPoints(25);
        inventory[1] = toiletries;

        Item firstaid = new Item();
        firstaid.setName("Firstaid");
        firstaid.setWeight(5);
        firstaid.setQuantityInStock(7);
        firstaid.setRequiredAmount(1);
        firstaid.setSurvivalPoints(50);
        inventory[0] = firstaid;

        Item prescribedMeds = new Item();
        prescribedMeds.setName("PrescribedMeds");
        prescribedMeds.setWeight(2);
        prescribedMeds.setQuantityInStock(25);
        prescribedMeds.setRequiredAmount(2);
        prescribedMeds.setSurvivalPoints(35);
        inventory[1] = prescribedMeds;

        Item overTheCounterMeds = new Item();
        overTheCounterMeds.setName("OverTheCounterMeds");
        overTheCounterMeds.setWeight(3);
        overTheCounterMeds.setQuantityInStock(25);
        overTheCounterMeds.setRequiredAmount(4);
        overTheCounterMeds.setSurvivalPoints(35);
        inventory[0] = overTheCounterMeds;

        Item clothing = new Item();
        clothing.setName("Clothing");
        clothing.setWeight(14);
        clothing.setQuantityInStock(200);
        clothing.setRequiredAmount(9);
        clothing.setSurvivalPoints(20);
        inventory[10] = clothing;

        Item blankets = new Item();
        blankets.setName("Blankets");
        blankets.setWeight(15);
        blankets.setQuantityInStock(75);
        blankets.setRequiredAmount(3);
        blankets.setSurvivalPoints(25);
        inventory[2] = blankets;

        Item water = new Item();
        water.setName("Water");
        water.setWeight(30);
        water.setQuantityInStock(100);
        water.setRequiredAmount(3);
        water.setSurvivalPoints(25);
        inventory[1] = water;

        Item tent = new Item();
        tent.setName("Tent");
        tent.setWeight(12);
        tent.setQuantityInStock(37);
        tent.setRequiredAmount(1);
        tent.setSurvivalPoints(15);
        inventory[0] = tent;

        Item canopy = new Item();
        canopy.setName("Canopy");
        canopy.setWeight(3);
        canopy.setQuantityInStock(48);
        canopy.setRequiredAmount(1);
        canopy.setSurvivalPoints(7);
        inventory[0] = canopy;

        Item flashlight = new Item();
        flashlight.setName("Flashlight");
        flashlight.setWeight(4);
        flashlight.setQuantityInStock(48);
        flashlight.setRequiredAmount(1);
        flashlight.setSurvivalPoints(7);
        inventory[0] = flashlight;

        Item candles = new Item();
        candles.setName("Candles");
        candles.setWeight(5);
        candles.setQuantityInStock(64);
        candles.setRequiredAmount(25);
        candles.setSurvivalPoints(10);
        inventory[0] = candles;

        Item batteries = new Item();
        batteries.setName("Batteries");
        batteries.setWeight(7);
        batteries.setQuantityInStock(51);
        batteries.setRequiredAmount(12);
        batteries.setSurvivalPoints(20);
        inventory[2] = batteries;

        Item ledLantern = new Item();
        ledLantern.setName("LedLantern");
        ledLantern.setWeight(10);
        ledLantern.setQuantityInStock(44);
        ledLantern.setRequiredAmount(2);
        ledLantern.setSurvivalPoints(30);
        inventory[0] = ledLantern;

        Item matches = new Item();
        matches.setName("Matches");
        matches.setWeight(2);
        matches.setQuantityInStock(74);
        matches.setRequiredAmount(5);
        matches.setSurvivalPoints(5);
        inventory[1] = matches;

        Item crankRadio = new Item();
        crankRadio.setName("CrankRadio");
        crankRadio.setWeight(8);
        crankRadio.setQuantityInStock(32);
        crankRadio.setRequiredAmount(1);
        crankRadio.setSurvivalPoints(10);
        inventory[0] = crankRadio;

        Item cookingStove = new Item();
        cookingStove.setName("CookingStove");
        cookingStove.setWeight(17);
        cookingStove.setQuantityInStock(21);
        crankRadio.setRequiredAmount(1);
        crankRadio.setSurvivalPoints(40);
        inventory[0] = cookingStove;

        Item fuel = new Item();
        fuel.setName("Fuel");
        fuel.setWeight(17);
        fuel.setQuantityInStock(21);
        fuel.setRequiredAmount(1);
        fuel.setSurvivalPoints(40);
        inventory[0] = cookingStove;

        Item rainParker = new Item();
        rainParker.setName("RainParker");
        rainParker.setWeight(17);
        rainParker.setQuantityInStock(21);
        rainParker.setRequiredAmount(1);
        rainParker.setSurvivalPoints(40);
        inventory[0] = rainParker;

        Item rainBoots = new Item();
        rainBoots.setName("RainBoots");
        rainBoots.setWeight(17);
        rainBoots.setQuantityInStock(21);
        rainBoots.setRequiredAmount(1);
        rainBoots.setSurvivalPoints(40);
        inventory[0] = rainBoots;

        return inventory;
    }

    static void createNewGame(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startNewGame() {
        // Create a new game
//        GameControl.createNewGame();
    }

    public static void createNewGame() {
        System.out.println("\n***createNewGame stub function called ***");

        CityMap map = new CityMap();
        map.init();
        HurricaneSurvivalGame.getInstance().setMap(map);
        //HurricaneSurvivalGame.getInstance().setPlayer(player);
        finishCreatePlayer();
    }

    /**
     * Creates a player for a new game
     *
     * @param name
     * @return
     */
    //This section gets re-written below starting at line 257
    //public static Player finishCreatePlayer(String name) {
    //    Player p = new Player();
    //    p.setName(name);
    //    p.setMoneyAccount(STARTING_CASH);
    /*    CityMap gameMap = HurricaneSurvialGame.getInstance().getMap();
        
     //for loop w/ if statement that is iterating rows & col
     //while using a getter & setter.
     for (int row = 0; row < gameMap.getlocationMatrix.length; row++) {
     for (int col = 0; col < gameMap.getlocationMatrix[0].length; col++) {
     if (gameMap.getLocationMatrix()[row][col].getLocationType() == LocationType.Home) {
     p.setPlayerLocation(gameMap.getLocationMatrix()[row][col]);
     //this section was cleanly edited & put into cityMap
     }  
     }        
        
     p.setPlayerLocation(null);
    
     */
    public static void finishCreatePlayer() {
        Player p = HurricaneSurvivalGame.getInstance().getPlayer();
        p.setMoneyAccount(STARTING_CASH);

        CityMap gameMap = HurricaneSurvivalGame.getInstance().getMap();
        p.setPlayerLocation(gameMap.getHomeLocation());

        //return p;
    }
}
