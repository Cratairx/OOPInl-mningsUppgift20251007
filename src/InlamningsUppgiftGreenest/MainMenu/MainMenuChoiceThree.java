package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.FleshEatingPlant;
import InlamningsUppgiftGreenest.Enums.LiquidSort;
import InlamningsUppgiftGreenest.Plants.PlantHotell;
import InlamningsUppgiftGreenest.Plants.Plants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceThree {

    public void menuChoiceThree(){
       try{
           PlantHotell meatLoaf = new PlantHotell();
        Scanner scanner = new Scanner(System.in);
        double input;
        System.out.println("Hur stor är Meatloaf?");
        input = scanner.nextDouble();
        meatLoaf.getFleshEatingPlantMeatLoaf().printMe(); // polymorfism
        System.out.println("Jag behöver ha " + meatLoaf.getFleshEatingPlantMeatLoaf().getWateringNeeds(input) + " Liter " + meatLoaf.getFleshEatingPlantMeatLoaf().getLiquidSort().liquidSorts);


       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }

}
