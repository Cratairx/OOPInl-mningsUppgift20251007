package InlamningsUppgiftGreenest.Plants;

import static InlamningsUppgiftGreenest.Enums.LiquidSort.*;

public class PlantHotell {


    Palms palmenOlof = new Palms("Olof", "Palm", KRANVATTEN);
    Palms palmenLaura = new Palms("Laura","Palm",KRANVATTEN);
    FleshEatingPlant fleshEatingPlantMeatLoaf = new FleshEatingPlant("Meatloaf", "Köttätandeväxt", PROTEINDRYCK);
    Cactuses cactusesenIgge = new Cactuses("Igge","Kaktus",MINERALVATTEN);

    public Palms getPalmenOlof() {
        return palmenOlof;
    }

    public Palms getPalmenLaura() {
        return palmenLaura;
    }

    public FleshEatingPlant getFleshEatingPlantMeatLoaf() {
        return fleshEatingPlantMeatLoaf;
    }

    public Cactuses getCactusesenIgge() {
        return cactusesenIgge;
    }
}
