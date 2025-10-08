package InlamningsUppgiftGreenest.Plants;
import InlamningsUppgiftGreenest.Enums.LiquidSort;

public class Cactuses extends Plants{

    private double wateringInfo = 0.002;// inkapsling

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
