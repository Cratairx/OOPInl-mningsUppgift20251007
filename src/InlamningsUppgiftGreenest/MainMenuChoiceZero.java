package InlamningsUppgiftGreenest;

import java.util.InputMismatchException;
import java.util.Scanner;

import static InlamningsUppgiftGreenest.LiquidSort.KRANVATTEN;

public class MainMenuChoiceZero {
    protected int x2 = 2;

    public void mainMenuChoiceZero(){

        try {
            Palms palmenLaura = new Palms("Laura", "Palm", KRANVATTEN);
            Scanner scanner = new Scanner(System.in);
            double input;
            System.out.printf("Hur stor är palmen? ");
            input = scanner.nextDouble();
            palmenLaura.printMe();// polymorfism
            System.out.println("Jag behöver ha " + palmenLaura.getWateringNeeds(input) + " Liter " + palmenLaura.getLiquidSort().liquidSorts + " om dagen");


        }catch (InputMismatchException e){
            System.out.println("Du måste skriva en siffra i meter.");
        }
    }

}
