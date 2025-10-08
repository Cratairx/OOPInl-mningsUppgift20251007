package InlamningsUppgiftGreenest.Plants;

import InlamningsUppgiftGreenest.Enums.LiquidSort;

import static InlamningsUppgiftGreenest.Enums.LiquidSort.MINERALVATTEN;

public class Cactuses extends Plants{
   public static final  Cactuses kaktusenIgge = new Cactuses("Igge","Kaktus",MINERALVATTEN);


    public Cactuses getKaktusenIgge() {
        return kaktusenIgge;
    }



    private double wateringInfo = 0.002;
    public Cactuses(String name, String plantType, LiquidSort liquidSort) {
        super(name, plantType, liquidSort);
    }


    @Override
    public double getWateringNeeds(double height) {
        return wateringInfo;
    }

    @Override
    public void printMe(){
        System.out.print("Mitt namn är " + getName() + " och jag är en " + getPlantType()+ ": ");
    }
}
