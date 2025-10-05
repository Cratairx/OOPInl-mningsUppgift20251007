package InlamningsUppgiftGreenest;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import static InlamningsUppgiftGreenest.LiquidSort.KRANVATTEN;

public class MainMenuFirstChoice {
   private double input;

    public void mainMenuFirstChoice(){

       try {
           Palms palmenOlof = new Palms("Igge", "Palm", KRANVATTEN);
           Scanner scanner = new Scanner(System.in);
           System.out.printf("Hur stor är palmen? ");
           input = scanner.nextDouble();
           palmenOlof.printMe();// polymorfism
           System.out.println("Jag behöver ha " + palmenOlof.getWateringNeeds(input) + " Liter "+palmenOlof.getLiquidSort().liquidSorts + " om dagen");

       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }

    }
}
