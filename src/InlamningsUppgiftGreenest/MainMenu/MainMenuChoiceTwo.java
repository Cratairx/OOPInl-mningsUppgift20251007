package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.Cactuses;
import InlamningsUppgiftGreenest.Enums.LiquidSort;
import InlamningsUppgiftGreenest.Plants.PlantHotell;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceTwo {
   private double input;

    public void menuChoiceTwo(){
       try{
           //Cactuses kaktusenIgge = new Cactuses("Igge","Kaktus", LiquidSort.PROTEINDRYCK);
           PlantHotell kaktusenIgge = new PlantHotell();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur stor är kaktusen?");
        input = scanner.nextDouble();
        kaktusenIgge.getCactusesenIgge().printMe(); // polymorfism
        System.out.println("Jag behöver ha " + kaktusenIgge.getCactusesenIgge().getWateringNeeds(input) + "Liter " + kaktusenIgge.getCactusesenIgge().getLiquidSort().liquidSorts);
       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }
}
