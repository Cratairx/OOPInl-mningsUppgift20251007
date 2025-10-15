package OvningsUppgifter_Sprint2.Övn8a_8b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TempReader {
    // förstå strömmar osv ordentligt fungerar exakt på samma sätt som nätverkstrafik som kommer senare i kursen i sprint 4
    // vi måste skilja på in och utströmmar logiska namn., in är in och ut är ut :D in är från och ut är till skulle jag säga.
    // de vikta klasserna från videon är.  InputStream är den viktiga, det finns flera strömmar att använda men ingenting vi behöver kunna helt. ObjectInputStream är bra i nätverksprogrammering
    // BufferedInputStream är en filterStream

    public static void main(String[] args) {
        double totalSum = 0;

    Locale.setDefault(Locale.US);
    String tempLine;
    // try with resources ska användas för att filen inte ska låsas
        List<Double> tempList = new ArrayList<>();
    try(
    BufferedReader bufferedReader = new BufferedReader(new FileReader("ReadThisFile.txt")))


    {
        double counter = 0;
        double lowestCounter;

        while ((tempLine = bufferedReader.readLine()) != null) {
           // lägg in en lista här med alla doubles från filen, gå igenom listan och räkna ut medel temp och högsta och lägsta värdet.
            String templineRead = tempLine.trim().replace(',', '.');
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

        }
    catch (Exception e){
        System.out.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
}
}




















