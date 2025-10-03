package InlamningsUppgiftGreenest;
/*Palmen Laura, 5 meter hög

• Palmen Olof, 1 meter hög
Palmer: En palm behöver 0,5 liter kranvatten per dag * sin längd i meter. En palm som är 3
meter hög behöver alltså 0,5 * 3 = 1,5 liter vatten/dag.



*/
public class Palms extends Plants{
    double wateringNeeds;
      double tapWater = 0.5;
    public Palms(String name, String plantType) {
        super(name, plantType);
    }

    public void  waterInfo(){

    }
    public double getWateringNeeds(double height){
        wateringNeeds = height * tapWater;
        return wateringNeeds;
    }
    @Override
    public void printMe(){
        System.out.println("Mitt namn är " + getName() + " och jag är en " + getPlantType());
    }
}
