package InlamningsUppgiftGreenest.MainMenu;
import InlamningsUppgiftGreenest.Enums.LiquidSort;
import InlamningsUppgiftGreenest.Plants.Plants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuFirstChoice {
   private double input; // inkapsling

    public void mainMenuFirstChoice(){
    PlantHotell plantHotell = new PlantHotell();
       try {

           Scanner scanner = new Scanner(System.in);
           System.out.printf("Hur stor är Olof? ");
           input = scanner.nextDouble();
           Plants olof = plantHotell.getPlantByName("Olof");
           System.out.println("Jag heter " + olof.getName() + " jag behöver " + olof.getWateringNeeds(input) + LiquidSort.KRANVATTEN.unit +  LiquidSort.KRANVATTEN.liquidSorts);

       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }

    }
}
