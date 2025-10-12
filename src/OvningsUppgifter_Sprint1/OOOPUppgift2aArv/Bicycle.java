package OvningsUppgifter_Sprint1.OOOPUppgift2aArv;

public class Bicycle extends Fordon implements Hjulburen {
    private int amountOfGears;
    private int gearRightNow;
    private int antalHjul;


    public Bicycle(int hastighet, int vikt, int amountOfGears, int gearRightNow) {
        super(hastighet, vikt);
        this.amountOfGears = amountOfGears;
        this.gearRightNow = gearRightNow;
    }

    public int changeGear(int gearRightNow) {
        System.out.println("Gear Changed to");
        this.gearRightNow = gearRightNow;
        return gearRightNow;
    }

    @Override
    public void printMe() {
        System.out.println("Den här cykeln har en hastighet på " + hastighet + " km/h med växeln " + gearRightNow + " med en vikt på " + vikt + "kg");
    }

    @Override
    public int getAntalhjul() {
        return 0;
    }
}
