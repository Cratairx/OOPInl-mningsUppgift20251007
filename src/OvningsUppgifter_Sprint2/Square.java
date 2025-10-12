package OvningsUppgifter_Sprint2;

public  class Square implements Figure{
  private int length;
    private int width;

    public double getLength() {
        return length;
    }

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getCircumference() {
    return getLength() * 2 + getWidth() *2;

    }
    @Override
    public double getArea(){
        return getWidth() * getLength();

    }
}
