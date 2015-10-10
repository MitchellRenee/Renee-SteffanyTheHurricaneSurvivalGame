
package thehurricanesurvivalgame;

import byui.cit260.theHurricaneSurvivalGame.model.BasementItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.BathroomItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.BedroomItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.CampingStoreModel;
import byui.cit260.theHurricaneSurvivalGame.model.CampingStoreSuppliesModel;
import byui.cit260.theHurricaneSurvivalGame.model.ClosetItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.GarageItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGameModel;
import byui.cit260.theHurricaneSurvivalGame.model.KitchenItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.MapModel;
import byui.cit260.theHurricaneSurvivalGame.model.MegaStoreItemsModel;
import byui.cit260.theHurricaneSurvivalGame.model.MegaStoreModel;
import byui.cit260.theHurricaneSurvivalGame.model.StoreModel;
import byui.cit260.theHurricaneSurvivalGame.model.ViewInventoryModel;

/**
 *
 * @author SteffanyFaldmo
 */
public class TheHurricaneSurvivalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MapModel mainMap = new MapModel();
            
        mainMap.setLocation("House");
        mainMap.setCoordinates(7);
            
        String mapInfo = mainMap.toString();
        System.out.println(mainMap);
        
        
        CampingStoreModel department = new CampingStoreModel();
        
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
        
        
        CampingStoreSuppliesModel nameCampingSupply = new CampingStoreSuppliesModel();
        
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
        
     
        
        HurricaneSurvivalGameModel access = new HurricaneSurvivalGameModel();
        
        access.setAccessProgram("Computer starts game program");
        access.setTotalTime(12);
        access.setGameTime(48);
        
        String hurricaneSurvivalGameInfo = access.toString();
        System.out.println(hurricaneSurvivalGameInfo);
        
        ViewInventoryModel view = new ViewInventoryModel();
        
        view.setViewSupplyList("view list of supplies");
        
        String viewInventoryInfo = view.toString();
        System.out.println(viewInventoryInfo);
        
        
        BasementItemsModel basementItems = new BasementItemsModel();
        
        basementItems.setWater("Store water");
        basementItems.setFoodStorage("Store foodstore");
        
        String basementItemsInfo = basementItems.toString();
        System.out.println(basementItemsInfo);
        
        
        BathroomItemsModel bathroomItems = new BathroomItemsModel();
        
        bathroomItems.setHygienalKits("Store hygiene kits");
        bathroomItems.setToiletPaper("Store toilet paper");
        bathroomItems.setPrescribedMedicine("Store prescribed medicine");
        bathroomItems.setUnprescribedMedicine("Store unprescribed medicine");
        bathroomItems.setFirstaidKit("Store firstaid kit");
        
        String bathroomItemsInfo = bathroomItems.toString();
        System.out.println(bathroomItemsInfo);
        
        
        BedroomItemsModel bedroomItems = new BedroomItemsModel();
        
        bedroomItems.setClothes("Store clothes");
        bedroomItems.setShoes("Store shoes");
        bedroomItems.setBlankets("Store blankets");
        
        String bedroomItemsInfo = bedroomItems.toString();
        System.out.println(bedroomItemsInfo);
        
        
        ClosetItemsModel closetItems = new ClosetItemsModel();
        
        closetItems.setLedLantern("Store LED lantern");
        closetItems.setMylarBlankets("Store Mylar blankets");
        closetItems.setCrankRadio("Store crank radio");
        closetItems.setMatches("Store matches");
        closetItems.setCandles("Store candles");
        closetItems.setFlashlight("Store flashlight");
        closetItems.setBatteries("Store batteries");
        
        String closetItemsInfo = closetItems.toString();
        System.out.println(closetItemsInfo);
        
        
        GarageItemsModel garageItems = new GarageItemsModel();
        
        garageItems.setTent("Store tent");
        garageItems.setCanopy("Store canopy");
        garageItems.setCookingStove("Store cooking stove");
        garageItems.setGenerator("Store generator");
        
        String garageItemsInfo = garageItems.toString();
        System.out.println(garageItemsInfo);
        
        
        KitchenItemsModel kitchenItems = new KitchenItemsModel();
        
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
        
        
        MegaStoreModel availableMegaProducts = new MegaStoreModel();
        
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
        
        
        MegaStoreItemsModel nameMegaProducts = new MegaStoreItemsModel();
        
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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
         }  
    }
    
    
