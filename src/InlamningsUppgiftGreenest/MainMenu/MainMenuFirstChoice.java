package InlamningsUppgiftGreenest.MainMenu;
import InlamningsUppgiftGreenest.Plants.PlantHotell;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuFirstChoice {
   private double input; // inkapsling

    public void mainMenuFirstChoice(){

       try {
           PlantHotell palmenOlof = new PlantHotell();
           Scanner scanner = new Scanner(System.in);
           System.out.printf("Hur stor är Olof? ");
           input = scanner.nextDouble();
           palmenOlof.getPalmenOlof().printMe();// polymorfism
           System.out.println("Jag behöver ha " + palmenOlof.getPalmenOlof().getWateringNeeds(input) + " Liter "+palmenOlof.getPalmenOlof().getLiquidSort().liquidSorts + " om dagen");

       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }

    }
}
