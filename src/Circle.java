public class Circle extends Shape {
    private int radius;

    public Circle(int radius)
    {
        /**
         * The super refers back to the parent class, Shape which allows the type to be assigned as Circle.
         */
        super("circle");
        this.radius = radius;
    }

    /**
     * The below returns the area and the circumference of the circle.
     * @return
     */
    public double getArea()
    {
        return Math.PI *radius * radius;
    }
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
