package InlamningsUppgiftGreenest;

public class Cactuses extends Plants{
//  Kaktusar: Varje kaktus ska ha 2 cl mineralvatten/dag, oberoende av kaktusens storlek.
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
