package InlamningsUppgiftGreenest.Enums;

public enum LiquidSort {

    MINERALVATTEN("Mineralvatten"),
    PROTEINDRYCK ("Proteindryck"),
    KRANVATTEN("Kranvatten");
    public final String liquidSorts;
    LiquidSort(String liquidSort){
       this.liquidSorts = liquidSort;
    }


}
