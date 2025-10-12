package OvningsUppgifter_Sprint1.OOOPUppgift2aArv;

public class Train extends Fordon{
    protected int numberOfTrainCarriages;

    public Train(int hastighet, int vikt, int numberOfTrainCarriages) {
        super(hastighet, vikt);
        this.numberOfTrainCarriages = numberOfTrainCarriages;
    }

    public void attachTrainCarriage(int numberOfTrainCarriagesToAttach){
        System.out.println("Train carraige attached to train: ");
        numberOfTrainCarriages = numberOfTrainCarriages + numberOfTrainCarriagesToAttach;

    }

    @Override
    public void printMe() {
        System.out.println("Det här tåget har " + numberOfTrainCarriages + " vagnar och en vikt på " + vikt + " och kör med en hastighet på " + hastighet + "km/h");
    }


}
