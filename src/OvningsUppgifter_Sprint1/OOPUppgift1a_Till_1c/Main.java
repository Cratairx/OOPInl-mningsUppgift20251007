package OvningsUppgifter_Sprint1.OOPUppgift1a_Till_1c;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {


        Bil bil1 = new Bil("PLF 533", "KIA");
        Bil bil2 = new Bil("YDC 856", "BMW");
        Bil bil3 = new Bil("YJP 654", "Audi");

        Bilägare bilägare1 = new Bilägare("Daniel", "Inserte","Rosgatan 7", 40,bil1);
        Bilägare bilägare2 = new Bilägare("Simon", "Mollander", "adressvägen 2", 26,bil2);

        bilägare1.buyCar(bilägare2, bilägare1);
        // deta funkar men vill att det ska stå som den undre utkommenterade.
       // bilägare1.buyCar(bil1,bilägare2);
        System.out.println(bilägare2.getBil());
        System.out.println(bilägare1.getBil());





      /* bil1.ownedBy(bilägare1);
        bil2.ownedBy(bilägare2);

        bil1.printCar(bil1);
        bil1.sellCar();
        bil1.printCar(bil1);
        bil1.buyCar(bilägare2);
        bil1.printCar(bil1);
        bil2.printCar(bil2);
        bil3.printCar(bil3);
        bil3.buyCar(bilägare1);
        bil3.printCar(bil3);*/










    }

    }


