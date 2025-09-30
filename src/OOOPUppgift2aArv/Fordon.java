package OOOPUppgift2aArv;

import com.sun.source.tree.BreakTree;

public class Fordon {
    protected int hastighet;
    protected int vikt;

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public void changeSpeed(int hastighet){
        this.hastighet = hastighet;

    }

    public void printMe(){

        System.out.println("Detta fordon har en vikt på " + this.vikt + " kg och kör just med hastigheten " + this.hastighet + " km/h");
    }

    @Override
    public String toString() {

        return "Testar overDrive toString metoden lägg in vettig utskrift här";
    }
}
