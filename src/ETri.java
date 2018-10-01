public class ETri extends Shape
{
    private int side;
    public ETri(int side)
    {
        super("equilateral triangle");
        this.side = side;


    }

    public double getArea()
    {
        return((side*side)/2);
    }
    public double getPerimeter()
    {
        return(side*3);
    }
}
