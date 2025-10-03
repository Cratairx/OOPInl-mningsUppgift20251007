package InlamningsUppgiftGreenest;

public class Plants implements Printable{
    private String name;
    private String plantType;

    public Plants(String name, String plantType) {
        this.name = name;
        this.plantType = plantType;
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
}
