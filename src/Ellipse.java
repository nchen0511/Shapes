public class Ellipse extends Shape {
    private int axisA;
    private int axisB;
    public Ellipse(int axisA,int axisB)
    {
        /**
         * Unlike the Circle, the ellipse requires 2 parameters, 1 for the major and 1 for the minor axis.
         */
        super("ellipse");
        this.axisA = axisA;
        this.axisB = axisB;
    }
    /**
     * The below returns the area and the circumference of the circle.
     * @return
     */
    public double getArea()
    {
        return Math.PI *axisB * axisA;
    }
    public double getPerimeter()
    {
        return (Math.PI *(3*(axisA+axisB)-Math.sqrt((3*axisA +axisB)*(axisA + axisB *3))));
    }
}
