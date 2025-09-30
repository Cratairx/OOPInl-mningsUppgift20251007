package OOPUppgift1a_Till_1c;

public class Bilägare extends Person {

    private Bil bil;

    // lägg til bil i bilägare konstruktorn.
    public Bilägare(String namn, String efterNamn, String adress, int age, Bil bil) {
        super(namn, efterNamn, adress, age);
        this.bil = bil;
    }

public Bilägare buyCar(Bilägare nyBilägare, Bilägare oldbildägare){
        if (nyBilägare == null){
            System.out.println(nyBilägare + " köper bilen av Bilfirman");
        }else {
            System.out.println(nyBilägare + " köper bilen "+ getBil() + " av "  + this.getNamn() + " " + this.getEfterNamn());
             //bil = nyBilägare.getBil(); // denna köper sin egna bil ska köpa annan bil
            bil = oldbildägare.getBil();
        } return nyBilägare;
    }
    public Bil getBil() {
        return bil;
    }

}






