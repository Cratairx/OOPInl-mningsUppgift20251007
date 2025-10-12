package OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants;

import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Enums.LiquidSort;



public class Palms extends Plants{ // Palms ärver Plants

     private double tapWater = 0.5;// inkapsling

     public Palms(String name, String plantType, LiquidSort liquidSort) {
        super(name, plantType,liquidSort);
    }

    @Override
    public double getWateringNeeds(double height){

        return  height * tapWater;
    }

    @Override
    public void printMe(){
        System.out.print("Mitt namn är " + getName() + " och jag är en " + getPlantType()+ ": ");
    }

}
