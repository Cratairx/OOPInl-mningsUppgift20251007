package OOOPUppgift2aArv;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

   Bil bil = new Bil(50,500,6,4);
   Boat boat = new Boat(50,2000,1500);
   Train train = new Train(300,5000,12);
   Bicycle bicycle = new Bicycle(10,20,12,5);
   bil.printMe();
   boat.printMe();
   train.printMe();
   bicycle.printMe();

        System.out.println("array och list utskrifter nedan");
        System.out.println("Array utskrift");
        Fordon[] fordonsArray = new Fordon[4];
        fordonsArray[0]= bil;
        fordonsArray[1]= boat;
        fordonsArray[2] = train;
        fordonsArray[3] = bicycle;
        for (Fordon f : fordonsArray){
            f.printMe();
        }

        System.out.println("List utskrifter");
        List<Fordon> fordonList = new ArrayList<>();
        List<Fordon> fordonListLinked = new LinkedList<>();

        fordonList.add(bil);
        fordonList.add(boat);
        fordonList.add(train);
        fordonList.add(bicycle);

        fordonListLinked.add(bil);
        fordonListLinked.add(boat);
        fordonListLinked.add(train);
        fordonListLinked.add(bicycle);



        for (Fordon skrivUtLista : fordonList){
            skrivUtLista.printMe();
        }
        System.out.println("Utskrift linked list");
        for (Fordon skrivUtLinkedList : fordonListLinked){
            skrivUtLinkedList.printMe();
        }


        // kortar och snyggare sätt men den är då immutable lista.
        System.out.println("skriva ut mer lista");
        List<Fordon> merLista = List.of(train,bil,bicycle);
        for (Fordon skrivaUtmerLista : merLista){
            skrivaUtmerLista.printMe();
        }
        Hjulburen hb = new Bil(23,2000,6,2);
        List<Hjulburen> hjulFordon = new LinkedList<>();
        hjulFordon.add(bil);
        hjulFordon.add(bicycle);
        for (Hjulburen hj : hjulFordon){
            System.out.println("Antal hjul " + hj.getAntalhjul());
        }




    }

}


