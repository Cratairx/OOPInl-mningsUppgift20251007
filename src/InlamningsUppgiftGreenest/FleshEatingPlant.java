package InlamningsUppgiftGreenest;


public class FleshEatingPlant extends Plants{

    private double basLevelProteinShake = 0.1;
    private double proteinExtra = 0.2;
    protected double wateringNeeds;

    public FleshEatingPlant(String name, String plantType,LiquidSort liquidSort) {
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
