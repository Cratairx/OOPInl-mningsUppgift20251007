package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.PlantHotell;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceZero {
    private double input;

    public void mainMenuChoiceZero(){

        try {
// git test

            PlantHotell palmenLaura =  new PlantHotell();
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Hur stor är Laura? ");
            input = scanner.nextDouble();
          palmenLaura.getPalmenLaura().printMe();// polymorfism kallar på printMe i palm
            System.out.println("Jag behöver ha " + palmenLaura.getPalmenLaura().getWateringNeeds(input) + " Liter " + palmenLaura.getPalmenLaura().getLiquidSort().liquidSorts + " om dagen");


        }catch (InputMismatchException e){
            System.out.println("Du måste skriva en siffra i meter.");
        }
    }

}
