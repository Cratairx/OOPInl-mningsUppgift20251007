package OOOPUppgift2aArv;

public class Bicycle extends Fordon{
    private int amountOfGears;
    private int gearRightNow;

    public Bicycle(int hastighet, int vikt, int amountOfGears, int gearRightNow) {
        super(hastighet, vikt);
        this.amountOfGears = amountOfGears;
        this.gearRightNow = gearRightNow;
    }

    public int changeGear(int gearRightNow){
        System.out.println("Gear Changed to");
        this.gearRightNow = gearRightNow;
        return gearRightNow;
    }

    @Override
    public void printMe() {
        System.out.println("Den här cykeln har en hastighet på " +hastighet + " km/h med växeln " + gearRightNow + " med en vikt på " + vikt+ "kg");
    }
}
