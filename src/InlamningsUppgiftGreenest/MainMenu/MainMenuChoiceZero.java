package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.Palms;

import java.util.InputMismatchException;
import java.util.Scanner;

import static InlamningsUppgiftGreenest.Enums.LiquidSort.KRANVATTEN;

public class MainMenuChoiceZero {
    private double input;

    public void mainMenuChoiceZero(){

        try {

            Palms palmenLaura = new Palms("Laura", "Palm", KRANVATTEN);// Jag har lagt in mina Enums i konstruktorn för att det inte ska gå att skriva in fel som felet nedan
           // Palms test = new Palms("Laura", "Palm","Coca Cola"); Här blir det error under Coca Cola för att det inte är en av mina Enums.
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Hur stor är palmen? ");
            input = scanner.nextDouble();
            palmenLaura.printMe();// polymorfism kallar på printMe i palm
            System.out.println("Jag behöver ha " + palmenLaura.getWateringNeeds(input) + " Liter " + palmenLaura.getLiquidSort().liquidSorts + " om dagen");


        }catch (InputMismatchException e){
            System.out.println("Du måste skriva en siffra i meter.");
        }
    }

}
