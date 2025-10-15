package OvningsUppgifter_Sprint2.Övn8a_8b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ScannerReader
{


    public static void main(String[] args)
    {
        double totalSum = 0;


        String tempLine;
        // try with resources ska användas för att filen inte ska låsas
        List<Double> tempList = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("D:\\javamapp\\OOPUppgifter\\ReadThisFile.txt")))
        {

            double counter = 0;
            double lowestCounter;

            while ((scanner.hasNextLine())) {
                // lägg in en lista här med alla doubles från filen, gå igenom listan och räkna ut medel temp och högsta och lägsta värdet.
                String templineRead = scanner.nextLine().trim().replace(',', '.');
                tempList.add(Double.parseDouble(templineRead));
                // 0 == 13,5

            }


            for (int i = 0; i <tempList.size(); i++) {
                if (tempList.get(i) > counter){
                    counter = tempList.get(i);
                    System.out.println(counter);

                }



            }

            lowestCounter = counter; // denna måste vara här för att counter i for loopen ovan blir 17.5 och det är det vi vill att lowestCounter ska vara innan vi börjar med nästa for loop

            for (int i = 0; i <tempList.size(); i++) {
                if (tempList.get(i) < lowestCounter){
                    lowestCounter = tempList.get(i);
                    System.out.println(lowestCounter);


                }
                totalSum += tempList.get(i);

            }
            double avgTemp =  totalSum / tempList.size();
            System.out.println(totalSum);
            System.out.println(avgTemp);



        } catch (Exception e) {
            System.out.printf("Error");
        }

    }

}











