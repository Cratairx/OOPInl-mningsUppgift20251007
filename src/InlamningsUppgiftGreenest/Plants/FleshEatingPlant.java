package InlamningsUppgiftGreenest.Plants;


import InlamningsUppgiftGreenest.Enums.LiquidSort;

public class FleshEatingPlant extends Plants{ // FleshEatingPlant ärver Plants

    private double basLevelProteinShake = 0.1;// inkapsling
    private double proteinExtra = 0.2;// inkapsling
    protected double wateringNeeds;// inkapsling

    public FleshEatingPlant(String name, String plantType, LiquidSort liquidSort) {
        super(name, plantType,liquidSort);
    }

    @Override
    public double getWateringNeeds(double height){
        return wateringNeeds =  basLevelProteinShake + (proteinExtra * height);
    }

    @Override
    public void printMe(){
        System.out.print("Mitt namn är " + getName() + " och jag är en " + getPlantType()+ ": ");
    }


}
