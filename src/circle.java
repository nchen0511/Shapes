public class circle extends shape {
    private int radius;

    public circle(int radius)
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
