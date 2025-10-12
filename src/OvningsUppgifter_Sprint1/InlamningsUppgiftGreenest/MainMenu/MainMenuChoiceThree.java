package OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.MainMenu;

import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Enums.LiquidSort;
import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants.Plants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceThree {

    public void menuChoiceThree(){
       try{
        PlantHotell plantHotell = new PlantHotell();
        Scanner scanner = new Scanner(System.in);
        double input;
        System.out.println("Hur stor är Meatloaf?");
        input = scanner.nextDouble();
        Plants olof = plantHotell.getPlantByName("Olof");
        System.out.println("Jag heter " + olof.getName() + " och jag behöver " + olof.getWateringNeeds(input) + " " + LiquidSort.KRANVATTEN.unit + LiquidSort.KRANVATTEN );

       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }

}
