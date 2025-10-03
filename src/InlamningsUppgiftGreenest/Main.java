package InlamningsUppgiftGreenest;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Palms palmenOlof = new Palms("Igge","Palm");
        Palms palmenLaura = new Palms("Laura","Palm");
        FleshEatingPlants meatLoaf = new FleshEatingPlants("Meatloaf","Fleshteatingplant");
        Plants[] allPlants = {palmenOlof, palmenLaura, meatLoaf};


        while (true){
            System.out.println("Välj vilken växt du vill vattna ");
            System.out.println("Palmen Laura [0]");
            System.out.println("Palmen Olof [1]");
            System.out.println("Palmen Igge [2]");
            System.out.println("Palmen Igge [3]");
            System.out.println("Alla växter [4]");
            System.out.println("Avsluta programmet [5]");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 0){
                System.out.printf("Hur stor är palmen? ");
                int input = scanner.nextInt();
                palmenLaura.printMe();
                System.out.println(" och jag behöver ha " + palmenLaura.getWateringNeeds(input) + " Liter kranvatten om dagen");


            } else if (choice == 1) {
                System.out.printf("Hur stor är palmen? ");
                int input = scanner.nextInt();
                palmenOlof.printMe();
                System.out.println(" och jag behöver ha " + palmenOlof.getWateringNeeds(input));

            } else if (choice == 3) {

            } else if (choice == 4) {
                // Polymorfism med interface
                for (Plants p : allPlants){
                    p.printMe();
                }

            } else if (choice == 5) {
                break;
            }


        }

    }
}
