package OvningsUppgifter_Sprint2;


import java.util.Scanner;

public class CopyCat {

    public void copyCatPrinter(){



    }

    public void runCopyCat(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Skriv något i denna härmapa");
            String input =scanner.nextLine();

         if (input.equalsIgnoreCase("Exit")){

             break;
         }

          String result = "Du skrev " + input;
            System.out.println(result);


        }

    }



}
