package thehurricanesurvivalgame;

import static byui.cit260.theHurricaneSurvivalGame.control.PlayerControl.player;
import byui.cit260.theHurricaneSurvivalGame.control.ProgramControl;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import byui.cit260.theHurricaneSurvivalGame.view.MainMenuView;
import byui.cit260.theHurricaneSurvivalGame.view.StartProgramView;
import byui.cit260.theHurricaneSurvivalGame.view.WelcomeView;
import java.util.Scanner;

public class TheHurricaneSurvivalGame {

    /**
     * @param args the command line arguments
     */
    private static final Game currentGame = null;
    private static final Player player = null;

    public static void main(String[] args) {

Player player = new Player();

WelcomeView welcomeView = new WelcomeView();
welcomeView.displayBannner();

player.setName(welcomeView.getPlayerName());

welcomeView.displayPlayerNameBanner(player);


MainMenuView mainView = new MainMenuView();
    mainView.display();        



//Create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        theHurricaneSurvivalGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        theHurricaneSurvivalGame.player = player;
    }

    /*public static void setPlayer(Player player) {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }*/
    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class theHurricaneSurvivalGame {

        private static Game currentGame;
        private static Player player;

        public theHurricaneSurvivalGame() {
        }
    }
}
    
    
    
    /*public class MainMenuView {

        private final String MENU = "\n"
                + "\n------------------------------------"
                + "\n| MainMenu"
                + "\n------------------------------------"
                + "\nG - Start game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n------------------------------------";

        public void displayMenu() {

            char selection = 'S';
            do {
                boolean MENU = false;

                System.out.println(MENU); //Display the main menu

                String input = this.getInput(); // Get the user's selection
                selection = input.charAt(0); // Get first character of string

                this.doAction(selection); // Do action based on selection

            } while (selection != 'E'); // An selection is not "Exit"
        }

        public String getInput() {

            boolean valid = false; // Indicates the input has been retrieved
            String getInput = null;
            Scanner keyboard = new Scanner(System.in); //Keyboard input stream

            while (!valid) {//while a valid input has not been entered

                //Prompt for the player's input
                System.out.println("Enter the input value below:");

                //Get the input value entered from the keyboard and trim off the blanks at the end of value
                String input = keyboard.nextLine();
                input = input.trim();

                //If invalid input entered (not less than one character in length))
                if (input.length() < 1) {
                    System.out.println("Invalid input value - the input must not be blank");
                    continue; //and repeat again        
                }
                break;// Out of the (exit) the repetition
            }
            return null;
        }

        public void doAction(char choice) {

            switch (choice) {
                case 'N': // Create and start a new game
                    this.startNewGame();
                case 'G': // Get and start an exiting game
                    this.startExistingGame();
                case 'H': // Display the help menu
                    this.displayHelpMenu();
                case 'S': // Save the current game 
                    this.saveGame();
                case 'E': // Exit the program
                    return;
                default:
                    System.out.println("\n*** This is an invalid selection *** Please try again");
                    break;
            }
        }

        private void startNewGame() {
            System.out.println("*** startNewGame function called ***");
        }

        private void startExistingGame() {
            System.out.println("*** startExistingGame function called ***");
        }

        private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu funtion called ***");
        }

        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
    }
}

//Prompt the player to enter their name
/*Map mainMap = new Map();
            
 mainMap.setLocation("House");
 mainMap.setCoordinates(7);
            
 String mapInfo = mainMap.toString();
 System.out.println(mainMap);
        
        
 CampingStore department = new CampingStore();
        
 department.setTentAndCanopyAisle("Aisle 2");
 department.setLightingAisle("Aisle 5");
 department.setCookingSupplyAisle("Aisle 1");
 department.setGearAisle("Aisle 4");
 department.setGeneratorsAisle("Aisle 3");
 department.setLocation("Row 4, Column 7");
 department.setGearAisle("Create 5 Aisle with a maximum of 3 stock shelving");
 department.setStoreSize("Store size is 500 x 325 square feet");
 department.setGameMenu("Return to game menu");
        
        
 String campingStoreInfo = department.toString();
 System.out.println(campingStoreInfo);
        
        
 CampingStoreSupplies nameCampingSupply = new CampingStoreSupplies();
        
 nameCampingSupply.setTentSize("medium tent or family size tent");
 nameCampingSupply.setCanopySize("medium canopy or large canopy");
 nameCampingSupply.setFlashlightSize("pocket size flashlight or large flashlight");
 nameCampingSupply.setBatterySizes("triple AAA batteries, double AA batteries, C batteries, D batteries, extra-large batteries");
 nameCampingSupply.setCandleSize("medium candles or large candles");
 nameCampingSupply.setLedLantern("medium LED latern or large LED latern");
 nameCampingSupply.setMatchesAndLighter("matches or lighter");
 nameCampingSupply.setCrankRadio("crank radio or battery powered radio");
 nameCampingSupply.setCookingStove("small cooking Stove or medium cooking stove");
 nameCampingSupply.setFuel("generator fuel or automobile fuel");
 nameCampingSupply.setRainGear("children rain gear, teen-ager rain gear, or adult rain gear");
 nameCampingSupply.setGameMenu("Return to game menu");
        
 String nameCampingSupplyInfo = nameCampingSupply.toString();
 System.out.println("nameCampingSupplyInfo");
        
     
        
 HurricaneSurvivalGame access = new HurricaneSurvivalGame();
        
 access.setAccessProgram("Computer starts game program");
 access.setTotalTime(12);
 access.setGameTime(48);
        
 String hurricaneSurvivalGameInfo = access.toString();
 System.out.println(hurricaneSurvivalGameInfo);
        
 ViewInventory view = new ViewInventory();
        
 view.setViewSupplyList("view list of supplies");
        
 String viewInventoryInfo = view.toString();
 System.out.println(viewInventoryInfo);
        
        
 BasementItems basementItems = new BasementItems();
        
 basementItems.setWater("Store water");
 basementItems.setFoodStorage("Store foodstore");
        
 String basementItemsInfo = basementItems.toString();
 System.out.println(basementItemsInfo);
        
        
 BathroomItems bathroomItems = new BathroomItems();
        
 bathroomItems.setHygienalKits("Store hygiene kits");
 bathroomItems.setToiletPaper("Store toilet paper");
 bathroomItems.setPrescribedMedicine("Store prescribed medicine");
 bathroomItems.setUnprescribedMedicine("Store unprescribed medicine");
 bathroomItems.setFirstaidKit("Store firstaid kit");
        
 String bathroomItemsInfo = bathroomItems.toString();
 System.out.println(bathroomItemsInfo);
        
        
 BedroomItems bedroomItems = new BedroomItems();
        
 bedroomItems.setClothes("Store clothes");
 bedroomItems.setShoes("Store shoes");
 bedroomItems.setBlankets("Store blankets");
        
 String bedroomItemsInfo = bedroomItems.toString();
 System.out.println(bedroomItemsInfo);
        
        
 ClosetItems closetItems = new ClosetItems();
        
 closetItems.setLedLantern("Store LED lantern");
 closetItems.setMylarBlankets("Store Mylar blankets");
 closetItems.setCrankRadio("Store crank radio");
 closetItems.setMatches("Store matches");
 closetItems.setCandles("Store candles");
 closetItems.setFlashlight("Store flashlight");
 closetItems.setBatteries("Store batteries");
        
 String closetItemsInfo = closetItems.toString();
 System.out.println(closetItemsInfo);
        
        
 GarageItems garageItems = new GarageItems();
        
 garageItems.setTent("Store tent");
 garageItems.setCanopy("Store canopy");
 garageItems.setCookingStove("Store cooking stove");
 garageItems.setGenerator("Store generator");
        
 String garageItemsInfo = garageItems.toString();
 System.out.println(garageItemsInfo);
        
        
 KitchenItems kitchenItems = new KitchenItems();
        
 kitchenItems.setProtein("Store proteins");
 kitchenItems.setCarbohydrates("Store carbohydrates");
 kitchenItems.setSnack("Store snacks");
 kitchenItems.setSugarySweets("Store sugary sweets");
        
 String kitchenItemsInfo = kitchenItems.toString();
 System.out.println(kitchenItemsInfo);
        
        
 StoreModel develop = new StoreModel();
        
 develop.setLocation("Develop location");
 develop.setAisles("Develop aisles to hold items");
 develop.setShelves("Develop shelving for aisles");
 develop.setGrabItems("Develop ability for player to grab items");
 develop.setBuyItems("Develop cash registers to buy items");
 develop.setDeliverItems("Develop a delivery Center to deliver items to new location");
        
 String storeInfo = develop.toString();
 System.out.println(storeInfo);
        
        
 MegaStore availableMegaProducts = new MegaStore();
        
 availableMegaProducts.setProtien("Proteins");
 availableMegaProducts.setSweets("Sweets");
 availableMegaProducts.setCarbs("Carbs");
 availableMegaProducts.setToiletries("Toiletries");
 availableMegaProducts.setFirstaid("Firstaid");
 availableMegaProducts.setClothing("Clothing");
 availableMegaProducts.setBlankets("Blankets");
 availableMegaProducts.setWater("Water");
 availableMegaProducts.setLocation("Location");
 availableMegaProducts.setAisles("Aisles");
 availableMegaProducts.setStoreSize("Store size is 500 x 500 square feet");
 availableMegaProducts.setGameMenu("Return to game menu");
        
 String megaStoreInfo = availableMegaProducts.toString();
 System.out.println(megaStoreInfo);
        
        
 MegaStoreItems nameMegaProducts = new MegaStoreItems();
        
 nameMegaProducts.setNameProtien("meats,peanutbutter,and fresh vegetables");
 nameMegaProducts.setNameSnacks("graham crackers,fruits, and granola bars");
 nameMegaProducts.setNameSugarySweets("candy, chips,and bannana bread");
 nameMegaProducts.setNameCarbs("breads,rice,beans");
 nameMegaProducts.setNameToiletries("toilet paper, soap, and toothpaste");
 nameMegaProducts.setNameFirstaid("firstaid kit, peroxide, and rubbing alcohol");
 nameMegaProducts.setNamePrescribedMedicine("Prescribed medicine from doctor");
 nameMegaProducts.setNameUnPrescribedMedicine("Over-the-counter medicine");
 nameMegaProducts.setNameClothing("rubber boots and rain gear");
 nameMegaProducts.setNameBlankets("Mylar blankets and sleeping blankets");
 nameMegaProducts.setNameWater("bottle water and water storage bins");
 nameMegaProducts.setGameMenu("Return to game menu");
        
 String megaStoreItemsInfo = nameMegaProducts.toString();
 System.out.println(megaStoreItemsInfo);
        
        
 MainMenu mainMenu = new MainMenu();
        
 mainMenu.setStartGame("Start");
 mainMenu.setReturnToGame("Return");
 mainMenu.setHowToPlay("How to Play");
 mainMenu.setSaveGame("Save");
 mainMenu.setExit("Exit");
        
 String mainMenuInfo = mainMenu.toString();
 System.out.println(mainMenuInfo);
        
        
 HelpMenu helpMenu = new HelpMenu();
        
 helpMenu.setGoalOfGame("The goal of the game is to survive the hurricane.");
 helpMenu.setViewSuppliesNeeded("You need food and water.");
 helpMenu.setViewCurrentInventory("You have everything but food and water."); 
 helpMenu.setViewSurvivalPointsEarned("500 survival points earned!"); 
 helpMenu.setMoveToLocations("Go to any location by entering the coordinates."); 
 helpMenu.setMakeMoney("Earn money by delivering supplies."); 
 helpMenu.setBuySupplies("Purchase supplies at any of the stores.");
 helpMenu.setDeliverSupplies("Go give supplies to those in need.");
 helpMenu.setViewEachLocationInventory("Current inventory in location."); 
 helpMenu.setCloseHelpMenu("Close Help Menu");
        
 String helpMenuInfo = helpMenu.toString();
 System.out.println(helpMenuInfo);
        
        
 StartMenu startMenu = new StartMenu();
        
 startMenu.setContinueGame("Continue Game");
 startMenu.setReturnToMenu("Return To Menu");
 startMenu.setViewMap("View Map");
 startMenu.setGoToHouse("Go To House");
        
 String startMenuInfo = startMenu.toString();
 System.out.println(startMenuInfo);
        
        
 GameMenu gameMenu = new GameMenu();
        
 gameMenu.setMapOfTown("Map of Town");
 gameMenu.setSupplyList("Supply List");
 gameMenu.setInventoryList("Inventory List");
 gameMenu.setNewLocation("New Location");
 gameMenu.setDeliverSupplies("Deliver Supplies");
 gameMenu.setViewDeliveries("View Deliveries");
 gameMenu.setWhatLocationHas("What Location Has");
 gameMenu.setMoneyAccount("Money Account");
 gameMenu.setSurvivalPointsEarned("Survival Points Earned");
 gameMenu.setTimeBeforeHurricane("Time Before Hurricane");
 gameMenu.setHelp("Help");
 gameMenu.setMainMenu("Main Menu");
        
 String gameMenuInfo = gameMenu.toString();
 System.out.println(gameMenuInfo);
        
        
 SaveGame saveGame = new SaveGame();
        
 saveGame.setSavePlayer("Save Player");
 saveGame.setSaveInventory("Save Inventory");
 saveGame.setSaveProgress("Save Progress");
        
 String saveGameInfo = saveGame.toString();
 System.out.println(saveGameInfo);
        
        
 RetrieveGame retrieveGame = new RetrieveGame();
        
 retrieveGame.setLocateSavedGame("Locate Saved Game");
 retrieveGame.setReadSavedGame("Read Saved Game");
 retrieveGame.setRetrieveSavedGame("Retrieve Saved Game");
        
 String retrieveGameInfo = retrieveGame.toString();
 System.out.println(retrieveGameInfo);
        
        
 HouseMap houseMap = new HouseMap();
        
 houseMap.setKitchen("row 2, column 5");
 houseMap.setBedroom("row 2, column 4");
 houseMap.setBathroom("row 3, coulmn 5");
 houseMap.setCloset("row 2, column 3");
 houseMap.setBasement("row 4 column 3");
 houseMap.setGarage("row 3, column 6");
 houseMap.setMegaStoreDepartments("protein, snacks, sugary sweets, carbs, toiletries, first aid, prescribed meds, over-the-counter meds, clothes, blankets, water");
 houseMap.setCampingStoreDepartments("tents and canopies, lighting, cooking supplies, gear, generator, game");
 houseMap.setDeliveryCenterDepartment("water, nursing home, prison");
        
 String houseMapInfo = houseMap.toString();
 System.out.println(houseMapInfo);
        
        
 CityMap cityMap = new CityMap();
        
 cityMap.setMegaStore("row 5, column 4");
 cityMap.setCampingStore("row 5, column 5");
 cityMap.setDeliveryCenter("row 5, column 6");
        
 String cityMapInfo = cityMap.toString();
 System.out.println(cityMapInfo);
        
        
 Location location = new Location();
        
 location.setDisplayLocations("Display Locations");
 location.setEnterLocationCoordinates("Enter Location Coordinates");
 location.setInvalidCoordinates("Invalid Coordinates");
 location.setValidCoordinates("Valid Coordinates");
 location.setNewLocationDisplaysInstructions("New Location Displays Instructions");
        
 String locationInfo = location.toString();
 System.out.println(locationInfo);
        
        
 DeliveryCenter deliveryCenter = new DeliveryCenter();
        
 deliveryCenter.setDeliverWater("To Prison");
 deliveryCenter.setDeliverSuppliesToNursingHome("No");
 deliveryCenter.setDeliverSuppliesToPrison("Yes");
        
 String deliveryCenterInfo = deliveryCenter.toString();
 System.out.println(deliveryCenterInfo);
        
        
 ViewDeliveries viewDeliveries = new ViewDeliveries();
        
 viewDeliveries.setDeliveryAmount("100 tons of food");
 viewDeliveries.setDeliveryLocations("Prison");
        
 String viewDeliveriesInfo = viewDeliveries.toString();
 System.out.println(viewDeliveriesInfo);
        
        
 DeliverySupplies deliver = new DeliverySupplies();
        
 deliver.setMoveToDeliveryLocation("Prison");
 deliver.setPlayerEntersResponse("Deliver food to prison");
 deliver.setGameMenu("Game Menu");
 deliver.setDeliverSupplies("Take supplies to prison");
 deliver.setChooseValidDeliveryLocation("Prison");
 deliver.setValidResponseDisplayMessage("Thank you for delivering food.");
 deliver.setReturnToGameMenu("Return to Game Menu");
        
 String deliverySuppliesInfo = deliver.toString();
 System.out.println(deliverySuppliesInfo);
        
        
 ViewSupplyList supplyList = new ViewSupplyList();
        
 supplyList.setProteinPoints("30 points");
 supplyList.setCarbohydratePoints("25 points");
 supplyList.setSweetsAndSugarPoints("20 points");
 supplyList.setClothesPoints("25 points");
 supplyList.setShoesPoints("25 points");
 supplyList.setBlanketsPoints("15 points");
 supplyList.setHygeinalKitsPoints("10 points");
 supplyList.setToiletPaperPoints("10 points");
 supplyList.setPrescribedMedicationPoints("10 points");
 supplyList.setUnprescribedMedicationPoints("10 points");
 supplyList.setFirstAidKitPoints("15 points");
 supplyList.setLedLanternPoints("15 points");
 supplyList.setMylarBlanketsPoints("25 points");
 supplyList.setCrankRadioPoints("10 points");
 supplyList.setMatchesPoints("15 points");
 supplyList.setCandlesPoints("15 points");
 supplyList.setFlashlightPoints("15 points");
 supplyList.setBatteriesPoints("10 points");
 supplyList.setWaterPoints("25 points");
 supplyList.setTentPoints("25 points");
 supplyList.setCookingStovePoints("15 points");
 supplyList.setCanopyPoints("15 points");
        
        
 String viewSupplyListInfo = supplyList.toString();
 System.out.println(viewSupplyListInfo);
        
        
 RoomList rooms = new RoomList();
        
 rooms.setBasement("basement");
 rooms.setKitchen("kitchen");
 rooms.setBedroom("bedroom");
 rooms.setCloset("closet");
 rooms.setGarage("garage");
        
 String roomListInfo = rooms.toString();
 System.out.println(roomListInfo);*/
