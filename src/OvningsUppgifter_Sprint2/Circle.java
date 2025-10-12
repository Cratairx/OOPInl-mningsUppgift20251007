package OvningsUppgifter_Sprint2;

public class Circle implements Figure {
double radie;


    public Circle(double radie) {
        this.radie = radie;
    }

    public double getRadie() {
        return radie;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(getRadie(),2));
    }

    @Override
    public double getCircumference() {
        return Math.round( 2 * Math.PI * getRadie());
    }


}
