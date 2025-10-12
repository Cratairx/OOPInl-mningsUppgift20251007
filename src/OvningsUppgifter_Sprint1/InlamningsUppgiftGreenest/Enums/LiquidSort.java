package OvningsUppgifter_Sprint1.InlamningsUppgiftGreenest.Enums;

public enum LiquidSort {

    MINERALVATTEN(" mineralvatten"," Liter"),
    PROTEINDRYCK (" proteindryck"," Liter"),
    KRANVATTEN(" kranvatten", " Liter");


    public final String liquidSorts;
    public final String unit;

    LiquidSort(String liquidSort, String unit){
       this.liquidSorts = liquidSort;
       this.unit = unit;
    }

}
