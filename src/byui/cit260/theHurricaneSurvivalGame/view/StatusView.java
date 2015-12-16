/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

/**
 *
 * @author Renee
 */
public class StatusView  {

    int display;
    private int MENU;

    public StatusView() {

        super("\n"
                + "\n------------------------------------"
                + "\n| Status View"
                + "\n------------------------------------"
                + "\nA - Amount of deliveries remaining  "
                + "\nR - Resources remaining to collect  "
                + "\nP - Percentage of game completed    "
                + "\nS - Save status                     "
                + "\nQ- Quit                             "
                + "\n------------------------------------");
    }

    public int doAction(Object obj) {
        try {

            String value = (String) obj;

            value = value.toUpperCase(); // Convert to all upper case
            char choice = value.charAt(0); // Get first character entered

            switch (choice) {
                
                case 'G': // Get and start an existing status view
                    this.startStatusView();
                    break;
                case 'A': //Lets the player view deliveries remaining to deliver
                    this.displaysAmountOfDeliveriesRemaining();
                    break;
                case 'R': // Display the amount of resources remaining to collect
                    this.displayResourceRemainingToCollect();
                    break;
                case 'P': // Display the percentage of game that has been completed
                    this.displayPercentageofGameCompleted();
                    break;
                case 'S': // Save the current game view 
                    this.saveGame();
                    break;
                case 'Q': // Quit the program
                    return 0;
                default:
                    System.out.println("\n*** This is an invalid selection *** Please try again");
                    break;
            }
            return 0;

        } catch (Exception e) {

            System.out.print("Error reading input: " + e.getMessage());
            ErrorView.display(this.getClass().getName());

            return 0;
        }
    }

    private void startStatusView() {
        System.out.println("Retrieve status view.");
    }

    private void displaysAmountOfDeliveriesRemaining() {
        System.out.println("Amount of deliveries remaining cannot be less than 20.");
    }

    private void displayResourceRemainingToCollect() {
        System.out.println("Resources remaining to collect cannot be less than 30.");
    }

    private void displayPercentageofGameCompleted() {
        System.out.println("Pecentage of game completed cannot be less than 0.");
    }

    private void saveGame() {
        System.out.println("Not supported yet.");
    }

}
