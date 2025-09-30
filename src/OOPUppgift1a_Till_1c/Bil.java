package OOPUppgift1a_Till_1c;

public class Bil {

    private String regNumber;
    private String model;
    private String brand;
    //protected Bilägare bilägare;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Bil(String regNumber, String brand) {
        this.regNumber = regNumber;
        this.brand = brand;

    }
    public String getRegNumber() {
        return regNumber;
    }

   /* public Bilägare getBilägare() {

        return bilägare;
    }


    public void ownedBy(Bilägare newOwner){

     bilägare = newOwner;
    }






    public  void sellCar(){
        System.out.println(getBilägare()+ " Har sålt sin bil ");
        bilägare = null;


    }




    public void printCar(Bil bil){
        if (bil.getBilägare()== null){
            System.out.println(bil.getRegNumber() + " Does not have a owner and exists in a carlot");
        }else {
            System.out.println(bil.getRegNumber() + " is owned by " + bil.getBilägare());

        }


}*/
    @Override
    public String toString() {
        return getRegNumber() + " " + getBrand()  ;
    }
}
