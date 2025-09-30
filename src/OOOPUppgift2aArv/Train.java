package OOOPUppgift2aArv;

public class Train extends Fordon{
    protected int numberOfTrainCarriages;

    public Train(int hastighet, int vikt, int numberOfTrainCarriages) {
        super(hastighet, vikt);
        this.numberOfTrainCarriages = numberOfTrainCarriages;
    }

    public void attachTrainCarriage(){
        System.out.println("Train carraige attached to train: ");

    }

    @Override
    public void printMe() {
        System.out.println("Det här tåget har " + numberOfTrainCarriages + " vagnar och en vikt på " + vikt + " och kör med en hastighet på " + hastighet + "km/h");
    }
}
