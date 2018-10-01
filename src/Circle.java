public class Circle extends Shape {
    private int radius;

    public Circle(int radius)
    {
        super("circle");
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI *radius * radius;
    }
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}
