package InlamningsUppgiftGreenest;

public  abstract class Plants implements Printable{
    private String name;
    private String plantType;

    protected LiquidSort liquidSort;

    public  Plants(String name, String plantType, LiquidSort liquidSort) {
        this.name = name;
        this.plantType = plantType;
        this.liquidSort = liquidSort;
    }

    public String getName() {
        return name;
    }

    public String getPlantType() {
        return plantType;
    }
    public void printMe(){
        System.out.println("Mitt namn är " + this.name + " och jag är en " + this.plantType);
    }
    public LiquidSort getLiquidSort(){
       return liquidSort;
    }



    public abstract double getWateringNeeds(double height);



}
