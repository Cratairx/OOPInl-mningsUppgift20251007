package InlamningsUppgiftGreenest.Plants;

import InlamningsUppgiftGreenest.Enums.LiquidSort;
import InlamningsUppgiftGreenest.Interface.Printable;

public  abstract class Plants implements Printable {
    private String name; // inkappsling
    private String plantType;// inkappsling

    protected LiquidSort liquidSort; // här använder jag protected för att begränsa hur man kommer åt denna och använder mig av geLiquidSort nedan för att komma åt denna.

        public  Plants(String name, String plantType, LiquidSort liquidSort) {
        this.name = name;
        this.plantType = plantType;
        this.liquidSort = liquidSort;
    }

    public Plants() {

    }

    public String getName() {
        return name;
    }

    public String getPlantType() {
        return plantType;
    }
    // här är min orginal printMe som kan överskrivas (@Override) i klasser som ärver från denna tex Palms.
    @Override
    public void printMe(){
        System.out.println("Mitt namn är " + this.name + " och jag är en " + this.plantType);
    }

    public LiquidSort getLiquidSort(){
       return liquidSort;
    }


 // här skapade jag en egen polymorfism för att tvinga andra klasser att göra sina egna getWateringNeeds
    public abstract double getWateringNeeds(double height);



}
