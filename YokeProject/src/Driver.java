import java.util.Scanner;

public class Driver {

    private Scanner input = new Scanner(System.in);
    private Shop shop;

    public static void main(String[] args) {
        System.out.println("Yoke Project V 1.0");

        Driver driver = new Driver();
        //driver.processOrder();
        driver.runMenu();

    }

    ///////////////////////////////////////////////////////
    private int mainMenu(){
        System.out.print("""
               Yoke Shop Menu
               ---------
                  1) Add a Yoke
                  2) List All Yokes
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }
    ///////////////////////////////////////////////////////
    private void runMenu(){
        int option = mainMenu();

        while (option != 0){

            switch (option){
                case 1 -> addAYoke();
                case 2 -> printAllYokes();
                default -> System.out.println("Invalid option entered: " + option);
            }

            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting...bye bye");
        System.exit(0);
    }

    private void addAYoke() {
        System.out.println("Calling add a yoke");
    }

    private void printAllYokes() {
        System.out.println("Calling print all yokes");
    }
///////////////////////////////////////////////////////

}