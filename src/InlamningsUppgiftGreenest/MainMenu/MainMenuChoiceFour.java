package InlamningsUppgiftGreenest.MainMenu;

import InlamningsUppgiftGreenest.Plants.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static InlamningsUppgiftGreenest.Enums.LiquidSort.*;

public class MainMenuChoiceFour {


    public void MenuChoiceFour(){
        PlantHotell hotellGuests = new PlantHotell();
        Plants[] allPlants = {hotellGuests.getPalmenLaura(), hotellGuests.getPalmenOlof(), hotellGuests.getFleshEatingPlantMeatLoaf(),hotellGuests.getCactusesenIgge()};

       try{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> heights = new ArrayList<>();
        for (Plants p : allPlants){
            System.out.println("Hur stor är " + p.getName()+ "?");
            double height = scanner.nextDouble();
            heights.add(height);
            p.getWateringNeeds(height);

        }
        for (int i = 0; i < allPlants.length; i++) {
            allPlants[i].printMe();
            System.out.printf( "Jag behöver "+ allPlants[i].getWateringNeeds(heights.get(i))+ " Liter "+ allPlants[i].getLiquidSort().liquidSorts+". \n");
        }
       }catch (InputMismatchException e){
           System.out.println("Du måste skriva en siffra i meter.");
       }


       }

    }
