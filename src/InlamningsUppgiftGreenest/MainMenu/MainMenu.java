package InlamningsUppgiftGreenest.MainMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {



    public void mainMenu(){
        while (true){
            System.out.println("Välj vilken växt du vill vattna ");
            System.out.println("Palmen Laura [0]");
            System.out.println("Palmen Olof [1]");
            System.out.println("Kaktusen Igge [2]");
            System.out.println("Köttätande meatloaf [3]");
            System.out.println("Alla växter [4]");
            System.out.println("Avsluta programmet [5]");

            Scanner scanner = new Scanner(System.in);

          try {
              int choice = scanner.nextInt();
              if (choice == 0) {
                  MainMenuChoiceZero menuChoiceZero = new MainMenuChoiceZero();
                  menuChoiceZero.mainMenuChoiceZero();

              } else if (choice == 1) {
                  MainMenuFirstChoice menuFirstChoice = new MainMenuFirstChoice();
                  menuFirstChoice.mainMenuFirstChoice();

              } else if (choice == 2) {
                  MainMenuChoiceTwo menuChoiceTwo = new MainMenuChoiceTwo();
                  menuChoiceTwo.menuChoiceTwo();

              } else if (choice == 3) {
                  MainMenuChoiceThree mainMenuChoiceThree = new MainMenuChoiceThree();
                  mainMenuChoiceThree.menuChoiceThree();
              }
              if (choice == 4) {
                  MainMenuChoiceFour menuChoiceFour = new MainMenuChoiceFour();
                  menuChoiceFour.MenuChoiceFour();

              } else if (choice == 5) {
                  System.out.println("Programmet Avslutades");
                  break;
              }

          }catch (InputMismatchException e){
              System.out.println("Du måste skriva en siffra.");
          }


        }
   }
}
