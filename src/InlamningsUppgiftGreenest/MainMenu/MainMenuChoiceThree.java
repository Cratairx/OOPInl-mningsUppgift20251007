package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.FleshEatingPlant;
import InlamningsUppgiftGreenest.Enums.LiquidSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceThree {

    public void menuChoiceThree(){
       try{ FleshEatingPlant meatLoaf = new FleshEatingPlant("Meatloaf","Köttätande växt", LiquidSort.PROTEINDRYCK);
        Scanner scanner = new Scanner(System.in);
        double input;
        System.out.println("Hur stor är " + meatLoaf.getName()+"?");
        input = scanner.nextDouble();
        meatLoaf.printMe(); // polymorfism
        System.out.println("Jag behöver ha " + meatLoaf.getWateringNeeds(input) + " Liter " + meatLoaf.getLiquidSort().liquidSorts);


       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }

}
