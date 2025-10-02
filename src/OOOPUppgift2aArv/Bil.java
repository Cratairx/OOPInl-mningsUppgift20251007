package OOOPUppgift2aArv;

public class Bil extends Fordon implements Hjulburen{
    private int amountOfGears;
    private int gearRightNow;
    private int antalHjul;

    public Bil(int hastighet, int vikt, int amountOfGears, int gearRightNow) {
        super(hastighet, vikt);
        this.amountOfGears = amountOfGears;
        this.gearRightNow = gearRightNow;
    }



    public int changeGear(){

        System.out.println("Gear Changed to");
        return gearRightNow;
    }

    @Override
    public void printMe() {

        System.out.println("Den här bilen har " + amountOfGears + " växlar och kör med växel " + gearRightNow + " just nu." + " Bilen kör med hastigheten " + hastighet + " och har en vikt på " + vikt + "kg");
    }


    @Override
    public int getAntalhjul() {
        return 4;
    }
}
