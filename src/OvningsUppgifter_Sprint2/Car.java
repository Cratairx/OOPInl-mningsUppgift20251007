package OvningsUppgifter_Sprint2;

public class Car {

    private double milePerYear;
    private double todaysMilage;
    private double literUsagePerMile;

   public Car(double milePerYear, double todaysMilage, double literUsagePerMile) {
        this.milePerYear = milePerYear;
        this.todaysMilage = todaysMilage;
        this.literUsagePerMile = literUsagePerMile;
    }

    public Car(){

    }

    public double getMilePerYear() {
        return milePerYear;
    }

    public double getTodaysMilage() {
        return todaysMilage;
    }

    public double getLiterUsagePerMile() {
        return literUsagePerMile;
    }

    public double getMilagePerYear(){
        return getMilePerYear();
    }

    public double getAvgMilagePerYear(){
        // har räknat fel här
        return (getMilagePerYear() + getLiterUsagePerMile())/ 2;

    }
    public void MångaMil(){


    }



}
