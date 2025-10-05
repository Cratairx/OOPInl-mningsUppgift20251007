package InlamningsUppgiftGreenest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static InlamningsUppgiftGreenest.LiquidSort.*;

public class MainMenuChoiceFour {

    public void MenuChoiceFour(){
        Palms palmenOlof = new Palms("Olof","Palm", KRANVATTEN); // här sätter jag mitt enum värde "Kranvatten"
        Palms palmenLaura = new Palms("Laura","Palm", KRANVATTEN);
        FleshEatingPlant meatLoaf = new FleshEatingPlant("Meatloaf","Köttätande växt",PROTEINDRYCK);
        Cactuses kaktusenIgge = new Cactuses("Igge","Kaktus",MINERALVATTEN);
        Plants[] allPlants = {palmenOlof, palmenLaura, meatLoaf,kaktusenIgge};

       try{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> heights = new ArrayList<>();
        for (Plants p : allPlants){
            System.out.println("Hur stor är " + p.getName()+ "?");
            heights.add(scanner.nextDouble());
            p.getWateringNeeds(heights.getFirst());
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
