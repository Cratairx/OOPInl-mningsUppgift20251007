package InlamningsUppgiftGreenest;
/* Köttätande växter: Dessa behöver alltid en basnivå av 0,1 liter proteindryck per dag och
sedan ett extra tillskott med 0,2 liter proteindryck * sin längd i meter. En köttätande växt
som är 50 cm hög behöver alltså 0,1 + (0,2*0,5) = 0,2 liter proteindryck/dag. */



public class FleshEatingPlant extends Plants{

double basLevelProteinShake = 0.1;


    public FleshEatingPlant(String name, String plantType) {
        super(name, plantType);
    }
}
