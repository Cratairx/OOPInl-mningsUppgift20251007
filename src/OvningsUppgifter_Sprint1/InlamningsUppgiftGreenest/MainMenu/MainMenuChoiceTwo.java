package OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.MainMenu;
import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Enums.LiquidSort;
import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants.Plants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceTwo {
   private double input;// inkapsling

    public void menuChoiceTwo(){
       try{

       PlantHotell plantHotell = new PlantHotell();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur stor är kaktusen?");
        input = scanner.nextDouble();
        Plants igge = plantHotell.getPlantByName("Igge");
           System.out.println("Jag heter "+ igge.getName() + " Och jag behöver " + igge.getWateringNeeds(input)+ LiquidSort.KRANVATTEN + " " + LiquidSort.KRANVATTEN.unit);

       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }
}
