package OvningsUppgifter_Sprint2;

public class Triangle implements Figure{
    private int height;
    private int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
       return (getBase()* getHeight())/2;

        }


    @Override
    public double getCircumference() {

        double sida = Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getBase() / 2, 2));
        return Math.round( getBase() + 2 * sida);

    }



}
