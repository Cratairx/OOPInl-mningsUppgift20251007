package OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.MainMenu;

import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants.Cactuses;
import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants.FleshEatingPlant;
import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants.Palms;
import OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Plants.Plants;

import java.util.ArrayList;
import java.util.List;

import static OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Enums.LiquidSort.*;

public class PlantHotell {


  protected List<Plants> plantsList = new ArrayList<>();

  public PlantHotell(){
      skapaPlantorTest();
  }

  protected void skapaPlantorTest(){
      plantsList.add( new Palms("Olof", "Palm", KRANVATTEN));
      plantsList.add( new Palms("Laura","Palm",KRANVATTEN));
      plantsList.add( new FleshEatingPlant("Meatloaf","Köttätandeväxt",PROTEINDRYCK));
      plantsList.add( new Cactuses("Igge","Kaktus",MINERALVATTEN));

  }
    public Plants getPlantByName(String name){
      for (Plants plant : plantsList){
          if (plant.getName().equalsIgnoreCase(name))
         return plant;
      }
      return null; // ändra här senare något exeception eller nått

    }

    @Override
    public String toString() {
        return " i to string";
    }
}
