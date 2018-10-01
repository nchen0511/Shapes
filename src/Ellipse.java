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
        return 2 * Math.PI * radius;
    }
}
