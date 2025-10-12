package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Enums.LiquidSort;
import InlamningsUppgiftGreenest.Plants.Plants;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceZero {
    private double input;// inkapsling

    public void mainMenuChoiceZero(){
        PlantHotell plantHotell = new PlantHotell();
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.printf("Hur stor är Laura? ");
            input = scanner.nextDouble();
            Plants laura =plantHotell.getPlantByName("Laura");
            System.out.println("Jag heter "+ laura.getName()+ " och jag behöver " + laura.getWateringNeeds(input) + LiquidSort.KRANVATTEN.unit + " " + LiquidSort.KRANVATTEN.liquidSorts);
            System.out.println("List print test "+plantHotell.plantsList.getFirst().toString());
        }catch (InputMismatchException e){
            System.out.println("Du måste skriva en siffra i meter.");
        }
    }

}
