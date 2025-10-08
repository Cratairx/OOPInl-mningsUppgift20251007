package InlamningsUppgiftGreenest.MainMenu;
import InlamningsUppgiftGreenest.Plants.PlantHotell;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuChoiceTwo {
   private double input;// inkapsling

    public void menuChoiceTwo(){
       try{

        PlantHotell kaktusenIgge = new PlantHotell();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur stor är kaktusen?");
        input = scanner.nextDouble();
        kaktusenIgge.getKaktusenIgge().printMe(); // polymorfism
        System.out.println("Jag behöver ha " + kaktusenIgge.getKaktusenIgge().getWateringNeeds(input) + " Liter " + kaktusenIgge.getKaktusenIgge().getLiquidSort().liquidSorts);
       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }
    }
}
