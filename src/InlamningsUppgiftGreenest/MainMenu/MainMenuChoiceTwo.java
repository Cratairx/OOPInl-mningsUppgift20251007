package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.Cactuses;
import InlamningsUppgiftGreenest.Enums.LiquidSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceTwo {
   private double input;

    public void menuChoiceTwo(){
       try{ Cactuses kaktusenIgge = new Cactuses("Igge","Kaktus", LiquidSort.PROTEINDRYCK);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur stor är " + kaktusenIgge.getName()+"?");
        input = scanner.nextDouble();
        kaktusenIgge.printMe(); // polymorfism
        System.out.println("Jag behöver ha " + kaktusenIgge.getWateringNeeds(input) + "Liter " + kaktusenIgge.getLiquidSort().liquidSorts);
       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }
}
