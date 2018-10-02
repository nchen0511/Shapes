public class Ellipse extends Shape {
    private int axisA;
    private int axisB;
    public Ellipse(int axisA,int axisB)
    {
        super("Ellipse");
        this.axisA = axisA;
        this.axisB = axisB;
    }

    public double getArea()
    {
        return Math.PI *axisB * axisA;
    }
    public double getPerimeter()
    {
        return (Math.PI *(3*(axisA+axisB)-Math.sqrt((3*axisA +axisB)*(axisA + axisB *3))));
    }
}
