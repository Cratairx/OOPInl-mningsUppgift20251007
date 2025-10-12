package OvningsUppgifter_Sprint1.OOOPUppgift2aArv;

public class Boat extends Fordon{
    private int deadWeight;

    public Boat(int hastighet, int vikt, int deadWeight) {
        super(hastighet, vikt);
        this.deadWeight = deadWeight;
    }

    public void turn(){

        System.out.println("Båten svänger");
    }

    @Override
    public void printMe() {
        System.out.println("Denna båt fordon har en dödvikt på " + deadWeight + " kg och kör med en hastighet på " + hastighet + " km/h med en vikt av " + vikt+ " kg");
    }


}
