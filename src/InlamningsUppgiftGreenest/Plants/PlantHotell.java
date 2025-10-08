package InlamningsUppgiftGreenest.Plants;

import static InlamningsUppgiftGreenest.Enums.LiquidSort.*;

public class PlantHotell {

  protected Palms palmenOlof = new Palms("Olof", "Palm", KRANVATTEN);// inkaspling
  protected Palms palmenLaura = new Palms("Laura","Palm",KRANVATTEN);// inkaspling
  protected FleshEatingPlant fleshEatingPlantMeatLoaf = new FleshEatingPlant("Meatloaf", "Köttätandeväxt", PROTEINDRYCK);// inkapsling
  protected Cactuses kaktusenIgge = new Cactuses("Igge","Kaktus",MINERALVATTEN);// inkapsling

    public Palms getPalmenOlof() {
        return palmenOlof;
    }

    public Palms getPalmenLaura() {
        return palmenLaura;
    }

    public FleshEatingPlant getFleshEatingPlantMeatLoaf() {
        return fleshEatingPlantMeatLoaf;
    }

    public Cactuses getKaktusenIgge() {
        return kaktusenIgge;
    }
}
